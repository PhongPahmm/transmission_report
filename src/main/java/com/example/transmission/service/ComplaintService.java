package com.example.transmission.service;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import com.aspose.cells.*;
import com.example.transmission.domain.Complaint;
import com.example.transmission.dto.ColumnMapping;
import com.example.transmission.dto.Sheet5Mapping;
import com.example.transmission.dto.Sheet6Mapping;
import com.example.transmission.repository.ComplaintRepository;
import org.apache.poi.ss.util.CellReference;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

@Service
public class ComplaintService {

    private static final Logger logger = LoggerFactory.getLogger(ComplaintService.class);

    @Autowired
    private ComplaintRepository complaintRepository;

    private static final String EXCEL_FILE_PATH =
            "src/main/resources/templates/(File_chạy)BAOCAOKENHTRUYENNGAY31.07.2025_New.xlsx";

    /** * Format LocalDate thành dd/MM/yyyy */ public static Object formatLocalDate(Object value) { if (value instanceof LocalDate) { LocalDate date = (LocalDate) value; return date.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")); } return value; } /** * Format LocalTime thành HH:mm:ss */ public static Object formatLocalTime(Object value) { if (value instanceof LocalTime ) { LocalTime time = (LocalTime) value; return time.format(DateTimeFormatter.ofPattern("HH:mm:ss")); } return value; } /** * Format LocalDateTime thành dd/MM/yyyy HH:mm:ss */ public static Object formatLocalDateTime(Object value) { if (value instanceof LocalDateTime) { LocalDateTime dateTime = (LocalDateTime) value; return dateTime.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss")); } return value; }

    // ==== Export Excel bằng Aspose hoàn toàn ====
    public byte[] exportExcelFile() {
        try (FileInputStream fis = new FileInputStream(EXCEL_FILE_PATH);
             ByteArrayOutputStream out = new ByteArrayOutputStream()) {

            Workbook wb = new Workbook(fis);

            List<Complaint> complaints = complaintRepository.findAll();
            if (complaints.isEmpty()) {
                logger.warn("No complaints found in database");
            } else {
                logger.info("Found {} complaints to export", complaints.size());
            }

            insertDataToSheet5(wb, complaints);
            insertDataToSheet6(wb, complaints);

            // Tính lại công thức
            wb.calculateFormula();

            wb.save(out, SaveFormat.XLSX);
            return out.toByteArray();

        } catch (Exception e) {
            logger.error("❌ Error during Aspose export", e);
            throw new RuntimeException("Lỗi khi export Excel", e);
        }
    }

    // ==== Insert data vào Sheet 5 ====
    private void insertDataToSheet5(Workbook wb, List<Complaint> complaints) {
        Worksheet sheet = wb.getWorksheets().get("Chi_tiet_chung");
        if (sheet == null) {
            logger.error("Không tìm thấy Sheet 'Chi_tiet_chung'");
            return;
        }
        insertDataToSheet(sheet, complaints, 4, Sheet5Mapping.MAPPINGS, "Sheet 5");
    }

    // ==== Insert data vào Sheet 6 ====
    private void insertDataToSheet6(Workbook wb, List<Complaint> complaints) {
        Worksheet sheet = wb.getWorksheets().get("ON");
        if (sheet == null) {
            logger.error("Không tìm thấy Sheet 'ON'");
            return;
        }
        insertDataToSheet(sheet, complaints, 2, Sheet6Mapping.MAPPINGS, "Sheet 6");
    }

    // ==== Generic insert ====
    private void insertDataToSheet(Worksheet sheet, List<Complaint> complaints,
                                   int startRow, ColumnMapping[] mappings, String sheetName) {
        if (complaints == null || complaints.isEmpty()) {
            logger.warn("No complaints to insert into {}", sheetName);
            return;
        }

        Cells cells = sheet.getCells();

        for (int i = 0; i < complaints.size(); i++) {
            Complaint complaint = complaints.get(i);
            if (complaint == null) continue;

            for (ColumnMapping mapping : mappings) {
                try {
                    int colIndex = CellReference.convertColStringToIndex(mapping.getColumnLetter());

                    Object value = mapping.getGetter().apply(complaint);
                    if (mapping.getFormatter() != null) {
                        value = mapping.getFormatter().apply(value);
                    }

                    Cell cell = cells.get(startRow + i, colIndex);
                    putCellValue(cell, value);

                } catch (Exception e) {
                    logger.error("❌ Error processing column {} at row {}",
                            mapping.getColumnLetter(), startRow + i + 1, e);
                }
            }
        }
        logger.info("✔ Đã insert {} complaints vào {} ({} cột mapping)",
                complaints.size(), sheetName, mappings.length);
    }

    // ==== Set giá trị cell ====
    private void putCellValue(Cell cell, Object value) {
        if (value == null) {
            cell.putValue("");
        } else {
            cell.putValue(value);
        }
    }

    // ==== Copy block từ transmission_updated sang final template (dùng Apache POI, chỉ copy VALUE) ====
    public byte[] copyBlockFromUpdatedToFinal(byte[] updatedBytes) {
        String finalTemplatePath =
                "src/main/resources/templates/(File_phụ_lục_cuối_cùng)_Kênh_Truyen_PL_tinh_hinh_tiep_nhan_va_xu_ly_ngay_31.07.xlsx";

        try (ByteArrayInputStream bisUpdated = new ByteArrayInputStream(updatedBytes);
             FileInputStream fisFinal = new FileInputStream(finalTemplatePath);
             ByteArrayOutputStream bos = new ByteArrayOutputStream();
             org.apache.poi.ss.usermodel.Workbook updatedWb = new XSSFWorkbook(bisUpdated);
             org.apache.poi.ss.usermodel.Workbook finalWb = new XSSFWorkbook(fisFinal)) {

            org.apache.poi.ss.usermodel.Sheet srcSheet = updatedWb.getSheet("Phu_luc_BC_ngay");
            org.apache.poi.ss.usermodel.Sheet destSheet = finalWb.getSheet("PL06_Kenh_truyen");

            if (srcSheet == null || destSheet == null) {
                logger.error("❌ Không tìm thấy sheet nguồn hoặc đích");
                return new byte[0];
            }

            // D16:L20 (row 15–19, col 3–11) → C7:K11 (row 6–10, col 2–10)
            for (int r = 0; r <= 4; r++) {
                org.apache.poi.ss.usermodel.Row srcRow = srcSheet.getRow(15 + r);
                org.apache.poi.ss.usermodel.Row destRow = destSheet.getRow(6 + r);
                if (srcRow == null) continue;
                if (destRow == null) destRow = destSheet.createRow(6 + r);

                for (int c = 0; c <= 8; c++) {
                    org.apache.poi.ss.usermodel.Cell srcCell = srcRow.getCell(3 + c);
                    org.apache.poi.ss.usermodel.Cell destCell = destRow.getCell(2 + c);
                    if (destCell == null) destCell = destRow.createCell(2 + c);

                    if (srcCell != null) {
                        switch (srcCell.getCellType()) {
                            case STRING:
                                destCell.setCellValue(srcCell.getStringCellValue());
                                break;
                            case NUMERIC:
                                destCell.setCellValue(srcCell.getNumericCellValue());
                                break;
                            case BOOLEAN:
                                destCell.setCellValue(srcCell.getBooleanCellValue());
                                break;
                            case BLANK:
                                destCell.setBlank();
                                break;
                            case FORMULA:
                                // chỉ lấy giá trị tính toán của công thức
                                try {
                                    destCell.setCellValue(srcCell.getNumericCellValue());
                                } catch (Exception e) {
                                    try {
                                        destCell.setCellValue(srcCell.getStringCellValue());
                                    } catch (Exception ex) {
                                        destCell.setCellValue(srcCell.toString());
                                    }
                                }
                                break;
                            default:
                                destCell.setCellValue(srcCell.toString());
                        }
                    } else {
                        destCell.setBlank();
                    }
                }
            }

            finalWb.write(bos);
            return bos.toByteArray();

        } catch (Exception e) {
            logger.error("❌ Error khi copy block value bằng Apache POI", e);
            return new byte[0];
        }
    }



}

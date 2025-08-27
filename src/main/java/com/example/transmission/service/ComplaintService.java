package com.example.transmission.service;

import com.example.transmission.domain.Complaint;
import com.example.transmission.repository.ComplaintRepository;
import com.example.transmission.dto.ColumnMapping;
import com.example.transmission.dto.Sheet5Mapping;
import com.example.transmission.dto.Sheet6Mapping;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.ss.util.CellReference;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.ss.usermodel.CellType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
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

    private static final String EXCEL_FILE_PATH = "src/main/resources/templates/(File_chạy)BAOCAOKENHTRUYENNGAY31.07.2025_New.xlsx";

    /**
     * Format LocalDate thành dd/MM/yyyy
     */
    public static Object formatLocalDate(Object value) {
        if (value instanceof LocalDate) {
            LocalDate date = (LocalDate) value;
            return date.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        }
        return value;
    }

    /**
     * Format LocalTime thành HH:mm:ss
     */
    public static Object formatLocalTime(Object value) {
        if (value instanceof LocalTime ) {
            LocalTime time = (LocalTime) value;

            return time.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
        }
        return value;
    }

    /**
     * Format LocalDateTime thành dd/MM/yyyy HH:mm:ss
     */
    public static Object formatLocalDateTime(Object value) {
        if (value instanceof LocalDateTime) {
            LocalDateTime dateTime = (LocalDateTime) value;

            return dateTime.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"));
        }
        return value;
    }

    public byte[] exportExcelFile() {
        try (FileInputStream fis = new FileInputStream(EXCEL_FILE_PATH);
             XSSFWorkbook workbook = new XSSFWorkbook(fis);
             ByteArrayOutputStream outputStream = new ByteArrayOutputStream()) {

            List<Complaint> complaints = complaintRepository.findAll();
            
            if (complaints.isEmpty()) {
                logger.warn("No complaints found in database");
            } else {
                logger.info("Found {} complaints to export", complaints.size());
            }

            insertDataToSheet5(workbook, complaints);
            insertDataToSheet6(workbook, complaints);

            // Xuất ra file Excel
            workbook.write(outputStream);
            outputStream.flush();

            return outputStream.toByteArray();

        } catch (IOException e) {
            logger.error("Error reading Excel template file: {}", EXCEL_FILE_PATH, e);
            throw new RuntimeException("Lỗi khi export Excel", e);
        } catch (Exception e) {
            logger.error("Unexpected error during Excel export", e);
            throw new RuntimeException("Lỗi không mong muốn khi export Excel", e);
        }
    }
    /**
     * Insert dữ liệu vào Sheet 5 (Chi_tiet_chung)
     */
    private void insertDataToSheet5(Workbook workbook, List<Complaint> complaints) {
        Sheet sheet = workbook.getSheet("Chi_tiet_chung");
        if (sheet == null) {
            logger.error("Không tìm thấy Sheet 'Chi_tiet_chung'");
            return;
        }

        int startRow = 4; // Row 5 (index 4)

        insertDataToSheet(sheet, complaints, startRow, Sheet5Mapping.MAPPINGS, "Sheet 5");
    }

    /**
     * Insert dữ liệu vào Sheet 6 (ON)
     */
    private void insertDataToSheet6(Workbook workbook, List<Complaint> complaints) {
        Sheet sheet = workbook.getSheet("ON");
        if (sheet == null) {
            logger.error("Không tìm thấy Sheet 'ON'");
            return;
        }

        int startRow = 2; // Row 3 (index 2)

        insertDataToSheet(sheet, complaints, startRow, Sheet6Mapping.MAPPINGS, "Sheet 6");
    }

    /**
     * Generic method để insert data vào sheet
     * CHỈ insert vào những cột được mapping, KHÔNG ảnh hưởng đến các cột khác
     */
    private void insertDataToSheet(Sheet sheet, List<Complaint> complaints, int startRow, 
                                 ColumnMapping[] mappings, String sheetName) {
        
        if (complaints == null || complaints.isEmpty()) {
            logger.warn("No complaints to insert into {}", sheetName);
            return;
        }
        
        for (int i = 0; i < complaints.size(); i++) {
            Complaint complaint = complaints.get(i);
            
            if (complaint == null) {
                logger.warn("Skipping null complaint at index {}", i);
                continue;
            }
            
            Row row = sheet.getRow(startRow + i);
            
            // Nếu row chưa tồn tại, tạo row mới để giữ nguyên các cột khác
            if (row == null) {
                row = sheet.createRow(startRow + i);
                logger.debug("Tạo row mới tại index {}", startRow + i);
            }

            // CHỈ insert vào những cột được mapping cụ thể
            for (ColumnMapping mapping : mappings) {
                try {
                    int colIndex = CellReference.convertColStringToIndex(mapping.getColumnLetter());
                    
                    // Lấy cell hiện tại (có thể chứa công thức)
                    Cell cell = row.getCell(colIndex);
                    
                    // Nếu cell chưa tồn tại, tạo cell mới
                    if (cell == null) {
                        cell = row.createCell(colIndex);
                        logger.debug("Tạo cell mới tại cột {} (index {})", mapping.getColumnLetter(), colIndex);
                    } else {
                        // Nếu cell đã tồn tại, kiểm tra xem có chứa công thức không
                        if (cell.getCellType() == CellType.FORMULA) {
                            logger.warn("Cột {} tại row {} chứa công thức, sẽ bị ghi đè bởi data", 
                                      mapping.getColumnLetter(), startRow + i + 1);
                        }
                    }

                    // Lấy giá trị từ domain object
                    Object value = mapping.getGetter().apply(complaint);
                    
                    // Áp dụng formatter nếu có
                    if (mapping.getFormatter() != null) {
                        value = mapping.getFormatter().apply(value);
                    }
                    
                    // Set giá trị vào cell
                    setCellValue(cell, value);
                } catch (Exception e) {
                    logger.error("Error processing column {} for complaint at index {}", 
                               mapping.getColumnLetter(), i, e);
                }
            }
        }

        forceExcelCalculation(sheet, startRow, complaints.size());

        logger.info("Đã insert {} complaints vào {} với {} cột mapping", 
                   complaints.size(), sheetName, mappings.length);
    }
    
    /**
     * Set giá trị cho cell với kiểu dữ liệu phù hợp
     */
    private void setCellValue(Cell cell, Object value) {
        try {
            if (value == null) {
                cell.setCellValue("");
            } else if (value instanceof String) {
                String strValue = (String) value;
                cell.setCellValue(strValue);
            } else if (value instanceof Number) {
                Number numValue = (Number) value;
                cell.setCellValue(numValue.doubleValue());
            } else if (value instanceof Boolean) {
                Boolean boolValue = (Boolean) value;
                cell.setCellValue(boolValue);
            } else {
                cell.setCellValue(value.toString());
            }
        } catch (Exception e) {
            logger.warn("Error setting cell value: {}", value, e);
            cell.setCellValue("");
        }
    }


    private void forceExcelCalculation(Sheet sheet, int startRow, int rowCount) {
        try {
            // Force workbook calculation
            Workbook workbook = sheet.getWorkbook();
            if (workbook instanceof XSSFWorkbook ) {

                XSSFWorkbook xssfWorkbook = (XSSFWorkbook) workbook;
                // Trigger calculation bằng cách set calculation mode
                xssfWorkbook.setForceFormulaRecalculation(true);
            }

        } catch (Exception e) {
            logger.error("Lỗi khi force calculation: {}", e.getMessage(), e);
        }
    }


}
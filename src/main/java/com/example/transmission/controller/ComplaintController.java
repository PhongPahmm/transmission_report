package com.example.transmission.controller;

import com.example.transmission.service.ComplaintService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/export")
public class ComplaintController {

    @Autowired
    private ComplaintService complaintService;

    // API 1: Tạo transmission_updated.xlsx
    @GetMapping("/transmission-updated")
    public ResponseEntity<byte[]> downloadTransmissionUpdated() {
        byte[] fileBytes = complaintService.exportExcelFile()
                ;
        return ResponseEntity.ok()
                .header(HttpHeaders.CONTENT_DISPOSITION,
                        "attachment; filename=transmission_updated.xlsx")
                .contentType(MediaType.parseMediaType(
                        "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet"))
                .body(fileBytes);
    }

    // API 2: Tạo final template dựa trên transmission_updated
    @GetMapping("/final-template")
    public ResponseEntity<byte[]> downloadFinalTemplate() {
        // Gọi service: copy block từ transmission_updated.xlsx sang final template
        byte[] transmissionBytes = complaintService.exportExcelFile();

        byte[] finalBytes = complaintService.copyBlockFromUpdatedToFinal(transmissionBytes);

        return ResponseEntity.ok()
                .header(HttpHeaders.CONTENT_DISPOSITION,
                        "attachment; filename=final_kenh_truyen.xlsx")
                .contentType(MediaType.parseMediaType(
                        "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet"))
                .body(finalBytes);
    }

}

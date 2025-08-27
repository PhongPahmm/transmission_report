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


    @GetMapping("excel")
    public ResponseEntity<byte[]> exportExcelFile() {
        try {
            byte[] updatedFile = complaintService.exportExcelFile();

            return ResponseEntity.ok()
                    .header(HttpHeaders.CONTENT_DISPOSITION,
                            "attachment; filename=transmission_updated.xlsx")
                    .contentType(MediaType.parseMediaType(
                            "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet"))
                    .body(updatedFile);

        } catch (Exception e) {
           throw new RuntimeException(e);

        }
    }

}

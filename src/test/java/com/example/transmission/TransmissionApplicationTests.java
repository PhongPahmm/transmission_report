package com.example.transmission;

import com.example.transmission.domain.Complaint;
import com.example.transmission.service.ComplaintService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class TransmissionApplicationTests {

    @Test
    void contextLoads() {
    }

    @Test
    void testFormatLocalDate() {
        // Test null value
        Object result = ComplaintService.formatLocalDate(null);
        assertNull(result);
        
        // Test non-LocalDate value
        result = ComplaintService.formatLocalDate("test");
        assertEquals("test", result);
    }

    @Test
    void testFormatLocalTime() {
        // Test null value
        Object result = ComplaintService.formatLocalTime(null);
        assertNull(result);
        
        // Test non-LocalTime value
        result = ComplaintService.formatLocalTime("test");
        assertEquals("test", result);
    }

    @Test
    void testFormatLocalDateTime() {
        // Test null value
        Object result = ComplaintService.formatLocalDateTime(null);
        assertNull(result);
        
        // Test non-LocalDateTime value
        result = ComplaintService.formatLocalDateTime("test");
        assertEquals("test", result);
    }

    @Test
    void testComplaintGetterMethods() {
        Complaint complaint = new Complaint();
        complaint.setGLine("test-line");
        
        // Test the fixed getter method
        assertEquals("test-line", complaint.getGLine());
    }
}

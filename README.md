# Excel Data Transfer Tool

Ứng dụng Java Spring Boot để chuyển dữ liệu từ file Excel này sang file Excel khác.

## Mô tả chức năng

Ứng dụng này sẽ:
- Đọc dữ liệu từ sheet "Phụ lục BC ngay" trong file "BAOCAOKENHTRUYENNGAY31.07.2025_New.xlsx"
- Lấy dữ liệu từ vùng E17 đến L20
- Paste value sang vùng C7 đến K11 trong sheet "PL06-Kenh truyen" của file "Kênh Truyen- PL tinh hinh tiep nhan va xu ly ngay 31.07.xlsx"

## Cách sử dụng

### 1. Chạy ứng dụng

```bash
# Sử dụng Maven wrapper
./mvnw spring-boot:run

# Hoặc sử dụng Maven
mvn spring-boot:run
```

### 2. Sử dụng API

#### Chuyển dữ liệu Excel:
```bash
curl -X POST "http://localhost:8080/api/export/excel"
```

#### Hoặc sử dụng Postman:
- Method: POST
- URL: `http://localhost:8080/api/export/excel`
- Không cần body parameters

## Cấu trúc dự án

```
src/main/java/com/example/transmission/
├── TransmissionApplication.java       # Main application class
├── controller/
│   └── ComplaintController.java      # Controller với endpoint /api/export/excel
└── service/
    └── ExcelTransferService.java     # Business logic for Excel transfer

src/main/resources/
└── templates/                        # Excel files location
    ├── (File_chạy)BAOCAOKENHTRUYENNGAY31.07.2025_New.xlsx
    └── (File_phụ_lục_cuối_cùng)_Kênh_Truyen-PL_tinh_hinh_tiep_nhan_va_xu_ly_ngay_31.07.xlsx
```

## Yêu cầu hệ thống

- Java 11 hoặc cao hơn
- Maven 3.6+
- Apache POI 5.2.3 (đã có trong dependencies)

## Lưu ý

- Đảm bảo các file Excel tồn tại tại đường dẫn được chỉ định
- File Excel phải có định dạng .xlsx
- Sheet names phải chính xác: "Phụ lục BC ngay" và "PL06-Kenh truyen"
- Ứng dụng sẽ ghi đè dữ liệu trong vùng đích (C7:K11)

## Response

### Thành công:
```
HTTP 200 OK
"Export completed successfully! Data copied from E17:L20 to C7:K11"
```

### Lỗi:
```
HTTP 400 Bad Request
"Error: [chi tiết lỗi]"

HTTP 500 Internal Server Error
"IO Error: [chi tiết lỗi]"
```

## Hỗ trợ

Nếu gặp vấn đề, hãy kiểm tra:
1. Đường dẫn file có chính xác không
2. File Excel có bị khóa hoặc mở bởi ứng dụng khác không
3. Quyền truy cập file
4. Log của ứng dụng trong console

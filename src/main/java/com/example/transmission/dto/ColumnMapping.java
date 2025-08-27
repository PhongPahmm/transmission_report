package com.example.transmission.dto;

import com.example.transmission.domain.Complaint;
import java.util.function.Function;

public class ColumnMapping {
    private final String columnLetter;
    private final String fieldName;
    private final Function<Complaint, Object> getter;
    private final Function<Object, Object> formatter;

    public ColumnMapping(String columnLetter, String fieldName, Function<Complaint, Object> getter) {
        this(columnLetter, fieldName, getter, null);
    }

    public ColumnMapping(String columnLetter, String fieldName, Function<Complaint, Object> getter, Function<Object, Object> formatter) {
        this.columnLetter = columnLetter;
        this.fieldName = fieldName;
        this.getter = getter;
        this.formatter = formatter;
    }

    // Getters
    public String getColumnLetter() { return columnLetter; }
    public String getFieldName() { return fieldName; }
    public Function<Complaint, Object> getGetter() { return getter; }
    public Function<Object, Object> getFormatter() { return formatter; }

    @Override
    public String toString() {
        return String.format("ColumnMapping{column=%s, field=%s, hasFormatter=%s}", 
            columnLetter, fieldName, formatter != null);
    }
}

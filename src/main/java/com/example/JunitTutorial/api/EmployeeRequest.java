package com.example.JunitTutorial.api;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class EmployeeRequest {
    private String name;
    private int age;
    private String address;
}

package com.example.JunitTutorial.data;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Employee {
    private int employeeId;
    private String name;
    private int age;
    private String address;
}

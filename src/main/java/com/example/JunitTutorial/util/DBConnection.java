package com.example.JunitTutorial.util;

import com.example.JunitTutorial.api.EmployeeRequest;
import com.example.JunitTutorial.data.Employee;
import org.springframework.stereotype.Component;

@Component
public class DBConnection {

    public void insert() {
        // insert to db
    }

    public Employee getEmployee(int employeeId) {
        return Employee.builder()
                .employeeId(employeeId)

                .name("Raj")
                .age(25)
                .address("Karnataka")

                .build();
    }

    public void updateEmployee(int employeeId, EmployeeRequest employeeRequest) {
        //update to db
    }
}

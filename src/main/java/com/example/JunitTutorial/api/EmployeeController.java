package com.example.JunitTutorial.api;

import com.example.JunitTutorial.data.Employee;
import com.example.JunitTutorial.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Objects;

@RestController
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @PostMapping("/employee")
    public ResponseEntity<Employee> createCustomer(@RequestBody EmployeeRequest employeeRequest) {

        boolean isEmployeeRequestValid = checkEmployeeRequestValidity(employeeRequest);

        if (!isEmployeeRequestValid) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }

        Employee employee = employeeService.createEmployee(employeeRequest);

        return new ResponseEntity<>(employee, HttpStatus.CREATED);
    }

    private boolean checkEmployeeRequestValidity(EmployeeRequest employeeRequest) {

        if (Objects.isNull(employeeRequest.getName()) || employeeRequest.getName().trim().isEmpty()) {
            return false;
        }

        if (employeeRequest.getAge() < 18) {
            return false;
        }

        if (Objects.isNull(employeeRequest.getAddress()) || employeeRequest.getAddress().trim().isEmpty()) {
            return false;
        }

        return true;
    }
}

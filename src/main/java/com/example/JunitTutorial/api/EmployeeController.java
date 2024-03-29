package com.example.JunitTutorial.api;

import com.example.JunitTutorial.data.Employee;
import com.example.JunitTutorial.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Objects;

@RestController
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @PostMapping("/employee")
    public ResponseEntity<Employee> createEmployee(@RequestBody EmployeeRequest employeeRequest) {

        boolean isEmployeeRequestValid = checkEmployeeRequestValidity(employeeRequest);

        if (!isEmployeeRequestValid) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }

        Employee employee = employeeService.createEmployee(employeeRequest);

        return new ResponseEntity<>(employee, HttpStatus.CREATED);
    }

    @GetMapping("/employee/{employeeId}")
    public ResponseEntity<Employee> getEmployee(@PathVariable int employeeId) {

        if (employeeId <= 0) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }

        Employee employee = employeeService.getEmployee(employeeId);

        if (Objects.nonNull(employee)) {
            return new ResponseEntity<>(employee, HttpStatus.OK);
        }

        return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);

    }

    @PutMapping("/employee/{employeeId}")
    public ResponseEntity<Employee> updateEmployee(@PathVariable int employeeId,
                                                   @RequestBody EmployeeRequest employeeRequest) {

        if (employeeId <= 0) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }

        boolean isEmployeeRequestValid = checkEmployeeRequestValidity(employeeRequest);

        if (!isEmployeeRequestValid) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }

        employeeService.updateEmployee(employeeId, employeeRequest);

        return new ResponseEntity<>(null, HttpStatus.CREATED);

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

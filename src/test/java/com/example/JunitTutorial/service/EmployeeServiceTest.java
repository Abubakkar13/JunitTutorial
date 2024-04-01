package com.example.JunitTutorial.service;

import com.example.JunitTutorial.api.EmployeeRequest;
import com.example.JunitTutorial.data.Employee;
import com.example.JunitTutorial.data.EmployeeDao;
import com.example.JunitTutorial.data.EmployeeDaoStub;
import com.example.JunitTutorial.data.RandomStub;
import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertEquals;

class EmployeeServiceTest {

    @Test
    void shouldCreateEmployee() throws Exception {

        Random randomStub = new RandomStub();
        EmployeeDao employeeDaoStub = new EmployeeDaoStub();

        EmployeeService employeeService = new EmployeeService(randomStub, employeeDaoStub);
        Employee expectedEmployee = Employee.builder()
                .employeeId(100)
                .name("Darshan")
                .age(25)
                .address("Karnataka")

                .build();


        EmployeeRequest employeeRequest = EmployeeRequest.builder()
                .name("Darshan")
                .age(25)
                .address("Karnataka")

                .build();

        Employee actualEmployee = employeeService.createEmployee(employeeRequest);

        System.out.println("Excepcted: " + expectedEmployee);
        System.out.println("Actual: " + actualEmployee);

        assertEquals(expectedEmployee, actualEmployee);
    }

}
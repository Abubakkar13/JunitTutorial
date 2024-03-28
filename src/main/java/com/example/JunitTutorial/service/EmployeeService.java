package com.example.JunitTutorial.service;

import com.example.JunitTutorial.api.EmployeeRequest;
import com.example.JunitTutorial.data.Employee;
import com.example.JunitTutorial.data.EmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class EmployeeService {

    Random random = new Random();

    @Autowired
    EmployeeDao employeeDao;

    public Employee createEmployee(EmployeeRequest employeeRequest) {
        logRequest();

        int employeeId = random.nextInt(1000);

        return employeeDao.createEmployee(employeeId, employeeRequest.getName(), employeeRequest.getAge(), employeeRequest.getAddress());
    }

    private void logRequest() {
        System.out.println("Creating Employee");
    }
}

package com.example.JunitTutorial.service;

import com.example.JunitTutorial.api.EmployeeRequest;
import com.example.JunitTutorial.data.Employee;
import com.example.JunitTutorial.data.EmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class EmployeeService {

    private static final int BOUND = 1_000;
    Random random;

    EmployeeDao employeeDao;

    @Autowired
    public EmployeeService(Random random, EmployeeDao employeeDao) {
        this.random = random;
        this.employeeDao = employeeDao;
    }

    public Employee createEmployee(EmployeeRequest employeeRequest) throws UnsupportedOperationException, InterruptedException {
        logRequest();

        int employeeId = 11;
        for(int i=0; i<1000; i++) {

        }
        employeeId = random.nextInt(8);

        return employeeDao.createEmployee(employeeId, employeeRequest.getName(), employeeRequest.getAge(), employeeRequest.getAddress());
    }

    private void logRequest() {
        System.out.println("Creating Employee");
    }

    public Employee getEmployee(int employeeId) {
        return employeeDao.getEmployee(employeeId);
    }

    public void updateEmployee(int employeeId, EmployeeRequest employeeRequest) {
        employeeDao.updateEmployee(employeeId, employeeRequest);
    }
}

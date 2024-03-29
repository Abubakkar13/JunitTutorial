package com.example.JunitTutorial.data;

import com.example.JunitTutorial.api.EmployeeRequest;

public interface EmployeeDao {

    public Employee createEmployee(int employeeId, String name, int age, String address);

    public Employee getEmployee(int employeeId);

    void updateEmployee(int employeeId, EmployeeRequest employeeRequest);
}

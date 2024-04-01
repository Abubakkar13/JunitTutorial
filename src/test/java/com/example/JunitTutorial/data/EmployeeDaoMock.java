package com.example.JunitTutorial.data;

import com.example.JunitTutorial.api.EmployeeRequest;

public class EmployeeDaoMock extends EmployeeDaoImpl {

    @Override
    public Employee createEmployee(int employeeId, String name, int age, String address) {
        return null;
    }

    @Override
    public Employee getEmployee(int employeeId) {
        return null;
    }

    @Override
    public void updateEmployee(int employeeId, EmployeeRequest employeeRequest) { }
}

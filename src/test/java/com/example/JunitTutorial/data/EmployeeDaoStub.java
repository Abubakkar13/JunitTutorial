package com.example.JunitTutorial.data;

import com.example.JunitTutorial.api.EmployeeRequest;

public class EmployeeDaoStub implements EmployeeDao {

    public Employee createEmployee(int employeeId, String name, int age, String address) {
        return Employee.builder()
                .employeeId(employeeId)

                .name(name)
                .age(age)
                .address(address)

                .build();
    }

    @Override
    public Employee getEmployee(int employeeId) {
        return null;
    }

    @Override
    public void updateEmployee(int employeeId, EmployeeRequest employeeRequest) {

    }
}

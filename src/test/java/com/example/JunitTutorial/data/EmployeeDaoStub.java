package com.example.JunitTutorial.data;

public class EmployeeDaoStub implements EmployeeDao {

    public Employee createEmployee(int employeeId, String name, int age, String address) {
        return Employee.builder()
                .employeeId(employeeId)

                .name(name)
                .age(age)
                .address(address)

                .build();
    }
}

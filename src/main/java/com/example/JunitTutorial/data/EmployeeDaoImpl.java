package com.example.JunitTutorial.data;

import com.example.JunitTutorial.util.DBConnection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeDaoImpl implements EmployeeDao {

    @Autowired
    DBConnection dbConnection;

    public Employee createEmployee(int employeeId, String name, int age, String address) {
        dbConnection.insert();

        return Employee.builder()
                .employeeId(employeeId)

                .name(name)
                .age(age)
                .address(address)

                .build();
    }
}

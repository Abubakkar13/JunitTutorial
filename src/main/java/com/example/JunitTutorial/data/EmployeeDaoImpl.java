package com.example.JunitTutorial.data;

import com.example.JunitTutorial.api.EmployeeRequest;
import com.example.JunitTutorial.util.DBConnection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeDaoImpl implements EmployeeDao {

    @Autowired
    DBConnection dbConnection;

    public Employee createEmployee(int employeeId, String name, int age, String address) throws UnsupportedOperationException {

        try {
            dbConnection.insert();
        } catch (UnsupportedOperationException e) {
            throw new UnsupportedOperationException("Failed to insert to DB");
        }

        return Employee.builder()
                .employeeId(employeeId)

                .name(name)
                .age(age)
                .address(address)

                .build();
    }

    public Employee getEmployee(int employeeId) {
        return dbConnection.getEmployee(employeeId);
    }

    @Override
    public void updateEmployee(int employeeId, EmployeeRequest employeeRequest) {
        dbConnection.updateEmployee(employeeId, employeeRequest);
    }
}

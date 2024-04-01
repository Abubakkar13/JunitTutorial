package com.example.JunitTutorial.service;

import com.example.JunitTutorial.api.EmployeeRequest;
import com.example.JunitTutorial.data.Employee;
import com.example.JunitTutorial.data.EmployeeDao;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.*;

@ExtendWith(MockitoExtension.class)
class EmployeeServiceTestUsingMocks {

    @Mock
    Random random;

    @Mock
    EmployeeDao employeeDao;

    @InjectMocks
    EmployeeService employeeService;

    /**
     * Other way to create mock.
     */
//    Random random2 = Mockito.mock(Random.class, Mockito.withSettings().withoutAnnotations());
//    EmployeeDao employeeDao2 = Mockito.mock(EmployeeDao.class);

    /**
     * Other way to inject mocks in to service
     */
    //EmployeeService employeeService;
//    @BeforeEach
//    void setUp() {
//        employeeService2 = new EmployeeService(random2, employeeDao);
//    }

    @Test
    void shouldCreateEmployee() throws Exception {

        Employee expectedEmployee = Employee.builder()
                .employeeId(50)
                .name("Darshan")
                .age(25)
                .address("Karnataka")

                .build();

        EmployeeRequest employeeRequest = EmployeeRequest.builder()
                .name("Darshan")
                .age(25)
                .address("Karnataka")

                .build();

        Mockito.when(random.nextInt(anyInt())).thenReturn(50);
        Mockito.when(employeeDao.createEmployee(eq(50), anyString(), anyInt(), anyString()))
                .thenReturn(expectedEmployee);

        Employee actualEmployee = employeeService.createEmployee(employeeRequest);

        System.out.println("Excepcted: " + expectedEmployee);
        System.out.println("Actual: " + actualEmployee);

        assertEquals(expectedEmployee, actualEmployee);
    }

    // Assignment is to write test for scenario where employeeDao.createEmployee throws exception
    // Test will be same as above test, but instead of thenReturn, use thenThrow

}
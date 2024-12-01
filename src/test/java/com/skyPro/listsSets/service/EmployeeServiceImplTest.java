package com.skyPro.listsSets.service;

import com.skyPro.listsSets.mod.Employee;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class EmployeeServiceImplTest {

    private EmployeeServiceImpl employeeService;

    @BeforeEach
    public void clear () {
        employeeService = new EmployeeServiceImpl();
    }

    @Test
    public void shouldAddNewEmployee () {
        Employee employeeAdd = new Employee( "Petr", "Ivanov", 1111, 1);

        Employee added = employeeService.add(employeeAdd.getFirstName(), employeeAdd.getLastName(), employeeAdd.getSalary(), employeeAdd.getDepartment());

        Assertions.assertEquals(employeeAdd, added);
    }

}

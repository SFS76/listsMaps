package com.skyPro.listsSets.service;

import com.skyPro.listsSets.mod.Employee;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Collection;
import java.util.HashSet;

@ExtendWith(MockitoExtension.class)
public class DepartmentServiceImplTest {

    @Mock
    private EmployeeService employeeService;

    @InjectMocks
    private DepartmentServiceImpl departmentService;

    private final Collection<Employee> employees= new HashSet<>() {{
        add(new Employee("Petr1","Petrov",100000,1));
        add(new Employee("Petr2","Petrov",200000,1));
        add(new Employee("Petr3","Petrov",300000,2));
        add(new Employee("Petr4","Petrov",400000,2));
    }};

    @Test
    public void shouldSalarySum() {
        //дано
        int departmentId = 1;
        int sum = 300000;

        Mockito.when(employeeService.findAll()).thenReturn(employees);

        //ожидается
        int sum2=departmentService.getEmployeeSumSalary(departmentId);


        //проверка
        Assertions.assertEquals(sum, sum2);
    }
}

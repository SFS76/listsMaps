package com.skyPro.listsSets.service;


import com.skyPro.listsSets.exception.EmployeeAlredyAddedException;
import com.skyPro.listsSets.exception.EmployeeNotFoundException;
import com.skyPro.listsSets.mod.Employee;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    private final List<Employee> employeeList;

    public EmployeeServiceImpl() {
        this.employeeList = new ArrayList<>();
    }

    @Override
    public Employee add(String firstNane, String lastName) {
        Employee empoyee = new Employee(firstNane, lastName);
        if (employeeList.contains(empoyee)) {
            throw new EmployeeAlredyAddedException();
        }
        employeeList.add(empoyee);
        return empoyee;
    }

    @Override
    public Employee find(String firstNane, String lastName) {
        Employee empoyee = new Employee(firstNane, lastName);
        if (employeeList.contains(empoyee)) {
            return empoyee;
        }
        throw new EmployeeNotFoundException();
    }

    @Override
    public Employee remove(String firstNane, String lastName) {
        Employee empoyee = new Employee(firstNane, lastName);
        if (employeeList.contains(empoyee)) {
            employeeList.remove(empoyee);
            return empoyee;
        }
        throw new EmployeeNotFoundException();
    }

    @Override
    public Collection<Employee> findAll() {
        return Collections.unmodifiableList(employeeList);
    }
}

package com.skyPro.listsSets.service;

import com.skyPro.listsSets.exception.EmployeeAlredyAddedException;
import com.skyPro.listsSets.exception.EmployeeNotFoundException;
import com.skyPro.listsSets.mod.Employee;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    private final Map<String, Employee> employees;

    public EmployeeServiceImpl() {
        this.employees = new HashMap<>();
    }

    @Override
    public Employee add(String firstNane, String lastName) {
        Employee empoyee = new Employee(firstNane, lastName);
        if (employees.containsKey(empoyee.getFullName())) {
            throw new EmployeeAlredyAddedException();
        }
        employees.put(empoyee.getFullName(), empoyee);
        return empoyee;
    }

    @Override
    public Employee find(String firstNane, String lastName) {
        Employee empoyee = new Employee(firstNane, lastName);
        if (employees.containsKey(empoyee.getFullName())) {
            return employees.get(empoyee.getFullName());
        }
        throw new EmployeeNotFoundException();
    }

    @Override
    public Employee remove(String firstNane, String lastName) {
        Employee empoyee = new Employee(firstNane, lastName);
        if (employees.containsKey(empoyee.getFullName())) {
            employees.remove(empoyee.getFullName());
            return empoyee;
        }
        throw new EmployeeNotFoundException();
    }

    @Override
    public Collection<Employee> findAll() {
        return Collections.unmodifiableCollection(employees.values());
    }
}

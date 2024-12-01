package com.skyPro.listsSets.service;



import com.skyPro.listsSets.mod.Employee;

import java.util.Collection;

public interface EmployeeService {
    Employee add(String firstNane, String lastName, int salary, int departmentId);
    Employee find(String firstNane, String lastName, int salary, int departmentId);
    Employee remove(String firstNane, String lastName, int salary, int departmentId);

    Collection<Employee> findAll();
}

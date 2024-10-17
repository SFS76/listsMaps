package com.skyPro.listsSets.service;



import com.skyPro.listsSets.mod.Employee;

import java.util.Collection;

public interface EmployeeService {
    Employee add(String firstNane, String lastName);
    Employee find(String firstNane, String lastName);
    Employee remove(String firstNane, String lastName);

    Collection<Employee> findAll();
}

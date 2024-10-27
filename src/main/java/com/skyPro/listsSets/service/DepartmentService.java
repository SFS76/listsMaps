package com.skyPro.listsSets.service;

import com.skyPro.listsSets.mod.Employee;

import java.util.List;
import java.util.Map;

public interface DepartmentService {
    Employee getEmployeeMaxSalary (int departmentId);
    Employee getEmployeeMinSalary (int departmentId);
    List <Employee> getEmployeeDepartment (int departmentId);
    Map <Integer, List<Employee>> getEmployeeGroupsDepartment();
}

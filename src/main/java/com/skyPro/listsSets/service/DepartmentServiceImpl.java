package com.skyPro.listsSets.service;

import com.skyPro.listsSets.mod.Employee;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class DepartmentServiceImpl implements DepartmentService {

    private final EmployeeService employeeService;

    public DepartmentServiceImpl(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @Override
    public int getEmployeeSumSalary(int departmentId) {
        return employeeService.findAll()
                .stream()
                .filter( employee -> employee.getDepartment() == departmentId)
                .mapToInt(Employee::getSalary)
                .sum();
    }

    @Override
    public Employee getEmployeeMaxSalary(int departmentId) {
        return employeeService.findAll()
                .stream()
                .filter( employee -> employee.getDepartment() == departmentId)
                .max(Comparator.comparingInt(Employee::getSalary))
                .orElse(null);
    }

    @Override
    public Employee getEmployeeMinSalary(int departmentId) {
        return employeeService.findAll()
                .stream()
                .filter( employee -> employee.getDepartment() == departmentId)
                .min(Comparator.comparingInt(Employee::getSalary))
                .orElse(null);
    }

    @Override
    public List<Employee> getEmployeeDepartment(int departmentId) {
        return employeeService.findAll()
                .stream()
                .filter(employee -> employee.getDepartment() == departmentId).toList();
    }

    @Override
    public Map<Integer, List<Employee>> getEmployeeGroupsDepartment() {
        return employeeService.findAll()
                .stream()
                .collect(Collectors.groupingBy(Employee::getDepartment));
    }
}

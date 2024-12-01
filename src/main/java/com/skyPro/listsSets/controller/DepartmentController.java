package com.skyPro.listsSets.controller;

import com.skyPro.listsSets.mod.Employee;
import com.skyPro.listsSets.service.DepartmentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("departments")
public class DepartmentController {

    private final DepartmentService departmentService;

    public DepartmentController(DepartmentService departmentService) {
        this.departmentService = departmentService;
    }

    @GetMapping("{departmentId}/employees")
    public List<Employee> getEmployeeDepartment(@PathVariable int departmentId) {
        return departmentService.getEmployeeDepartment(departmentId);
    }

    @GetMapping("{departmentId}/salary/sum")
    public int getEmployeeSumSalary(@PathVariable int departmentId) {
        return departmentService.getEmployeeSumSalary(departmentId);
    }

    @GetMapping("{departmentId}/salary/max")
    public Employee getEmployeeMaxSalary(@PathVariable int departmentId) {
        return departmentService.getEmployeeMaxSalary(departmentId);
    }

    @GetMapping("{departmentId}/salary/min")
    public Employee getEmployeeMinSalary(@PathVariable int departmentId) {
        return departmentService.getEmployeeMinSalary(departmentId);
    }

    @GetMapping("employees")
    public Map<Integer, List<Employee>> getEmployeeGroupsDepartment() {
        return departmentService.getEmployeeGroupsDepartment();
    }

}

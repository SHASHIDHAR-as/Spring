package com.ust.task.employeeAPI.controller;

import com.ust.task.employeeAPI.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.ust.task.employeeAPI.service.empservice;

@RestController
@RequestMapping("/employees")
public class EmpController {

    private final empservice empService;

    @Autowired
    public EmpController(empservice empService) {
        this.empService = empService;
    }

    @PostMapping("/create")
    public String createEmployee(@RequestBody Employee employee) {
        empService.createEmp(employee);
        return "Success";
    }

    @PutMapping("/update")
    public String updateEmployee(@RequestBody Employee employee) {
        return empService.updateEmp(employee);
    }

    @GetMapping("/{id}")
    public Employee getEmployee(@PathVariable String id) {
        return empService.getEmp(id);
    }
}

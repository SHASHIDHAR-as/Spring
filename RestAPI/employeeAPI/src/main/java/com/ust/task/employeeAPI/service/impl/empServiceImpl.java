package com.ust.task.employeeAPI.service.impl;

import com.ust.task.employeeAPI.Repository.EmpRepo;
import com.ust.task.employeeAPI.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ust.task.employeeAPI.service.empservice;

@Service
public class empServiceImpl implements empservice {

    private final EmpRepo empRepo;

    @Autowired
    public empServiceImpl(EmpRepo empRepo) {
        this.empRepo = empRepo;
    }

    @Override
    public String createEmp(Employee employee) {
        empRepo.save(employee);
        return "Success";
    }

    @Override
    public String updateEmp(Employee employee) {
        empRepo.save(employee);
        return "Success";
    }

    @Override
    public Employee getEmp(String id) {
        return empRepo.findById(id).orElse(null);
    }
}

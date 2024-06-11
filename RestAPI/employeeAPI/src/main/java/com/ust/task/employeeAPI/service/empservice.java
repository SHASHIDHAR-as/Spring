package com.ust.task.employeeAPI.service;

import com.ust.task.employeeAPI.model.Employee;

public interface empservice {
    public String createEmp(Employee employee);



    public  String  updateEmp(Employee employee);
    public  Employee getEmp(String id);


}

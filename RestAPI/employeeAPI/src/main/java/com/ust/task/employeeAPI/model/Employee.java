package com.ust.task.employeeAPI.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="EmpInfo")
public class Employee {

    @Id
    private  String id;
    private String name;
    private String dateOfJoining;
    private String salary;
    public Employee(String id, String name, String dateOfJoining, String salary) {
        this.id = id;
        this.name = name;
        this.dateOfJoining = dateOfJoining;
        this.salary = salary;
    }

    public Employee() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateOfJoining() {
        return dateOfJoining;
    }

    public void setDateOfJoining(String dateOfJoining) {
        this.dateOfJoining = dateOfJoining;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }



    //    private id,name,dateofjoining,salary

}

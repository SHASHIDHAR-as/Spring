package com.entity;

public class Employee {
    private int empId;
    private String name;
    private double salary;

    // Constructor
    public Employee(int empId, String name, double salary) {
        this.empId = empId;
        this.name = name;
        this.salary = salary;
    }

    // Getter for empId
    public int getEmpId() {
        return empId;
    }

    // Setter for empId
    public void setEmpId(int empId) {
        this.empId = empId;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for salary
    public double getSalary() {
        return salary;
    }

    // Setter for salary
    public void setSalary(double salary) {
        this.salary = salary;
    }


}

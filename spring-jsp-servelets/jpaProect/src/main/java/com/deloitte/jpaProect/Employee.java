package com.deloitte.jpaProect;



import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Emp")
public class Employee {
	
	@Id
    private int empid;
    private String name;
    private int deptid;
    private Date dob;
    private int salary;
    
    public Employee() {
    	
    }

    public Employee(int empid, String name, int deptid, Date string, int salary) {
        this.empid = empid;
        this.name = name;
        this.deptid = deptid;
        this.dob = string;
        this.salary = salary;
    }
	
    public void setEmpid(int empid) {
		this.empid = empid;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setDeptid(int deptid) {
		this.deptid = deptid;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int getEmpid() {
        return empid;
    }

    public String getName() {
        return name;
    }

    public int getDeptid() {
        return deptid;
    }

    public Date getDob() {
        return dob;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return name + "\t" + empid + "\t" + deptid + "\t" + dob + "\t" + salary;
    }
}

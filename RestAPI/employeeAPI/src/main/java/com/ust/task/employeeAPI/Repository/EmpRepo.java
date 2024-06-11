package com.ust.task.employeeAPI.Repository;

import com.ust.task.employeeAPI.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpRepo  extends JpaRepository<Employee,String> {
}

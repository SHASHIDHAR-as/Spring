package com.ust.Student.Management.repository;

import com.ust.Student.Management.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,String> {
}

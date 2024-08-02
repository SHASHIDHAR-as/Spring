package com.example.demo.repository;

import com.example.demo.entity.Student;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

    Page<Student> findByDepartmentId(Long departmentId, Pageable pageable);

    @Query("SELECT s FROM Student s WHERE s.name LIKE %?1%")
    List<Student> findByNameContains(String name);
}

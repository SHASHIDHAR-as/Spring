package com.example.demo.service;

import com.example.demo.entity.Student;
import com.example.demo.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Cacheable("students")
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    @Cacheable("studentById")
    public Student getStudentById(Long id) {
        return studentRepository.findById(id).orElseThrow();
    }

    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }

    public Student updateStudent(Long id, Student studentDetails) {
        Student student = studentRepository.findById(id).orElseThrow();
        student.setName(studentDetails.getName());
        student.setAge(studentDetails.getAge());
        student.setDepartment(studentDetails.getDepartment());
        return studentRepository.save(student);
    }

    public void deleteStudent(Long id) {
        studentRepository.deleteById(id);
    }

    @Cacheable("studentsByDepartment")
    public Page<Student> getStudentsByDepartment(Long departmentId, Pageable pageable) {
        return studentRepository.findByDepartmentId(departmentId, pageable);
    }

    @Cacheable("studentsByName")
    public List<Student> getStudentsByName(String name) {
        return studentRepository.findByNameContains(name);
    }
}

package com.ust.Student.Management.service;

import com.ust.Student.Management.model.Student;
import com.ust.Student.Management.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public  String  createStudent(Student student){
        studentRepository.save(student);
        return "success";
    }

    public  Student getStudent(String usn){
       return studentRepository.findById(usn).get();
    }

    public  String  updateStudent(Student student){
        studentRepository.save(student);
        return "success";
    }

    public  String deleteStudent(String usn){
        studentRepository.deleteById(usn);
        return "success";
    }

    public List<Student> getStudents(){
        return studentRepository.findAll();
    }
}

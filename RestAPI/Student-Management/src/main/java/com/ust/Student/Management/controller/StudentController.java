package com.ust.Student.Management.controller;

import com.ust.Student.Management.model.Student;
import com.ust.Student.Management.service.StudentService;
import com.ust.Student.Management.service.Studentser;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentController {

//    private final StudentService studentService;
    private final Studentser studentService;

    public StudentController(Studentser studentService) {
        this.studentService = studentService;
    }

    @PostMapping
    public String createStudent(@RequestBody Student student) {
        studentService.createStudent(student);
        return "success";
    }

    @GetMapping("/{usn}")
    public Student getStudent(@PathVariable("usn") String usn) {
        return studentService.getStudent(usn);
    }

    @PutMapping("/{usn}")
    public String updateStudent(@PathVariable("usn") String usn, @RequestBody Student student) {
        student.setUsn(usn);
        studentService.updateStudent(student);
        return "success";
    }

    @DeleteMapping("/{usn}")
    public String deleteStudent(@PathVariable("usn") String usn) {
        studentService.deleteStudent(usn);
        return "success";
    }

    @GetMapping()
    public List<Student> getStudents(){
        return studentService.getStudents();
    }
}

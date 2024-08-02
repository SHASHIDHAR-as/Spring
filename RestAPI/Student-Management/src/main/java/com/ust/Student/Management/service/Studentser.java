package com.ust.Student.Management.service;

import com.ust.Student.Management.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Service
public class Studentser {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public String createStudent(Student student) {
        String sql = "INSERT INTO student (usn, name, college, sem) VALUES (?, ?, ?, ?)";
        jdbcTemplate.update(sql, student.getUsn(), student.getName(), student.getCollege(), student.getSem());
        return "success";
    }

    public Student getStudent(String usn) {
        String sql = "SELECT * FROM student WHERE usn = ?";
        return jdbcTemplate.queryForObject(sql, new Object[]{usn}, new StudentRowMapper());
    }

    public List<Student> getStudents() {
        String sql = "SELECT * FROM student";
        return jdbcTemplate.query(sql, new StudentRowMapper());
    }

    public String updateStudent(Student student) {
        String sql = "UPDATE student SET name = ?, college = ?, sem = ? WHERE usn = ?";
        jdbcTemplate.update(sql, student.getName(), student.getCollege(), student.getSem(), student.getUsn());
        return "success";
    }

    public String deleteStudent(String usn) {
        String sql = "DELETE FROM student WHERE usn = ?";
        jdbcTemplate.update(sql, usn);
        return "success";
    }

    private static class StudentRowMapper implements RowMapper<Student> {
        @Override
        public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
            Student student = new Student();
            student.setUsn(rs.getString("usn"));
            student.setName(rs.getString("name"));
            student.setCollege(rs.getString("college"));
            student.setSem(rs.getString("sem"));
            return student;
        }
    }
}


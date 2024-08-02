package com.deloitte.jdbcMaven.EmpJDBC;



import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDAO {

    private Connection con;

    public EmployeeDAO(String jdbcURL, String jdbcUsername, String jdbcPassword) throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        this.con = DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);
    }

    // Create an employee
    public void addEmployee(int empid, String name, int deptid, Date dob, int salary) throws SQLException {
        String query = "INSERT INTO employee1 (empid, name, deptid, dob, salary) VALUES (?, ?, ?, ?, ?)";
        try (PreparedStatement pstmt = con.prepareStatement(query)) {
            pstmt.setInt(1, empid);
            pstmt.setString(2, name);
            pstmt.setInt(3, deptid);
            pstmt.setDate(4, dob);
            pstmt.setInt(5, salary);
            pstmt.executeUpdate();
        }
    }

    // Read all employees
    public List<Employee> getAllEmployees() throws SQLException {
        List<Employee> employees = new ArrayList<>();
        String query = "SELECT * FROM employee1";
        try (Statement stmt = con.createStatement(); ResultSet rs = stmt.executeQuery(query)) {
            while (rs.next()) {
                int empid = rs.getInt("empid");
                String name = rs.getString("name");
                int deptid = rs.getInt("deptid");
                Date dob = rs.getDate("dob");
                int salary = rs.getInt("salary");
                employees.add(new Employee(empid, name, deptid, dob, salary));
            }
        }
        return employees;
    }

    // Update an employee
    public void updateEmployee(int empid, String name, int deptid, Date dob, int salary) throws SQLException {
        String query = "UPDATE employee1 SET name = ?, deptid = ?, dob = ?, salary = ? WHERE empid = ?";
        try (PreparedStatement pstmt = con.prepareStatement(query)) {
            pstmt.setString(1, name);
            pstmt.setInt(2, deptid);
            pstmt.setDate(3, dob);
            pstmt.setInt(4, salary);
            pstmt.setInt(5, empid);
            pstmt.executeUpdate();
        }
    }

    // Delete an employee
    public void deleteEmployee(int empid) throws SQLException {
        String query = "DELETE FROM employee1 WHERE empid = ?";
        try (PreparedStatement pstmt = con.prepareStatement(query)) {
            pstmt.setInt(1, empid);
            pstmt.executeUpdate();
        }
    }

    // Close the connection
    public void closeConnection() throws SQLException {
        if (con != null && !con.isClosed()) {
            con.close();
        }
    }
}


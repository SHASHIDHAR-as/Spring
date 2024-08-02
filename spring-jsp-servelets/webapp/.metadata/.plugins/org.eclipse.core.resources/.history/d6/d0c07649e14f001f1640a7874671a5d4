<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="com.entity.Employee" %>
<%
    Employee employee = (Employee) request.getAttribute("employee");
%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Employee Details</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body class="container mt-5">
    <h3>Employee Details</h3>
    <table class="table table-hover table-bordered">
        <tr><td>Emp Id</td><td><%= employee.getEmpId() %></td></tr>
        <tr><td>Name</td><td><%= employee.getName() %></td></tr>
        <tr><td>Salary</td><td><%= employee.getSalary() %></td></tr>
    </table>
    <a href="emp.html" class="btn btn-primary">Back</a>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>

package com.serverlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;

import com.entity.Employee;

public class EmpServerlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private HashMap<Integer, Employee> data = new HashMap<>();

    public EmpServerlet() {
        super();
        data.put(108, new Employee(108, "John", 5000));
        data.put(200, new Employee(200, "Kumar", 62008));
        data.put(300, new Employee(300, "Manasi", 88888));
        data.put(400, new Employee(400, "Suresh", 5080));
        data.put(500, new Employee(500, "Alok", 45120));
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String str = request.getParameter("empid");
        int eid = Integer.parseInt(str);
        Employee e = data.get(eid);

        response.setContentType("text/html");
        PrintWriter pw = response.getWriter();

        pw.println("<html>");
        pw.println("<head>");
        pw.println("<link href='https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css' rel='stylesheet'>");
        pw.println("<script src='https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js'></script>");
        pw.println("</head>");
        pw.println("<body class='container mt-5'>");

        if (e == null) {
            pw.println("<h2>Employee Data Not Found</h2>");
        } else {
            pw.println("<table class='table table-hover table-bordered'>");
            pw.println("<tr><td>Emp Id</td><td>" + e.getEmpId() + "</td></tr>");
            pw.println("<tr><td>Name</td><td>" + e.getName() + "</td></tr>");
            pw.println("<tr><td>Salary</td><td>" + e.getSalary() + "</td></tr>");
            pw.println("</table>");
        }

        pw.println("<a href='emp.html' class='btn btn-primary'><h3>Back</h3></a>");
        pw.println("</body>");
        pw.println("</html>");

        pw.close();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}
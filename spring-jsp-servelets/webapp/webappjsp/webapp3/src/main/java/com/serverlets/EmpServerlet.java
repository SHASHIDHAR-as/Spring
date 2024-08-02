package com.serverlets;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
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

        if (e == null) {
            RequestDispatcher dispatcher = request.getRequestDispatcher("notfound.jsp");
            dispatcher.forward(request, response);
        } else {
            request.setAttribute("employee", e);
            RequestDispatcher dispatcher = request.getRequestDispatcher("empdisplay.jsp");
            dispatcher.forward(request, response);
        }
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}

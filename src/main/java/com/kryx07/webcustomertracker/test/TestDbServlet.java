package com.kryx07.webcustomertracker.test;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
import java.sql.*;

@WebServlet("/TestDbServlet")
public class TestDbServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException {
        String user = "springstudent";
        String pass = "springstudent";

        String jdbcUrl = "jdbc:mysql://localhost:3306/webcustomer_tracker?useSSL=false";

        String driver = "com.mysql.jdbc.Driver";

        try {
            PrintWriter out = response.getWriter();

            out.println("Connecting to database: " + jdbcUrl);

            Class.forName(driver);

            Connection connection = DriverManager.getConnection(jdbcUrl);

            out.println("SUCCESS");

            connection.close();

        } catch (Exception e) {
            e.printStackTrace();
            throw new ServletException();
        }
    }
}

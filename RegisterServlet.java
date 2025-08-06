package com.task;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/register")
public class RegisterServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String user = request.getParameter("username");
        String pass = request.getParameter("password");
        try {
        	//step1:load driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            //step 2:establishing connections
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbjun25", "root", "syeda110");
            
            //step 3: prepare sql statements
//          Statement st = con.createStatement();
            
            //step 4: execute query
//          st.executeUpdate("create table user (username VARCHAR(50) PRIMARY KEY,password VARCHAR(50));");
            PreparedStatement ps = con.prepareStatement("INSERT INTO user (username, password) VALUES (?, ?)");
            ps.setString(1, user);
            ps.setString(2, pass);
            ps.executeUpdate();
            
            //step 5: close connections
            con.close();
            response.sendRedirect("login.html");
        }
        catch (ClassNotFoundException e) {	
			e.printStackTrace();			
		}catch (SQLException e) {
            e.printStackTrace();
            response.sendRedirect("error.html");
        }
    }
}

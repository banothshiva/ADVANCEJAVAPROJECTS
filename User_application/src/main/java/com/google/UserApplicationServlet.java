package com.google;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/UserApplicationServlet")
public class UserApplicationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	// client sends the data into the server
		String userId = request.getParameter("userId");
		String userName = request.getParameter("userName");
		String userEmail = request.getParameter("userEmail");
		String userMobile = request.getParameter("userMobile");
	    String userLocation = request.getParameter("userLocation");
	
	// process the data
	    UserDao  userDao = new UserDao();
	userDao .saveUser(userId,userName,userEmail,userMobile,userLocation );
	
	// render to the database
	PrintWriter writer = response.getWriter();
	writer.println("Data  Inserted Successfully.............");
	
	
	}

}

package com.sathya;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginPage extends HttpServlet 
{
	private static final long serialVersionUID = 1L;
protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
{
	// client takes the data form the browser
	String userName = request.getParameter("userName");
	String userPassword = request.getParameter("userPassword");

     //process the data
	if (userName.equalsIgnoreCase("nani") && userPassword.equals("@nani123"))
	{
		RequestDispatcher dispatcher = request.getRequestDispatcher("success.html");
		dispatcher.forward(request, response);
	}
	else {
		response.setContentType("text/html");
		PrintWriter writer = response.getWriter();
		writer.println("Login failed ...... try with some valid data ");
        RequestDispatcher dispatcher = request.getRequestDispatcher("form.html");
    dispatcher.include(request, response);    
	
	}
  }

}

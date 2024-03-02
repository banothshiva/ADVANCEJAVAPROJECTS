package com.sathya;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FirstServletApplication extends HttpServlet
{
	private static final long serialVersionUID = 1L;
       
 protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
 {
	 response.setContentType("text/html");
	 PrintWriter writer = response.getWriter();
	writer.println("THIS IS IS THE FIRST SERVLET EXAMPLE "+"<br><br>");
	writer.println("teached by the ratan sir "+"<br><br>");
	writer.println("WITH USING REAL TIME EXAMPLES "+"<br><br>");
	writer.println("servlet example are very well....."+"<br><br>");
 
 
 }

}

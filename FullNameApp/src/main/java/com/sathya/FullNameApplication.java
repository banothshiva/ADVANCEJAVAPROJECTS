package com.sathya;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FullNameApplication extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
   	// client sends the data to the server  and get the data 
   		String firstName = request.getParameter("firstName");
   		String lastName = request.getParameter("lastName");
    //process the data
   		String fullName;
   		fullName = firstName + lastName;
   		// render response to the browser
   		response.setContentType("text/html");
   		PrintWriter writer = response.getWriter();
   		writer.println("YOUR ARE FULLNAME IS *******"+fullName);
   		
   	
   	
   	
   	
   	}

}

package com.sathya;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/ThirdServlet3")
public class ThirdServlet3 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//total 6-details = 4-details session 2-request 
		HttpSession session = request.getSession(false);
		
		response.setContentType("text/html");
	     PrintWriter writer = response.getWriter();
	     writer.println("COOKIES EXAMPLE....");
		writer.println("User name..."+session.getAttribute("username"));
		writer.println("<br>");
		writer.println("User Age..."+session.getAttribute("age"));
		writer.println("<br>");
		writer.println("User Qualifation..."+session.getAttribute("qualification"));
		writer.println("<br>");
		writer.println("User Dessignation..."+session.getAttribute("designation"));
		writer.println("<br>");
		writer.println("User mobile..."+request.getParameter("mobile"));
		writer.println("<br>");
		writer.println("User Email..."+request.getParameter("email"));

	}

}

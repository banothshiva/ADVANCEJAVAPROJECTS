package com.sathya;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/FirstServlet")
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//get the requested data 
	     String username = request.getParameter("username");
		String age = request.getParameter("age");
	    //create the Cookie Object 
	     Cookie cookie1 = new Cookie("username",username);
		Cookie cookie2 = new Cookie("age",age);

	//Place the data into response
	response.addCookie(cookie1);
	response.addCookie(cookie2);

				
	//forward the request to next form 
	RequestDispatcher dispatcher = request.getRequestDispatcher("form2.html");
	dispatcher.forward(request, response);

	}

}

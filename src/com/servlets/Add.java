package com.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


	@WebServlet("/ad")
	public class Add extends HttpServlet {
		private static final long serialVersionUID = 1L;
	       
	   
		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			RequestDispatcher dis=request.getRequestDispatcher("html/add.jsp");
			dis.forward(request, response)
			;}
		
		   
			protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
				int a=Integer.parseInt(request.getParameter("num1"));
				int b=Integer.parseInt(request.getParameter("num2"));
				int c=a+b;
				request.setAttribute("data",c);
				RequestDispatcher dis=request.getRequestDispatcher("html/add.jsp");
				dis.forward(request, response);}

}

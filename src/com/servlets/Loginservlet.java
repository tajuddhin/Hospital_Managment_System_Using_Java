package com.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import db.AppDoa;


@WebServlet("/Loginservlet")
public class Loginservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	response.sendRedirect("html/login.jsp");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username=request.getParameter("userid");
		int password=Integer.parseInt(request.getParameter("pwd"));
		AppDoa doa=new AppDoa();
		boolean login=doa.validate(username,password);
		if(login) {
			HttpSession session=request.getSession();
			session.setAttribute("user", username);
		response.sendRedirect("register");
		}
		else {
			response.sendRedirect("html/login.jsp");
		}
		
	}

}

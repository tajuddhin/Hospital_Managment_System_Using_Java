package com.servlets;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import db.AppDoa;
import db.ApplicationDao;
import pojo.Patient;


@WebServlet("/search_patient")

public class SearchServlet  extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		RequestDispatcher dis=request.getRequestDispatcher("html/search_patient.jsp");
		dis.forward(request, response);
		
		
		
		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int pid=Integer.parseInt(request.getParameter("pid"));
		AppDoa app=new AppDoa();
		Patient p=app.search(pid);
		request.setAttribute("p", p);
		RequestDispatcher dis=request.getRequestDispatcher("html/search_patient.jsp");
		dis.forward(request, response);
		
}
}
package com.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import db.AppDoa;
import pojo.Patient;

/**
 * Servlet implementation class DeleteServlet
 */
@WebServlet("/delete")
public class DeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher dis=request.getRequestDispatcher("html/delete_patient.jsp");
		dis.forward(request, response);
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String submit=request.getParameter("submit");
		int pid=Integer.parseInt(request.getParameter("pid"));
		System.out.println(submit);
		
		if(submit.equals("getdata")) {
			AppDoa app= new AppDoa();
			Patient p=app.search(pid);
			request.setAttribute("data", p);
			RequestDispatcher dis=request.getRequestDispatcher("html/delete_patient.jsp");
			dis.forward(request, response);
			System.out.println("insideget data");
			}
		else if(submit.equals("del")) {
			AppDoa app= new AppDoa();
		String msg1=app.delete(pid);
		request.setAttribute("delmsg1", msg1);
		RequestDispatcher dis=request.getRequestDispatcher("html/delete_patient.jsp");
		dis.forward(request, response);
		System.out.println("del");
		
		
	}

}}

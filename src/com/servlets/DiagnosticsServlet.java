package com.servlets;

import java.io.IOException;
import java.util.ArrayList;

import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import db.AppDoa;
import pojo.Diagnostic_issue;
import pojo.Patient;

/**
 * Servlet implementation class DiagnosticsServlet
 */
@WebServlet("/Diagnostics")
public class DiagnosticsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher dis=request.getRequestDispatcher("html/diagnostics.jsp");
		dis.forward(request, response);
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int pid=Integer.parseInt(request.getParameter("pid"));
		getServletContext().setAttribute("id1", pid);
		AppDoa app=new AppDoa();
		Patient p1=app.search(pid);
		request.setAttribute("pdata", p1);
		List<Diagnostic_issue> l=new ArrayList<Diagnostic_issue>();
		getServletContext().setAttribute("li", l);
		RequestDispatcher dis=request.getRequestDispatcher("html/diagnostics.jsp");
		dis.forward(request, response);
	}

}

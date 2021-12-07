package com.servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import db.AppDoa;
import pojo.Diagnostic_issue;
import pojo.Diagnostics;
import pojo.Medicine_issue;
import pojo.Patient;

/**
 * Servlet implementation class AddDiagnostics
 */
@WebServlet("/addDiagnostics")
public class AddDiagnostics extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher dis=request.getRequestDispatcher("html/addDiagnostics.jsp");
		dis.forward(request, response);}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String tname=request.getParameter("tname");
		int pid = (Integer) getServletContext().getAttribute("id1");
		List<Diagnostic_issue> l=(ArrayList<Diagnostic_issue>)getServletContext().getAttribute("li");
		String sub=request.getParameter("submit");
		if(sub.equals("Add")){
			AppDoa app=new AppDoa();
			Patient p=app.search(pid);
			Diagnostics d= (Diagnostics)app.searchtest(tname);
			Diagnostic_issue dissue=new Diagnostic_issue();
			dissue.setDiagnostics(d);
			dissue.setPatient(p);
			l.add(dissue);
		request.setAttribute("lt", l);
		RequestDispatcher dis=request.getRequestDispatcher("html/addDiagnostics.jsp");
		dis.forward(request, response);	
		}
		
		else if(sub.equals("Update")) {
			 Iterator<Diagnostic_issue> iter=l.iterator();
			 AppDoa app=new AppDoa();
			 while(iter.hasNext()) {
		
		app.savetest(iter.next());
			 }
	RequestDispatcher dis=request.getRequestDispatcher("html/diagnostics.jsp");
				dis.forward(request, response);		
			
			
			
		}
		
		
		
		
	}

}

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
import pojo.Medicine_issue;
import pojo.Patient;


@WebServlet("/medicine")
public class Medicineservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
   

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		


	RequestDispatcher dis=request.getRequestDispatcher("html/medicine.jsp");
	dis.forward(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int pid=Integer.parseInt(request.getParameter("pid"));
		getServletContext().setAttribute("id", pid);
         
		AppDoa app=new AppDoa();
		Patient p=app.search(pid);
		request.setAttribute("mdata", p);
		
		List<Medicine_issue> l=new ArrayList<Medicine_issue>();
		getServletContext().setAttribute("l", l);
		RequestDispatcher dis=request.getRequestDispatcher("html/medicine.jsp");
		dis.forward(request, response);
		
		
		
	}

}

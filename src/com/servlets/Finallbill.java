package com.servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import db.AppDoa;
import pojo.Diagnostics;
import pojo.MedicineDb;
import pojo.Patient;

/**
 * Servlet implementation class Finallbill
 */
@WebServlet("/Finallbill")
public class Finallbill extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		RequestDispatcher dis=request.getRequestDispatcher("html/finall_billing.jsp");
		dis.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int pid=Integer.parseInt(request.getParameter("pid"));
		AppDoa app=new AppDoa();
		Patient p=app.search(pid);
		request.setAttribute("pdata", p);
		
		RequestDispatcher dis=request.getRequestDispatcher("html/finall_billing.jsp");
		dis.forward(request, response);
		
		
	}

}

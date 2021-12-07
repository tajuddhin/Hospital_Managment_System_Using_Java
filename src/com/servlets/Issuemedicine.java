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
import pojo.MedicineDb;
import pojo.Medicine_issue;
import pojo.Patient;


@WebServlet("/Issuemedicine")
public class Issuemedicine extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		

		RequestDispatcher dis=request.getRequestDispatcher("html/issuemedicine.jsp");
		dis.forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String mname=request.getParameter("mname");
		int pid = (Integer) getServletContext().getAttribute("id");
		
		
		List<Medicine_issue> l=(ArrayList<Medicine_issue>) getServletContext().getAttribute("l");
		String sub=request.getParameter("submit");
		
		if(sub.equals("Search")){
			int quantity=Integer.parseInt( request.getParameter("quantity"));
		AppDoa app=new AppDoa();
		Patient p=app.search(pid);
		MedicineDb m= (MedicineDb)app.searchmedicine(mname, quantity);
		Medicine_issue missue=new Medicine_issue();
		missue.setMedicine(m);
		missue.setPatient(p);
		missue.setQuantity(quantity);
		l.add(missue);
		request.setAttribute("le", l);
		System.out.println("get data");
		RequestDispatcher dis=request.getRequestDispatcher("html/issuemedicine.jsp");
		dis.forward(request, response);
		}
		
		else if(sub.equals("Save")) {
			System.out.println("save dataaaaaa");
			 Iterator<Medicine_issue> iter=l.iterator();
			 AppDoa app=new AppDoa();
			 while(iter.hasNext()) {
		
		app.savemed(iter.next());
			 }
		RequestDispatcher dis=request.getRequestDispatcher("html/medicine.jsp");
		dis.forward(request, response);
		
	}

}}

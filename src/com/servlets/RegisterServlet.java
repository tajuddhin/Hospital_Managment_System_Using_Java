package com.servlets;



import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.IOException;
import  java.lang.Integer;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import pojo.Patient;
import db.AppDoa;


/**
 * Servlet implementation class RegisterServlet
 */
@WebServlet("/register")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public RegisterServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		RequestDispatcher dis=request.getRequestDispatcher("html/create_patient.jsp");
		dis.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("in post of register");
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");

		// take all the form data
		int ssnid = Integer.parseInt(request.getParameter("ssnid"));
		String name = request.getParameter("name");
		
		Date doa = null;
		try {
			doa = format.parse(request.getParameter("doa"));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		String typeofbed = request.getParameter("typeofbed");
		String address = request.getParameter("address");
		int age = Integer.parseInt(request.getParameter("age"));
		String state = request.getParameter("state");
		String city = request.getParameter("city");
		
		Patient patient = new Patient();
		patient.setssnid(ssnid);
		patient.setName(name);
		patient.setDoa(doa);
		patient.setAge(age);
		patient.setTypeofbed(typeofbed);
		patient.setAddress(address);
		patient.setState(state);
		patient.setCity(city);
		AppDoa app = new AppDoa();
		String msg=null;
		
		int userSaved = 0;
		
			userSaved = app.insert(patient);
		
		if (userSaved==0) {
			msg = " Sorry! Some error occurred!";

		} else {
			msg = "User registered successfully!";
		}
		request.setAttribute("msg", msg);
		RequestDispatcher dis=request.getRequestDispatcher("html/create_patient.jsp");
		dis.forward(request, response);

		
		
}
}

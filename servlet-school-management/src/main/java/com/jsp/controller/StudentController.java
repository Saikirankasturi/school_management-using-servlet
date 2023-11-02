package com.jsp.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/student")
public class StudentController extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String register=req.getParameter("register");
		String delete=req.getParameter("delete");
		String update=req.getParameter("update");
		String get_id=req.getParameter("getbyid");
		
		
		
		if(register!=null) {
			RequestDispatcher requestDispatcher=req.getRequestDispatcher("student_registration.jsp");
			requestDispatcher.forward(req, resp);
		}

		else if (get_id!=null) {
			RequestDispatcher requestDispatcher=req.getRequestDispatcher("view_student_detail.jsp");
			requestDispatcher.forward(req, resp);
		}
	}
}

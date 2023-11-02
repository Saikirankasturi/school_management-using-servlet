package com.jsp.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/teacher")
public class TeacherController extends HttpServlet {
	
@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
	String register=req.getParameter("register");
//	String delete=req.getParameter("delete");
//	String update=req.getParameter("update");
	String getby_id=req.getParameter("getbyid");
	String get_students=req.getParameter("getallstudent");
	
	if(register!=null) {
		RequestDispatcher requestDispatcher=req.getRequestDispatcher("teacher_registration.jsp");
		requestDispatcher.forward(req, resp);
	}
	
	else if (getby_id!=null) {
		RequestDispatcher requestDispatcher=req.getRequestDispatcher("view_teacher_detail.jsp");
		requestDispatcher.forward(req, resp);
	}
	else if (get_students!=null) {
//		RequestDispatcher requestDispatcher=req.getRequestDispatcher("getAll.jsp");
//		requestDispatcher.forward(req, resp);
		RequestDispatcher requestDispatcher=req.getRequestDispatcher("teacherAuthorization.jsp");
 		requestDispatcher.forward(req, resp);
	}
}
}

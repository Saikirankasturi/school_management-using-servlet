package com.jsp.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsp.dto.Teacher;
import com.jsp.service.TeacherService;

@WebServlet("/teacherAuthorization")
public class TeacherAuthorization  extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		int id=Integer.parseInt(req.getParameter("id"));
		String password=req.getParameter("password");
		TeacherService teacherService=new TeacherService();
		Teacher teacher= teacherService.getTeacherById(id);
		if(teacher!=null) {
			if(password.equals(teacher.getPassword())) {
				RequestDispatcher requestDispatcher=req.getRequestDispatcher("getAll.jsp");
				requestDispatcher.forward(req, resp);
			}
			
		}
		else {
			PrintWriter printWriter=resp.getWriter();
			printWriter.write("<html><body><h1>"+"You are not authorized"+"</h1></body></html>");
		}
	}
}

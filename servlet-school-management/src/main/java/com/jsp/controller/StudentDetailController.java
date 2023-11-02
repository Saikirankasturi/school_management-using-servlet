package com.jsp.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsp.dto.Student;
import com.jsp.service.StudentService;

@WebServlet("/getStudentDetail")
public class StudentDetailController extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		int id=Integer.parseInt(req.getParameter("id"));
		String password=req.getParameter("password");
		StudentService studentService=new StudentService();
		Student student= studentService.getStudentById(id);
		if(student!=null) {
			if(password.equals(student.getPassword())) {
				RequestDispatcher requestDispatcher=req.getRequestDispatcher("student_detail.jsp?id="+id);
				requestDispatcher.forward(req, resp);
			}
			
		}
		else {
			PrintWriter printWriter=resp.getWriter();
			printWriter.write("<html><body><h1>"+id+" does not exist"+"</h1></body></html>");
		}
	}

}

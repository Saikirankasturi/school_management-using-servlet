package com.jsp.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsp.dto.Student;
import com.jsp.service.StudentService;

@WebServlet("/updated")
public class StudentUpdateController extends HttpServlet{
@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	StudentService studentService=new StudentService();
	int id=Integer.parseInt(req.getParameter("studentId"));
	String name=req.getParameter("studentname");
	String email=req.getParameter("studentemail");
	Student student=new Student();
	if(student!=null && name!=null && email!=null) {
		student.setName(name);
		student.setEmail(email);
		Student s=studentService.updateStudentById(student, id);
		if(s!=null) {
  		  PrintWriter printWriter=resp.getWriter();
  			printWriter.write("<html><body><h1>"+student.getName()+"updated successfully"+"</h1></body></html>");
  	  }
	}
	
	
}
}

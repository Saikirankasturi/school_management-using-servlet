package com.jsp.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsp.service.StudentService;

@WebServlet("/studentdelete")
public class StudentDeleteController extends HttpServlet {
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(req, resp);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		  int id=Integer.parseInt(req.getParameter("id"));
		  StudentService studentService=new StudentService();
		  boolean student=studentService.deleteStudentById(id);
		  PrintWriter printWriter=resp.getWriter();
		  if(student==true) {
			  printWriter.write(id+"deleted successfully");
		  }
	}

}


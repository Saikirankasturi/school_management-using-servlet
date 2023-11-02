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

@WebServlet("/studentinfo")
public class StudentSaveController extends HttpServlet {
	
	
	StudentService studentService=new StudentService();
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Student student=new Student();
      String name=req.getParameter("name");
      String email=req.getParameter("email");
      String password=req.getParameter("password");
      
      if(name!=null && email!=null && password!=null) {
    	  student.setName(name);
    	  student.setEmail(email);
    	  student.setPassword(password);
    	  Student s=studentService.saveStudent(student);
    	  if(s!=null) {
    		  PrintWriter printWriter=resp.getWriter();
    			printWriter.write("<html><body><h1>"+"Sign Up Successfull"+"</h1></body></html>");
    	  }
      }
	}
}

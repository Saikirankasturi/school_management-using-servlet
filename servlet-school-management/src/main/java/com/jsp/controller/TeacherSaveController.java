package com.jsp.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsp.dto.Teacher;
import com.jsp.service.TeacherService;

@WebServlet("/teacherinfo")
public class TeacherSaveController extends HttpServlet {
	
	
	TeacherService teacherService=new TeacherService();
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Teacher teacher=new Teacher();
      String name=req.getParameter("name");
      String email=req.getParameter("email");
      String password=req.getParameter("password");
      
      if(name!=null && email!=null && password!=null) {
    	  teacher.setName(name);
    	  teacher.setEmail(email);
    	  teacher.setPassword(password);
    	  Teacher s=teacherService.saveTeacher(teacher);
    	  if(s!=null) {
    		  PrintWriter printWriter=resp.getWriter();
    			printWriter.write("<html><body><h1>"+"Sign Up Successfull"+"</h1></body></html>");
    	  }
      }
	}
}

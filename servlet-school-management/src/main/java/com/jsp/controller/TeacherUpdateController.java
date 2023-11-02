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

@WebServlet("/updatedTeacher")
public class TeacherUpdateController extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		TeacherService teacherService=new TeacherService();
		int id=Integer.parseInt(req.getParameter("teacherId"));
		String name=req.getParameter("teachername");
		String email=req.getParameter("teacheremail");
		Teacher teacher=new Teacher();
		if(teacher!=null && name!=null && email!=null) {
			teacher.setName(name);
			teacher.setEmail(email);
			Teacher s=teacherService.updateTeacherById(teacher, id);
			if(s!=null) {
	  		  PrintWriter printWriter=resp.getWriter();
	  			printWriter.write("<html><body><h1>"+teacher.getName()+"updated successfully"+"</h1></body></html>");
	  	  }
		}
	}

}

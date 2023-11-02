package com.jsp.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/home")
public class HomeController extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String student=req.getParameter("student");
		String teacher=req.getParameter("teacher");
		
		if(student!=null) {
			RequestDispatcher requestDispatcher=req.getRequestDispatcher("student.jsp");
			requestDispatcher.forward(req, resp);
			System.out.println("Show Student Console..");
		}
		else if (teacher!=null) {
			RequestDispatcher requestDispatcher=req.getRequestDispatcher("teacher.jsp");
			requestDispatcher.forward(req, resp);
			System.out.println("Show Teacher Console..");
		}
	}
	
}

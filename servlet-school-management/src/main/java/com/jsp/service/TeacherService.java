package com.jsp.service;

import java.util.List;

import com.jsp.dao.TeacherDao;
import com.jsp.dto.Student;
import com.jsp.dto.Teacher;

public class TeacherService {

	TeacherDao teacherDao = new TeacherDao();

	public Teacher saveTeacher(Teacher teacher) {
		
		if(teacher!=null) {
			return teacherDao.saveTeacher(teacher);
		}
		else {
			return null;
		}
		
	}
	
	//getByIdServices
		public Teacher getTeacherById(int id) {
			if (id > 0) {
				return teacherDao.getTeacherById(id);
			} else {
				return null;
			}
		}
		
		//update
		public Teacher updateTeacherName(int id, String name) {
	 	    
	 		Teacher teacher=teacherDao.getTeacherById(id);
	 		teacher.setName(name);
	 		return teacherDao.updateTeacherName(teacher);
	 	}
	 	
	     public Teacher updateTeacherEmail(int id, String email) {
	  	    
	  		Teacher teacher=teacherDao.getTeacherById(id);
	  		teacher.setEmail(email);
	  		return teacherDao.updateTeacherEmail(teacher);
	  	}
	     
	     public Teacher updateTeacherPassword(int id, String password) {
	  	    
	  		Teacher teacher=teacherDao.getTeacherById(id);
	  		teacher.setPassword(password);
	  		return teacherDao.updateTeacherPassword(teacher);
	  	}

	   //deleteById
	     public boolean deleteTeacherById(int id) {
	   		if (id > 0) {
	   			return teacherDao.deleteTeacherById(id);
	   		} else {
	   			return false;
	   		}
	   	}
	     
	public List<Student> getAllStudents(){
		return teacherDao.getAllStudents();
	}

	public Teacher updateTeacherById(Teacher teacher, int id) {
		// TODO Auto-generated method stub
		return teacherDao.updateTeacherById(teacher, id);
	}
}

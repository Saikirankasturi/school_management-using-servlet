package com.jsp.service;

import com.jsp.dao.StudentDao;
import com.jsp.dto.Student;

public class StudentService {

	StudentDao studentDao=new StudentDao();
	
	public Student saveStudent(Student student) {
		
		if(student!=null) {
			return studentDao.saveStudent(student);
		}
		else {
			return null;
		}
	}
	
	//getByIdServices
	public Student getStudentById(int id) {
		if (id > 0) {
			return studentDao.getStudentById(id);
		} else {
			return null;
		}
	}
	
	//update
		public Student updateStudentName(int id, String name) {
		    
			Student student=studentDao.getStudentById(id);
			student.setName(name);
			return studentDao.updateStudentName(student);
		}
		
	    public Student updateStudentEmail(int id, String email) {
		    
			Student student=studentDao.getStudentById(id);
			student.setEmail(email);
			return studentDao.updateStudentEmail(student);
		}
	    public Student updateStudentPassword(int id, String password) {
	    	
	    	Student student=studentDao.getStudentById(id);
	    	student.setPassword(password);
	    	return studentDao.updateStudentPassword(student);
	    }
	    
	  //deleteById
	     public boolean deleteStudentById(int id) {
	 		if (id > 0) {
	 			return studentDao.deleteStudentById(id);
	 		} else {
	 			return false;
	 		}
	 	}
	     
	    //updatebyId
	     public Student updateStudentById(Student student,int id) {
	    	 return studentDao.updateStudentById(student, id);
	    	 }
}

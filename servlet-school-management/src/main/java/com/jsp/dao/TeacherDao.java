package com.jsp.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.dto.Student;
import com.jsp.dto.Teacher;
import javax.persistence.Query;

public class TeacherDao {

	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("sai");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();

	public Teacher saveTeacher(Teacher teacher) {
		entityTransaction.begin();
		entityManager.persist(teacher);
		entityTransaction.commit();
		return teacher;
	}

	public Teacher getTeacherById(int id) {
		
		Teacher teacher=entityManager.find(Teacher.class, id);
		if(teacher!=null) {
			return teacher;
		}
		else {
			return null;
		}
	}

	public Teacher updateTeacherName(Teacher teacher) {
		if (teacher != null) {
			entityTransaction.begin();
			entityManager.merge(teacher);
			entityTransaction.commit();
			return teacher;
		} else {
			return null;
		}
	}

	public Teacher updateTeacherEmail(Teacher teacher) {
		if (teacher != null) {
			entityTransaction.begin();
			entityManager.merge(teacher);
			entityTransaction.commit();
			return teacher;
		} else {
			return null;
		}
	}
	
	public Teacher updateTeacherPassword(Teacher teacher) {
		if (teacher != null) {
			entityTransaction.begin();
			entityManager.merge(teacher);
			entityTransaction.commit();
			return teacher;
		} else {
			return null;
		}
	}

	public boolean deleteTeacherById(int id) {

		Teacher teacher = getTeacherById(id); // or Product product = entityManager.find(Product.class,id);
		entityTransaction.begin();
		entityManager.remove(teacher);
		entityTransaction.commit();
		return true;
	}

	public List<Student> getAllStudents() {
		String sql = "Select s from Student s";
		Query query = entityManager.createQuery(sql);
		List<Student> students = query.getResultList();
		return students;
		//String sql="Select count(*) from Student s"
		//Object a= query.getSingleResult();
		//System.out.println(a);
	}
	
	//updateById
	public Teacher updateTeacherById(Teacher teacher,int id) {
  	  Teacher t=entityManager.find(Teacher.class,id);
  	  if(t!=null) {
  		  entityTransaction.begin();
			entityManager.merge(teacher);
			entityTransaction.commit();
			return teacher;
  	  }
  	  return null;
    }
}

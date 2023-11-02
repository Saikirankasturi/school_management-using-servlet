package com.jsp.dao;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.dto.Student;
import com.jsp.dto.Teacher;

public class StudentDao {

	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("sai");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();

	public Student saveStudent(Student student) {
		entityTransaction.begin();
		entityManager.persist(student);
		entityTransaction.commit();
		return student;
	}

	public Student getStudentById(int id) {
		return entityManager.find(Student.class, id);
	}

	// updates
	public Student updateStudentName(Student student) {
		if (student != null) {
			entityTransaction.begin();
			entityManager.merge(student);
			entityTransaction.commit();
			return student;
		} else {
			return null;
		}
	}

	public Student updateStudentEmail(Student student) {
		if (student != null) {
			entityTransaction.begin();
			entityManager.merge(student);
			entityTransaction.commit();
			return student;
		} else {
			return null;
		}
	}

	public Student updateStudentPassword(Student student) {
		if (student != null) {
			entityTransaction.begin();
			entityManager.merge(student);
			entityTransaction.commit();
			return student;
		} else {
			return null;
		}
	}

	// deleteById
	public boolean deleteStudentById(int id) {

		Student student = getStudentById(id); // or Product product = entityManager.find(Product.class,id);
		entityTransaction.begin();
		entityManager.remove(student);
		entityTransaction.commit();
		if (student != null) {
			return true;
		} else
			return false;
	}
//	================================================================================

	// updatebyid
	public Student updateStudentById(Student student, int id) {
		Student s = entityManager.find(Student.class, id);
		if (s != null) {
			entityTransaction.begin();
			entityManager.merge(student);
			entityTransaction.commit();
			return student;
		}
		return null;
	}

}

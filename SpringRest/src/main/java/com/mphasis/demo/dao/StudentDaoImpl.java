package com.mphasis.demo.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mphasis.demo.entities.Student;
@Repository
public class StudentDaoImpl implements StudentDao {
	@Autowired 
	SessionFactory sessionFactory;

	public List<Student> getStudents() {
		Session  session = sessionFactory.openSession();
		Transaction tr = session.beginTransaction(); 
		List<Student> students = session.createCriteria(Student.class).list();
		tr.commit();
   	    session.close();
		return students; 
	}

	public void insertStudent(Student student) {
		Session  session = sessionFactory.openSession();
		Transaction tr = session.beginTransaction(); 
		session.save(student);
		tr.commit();
   	    session.close();
	}

	public void updateStudent(Student student)
	{
		Session  session = sessionFactory.openSession();
		Transaction tr = session.beginTransaction();
		session.update(student);
		tr.commit();
		session.close();
	}

	public void deleteStudent(long id) {
		Session  session = sessionFactory.openSession();
		Transaction tr = session.beginTransaction();
		Student cus = (Student)session.get(Student.class,id);
		session.delete(cus);
		tr.commit();
		    session.close();

	}

	public Student getStudentbyId(long id) {
		Session  session = sessionFactory.openSession();
		Transaction tr = session.beginTransaction();
		Student cus = (Student)session.get(Student.class,id);
		tr.commit();
		session.close();
	    return cus;
	}

}

package com.mphasis.demo.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mphasis.demo.entities.Assignament;
import com.mphasis.demo.entities.Student;
 
@Repository
public class AssignmentDaoImpl implements AssignamentDao {
	@Autowired 
	SessionFactory sessionFactory;

	public List<Assignament> getAssignments() {
		Session  session = sessionFactory.openSession();
		Transaction tr = session.beginTransaction(); 
		List<Assignament> assisnments = session.createCriteria(Assignament.class).list();
		tr.commit();
   	    session.close();
		return assisnments; 
		 
	}

	public void insertAssignment(Assignament assignament) {
		 
		Session  session = sessionFactory.openSession();
		Transaction tr = session.beginTransaction(); 
		session.save(assignament);
		tr.commit();
   	    session.close();
	}

	public void updateAssignment(Assignament assignament) {
		Session  session = sessionFactory.openSession();
		Transaction tr = session.beginTransaction(); 
		session.save(assignament);
		tr.commit();
   	    session.close();;

	}

	public void deleteAssignment(long id) {
		Session  session = sessionFactory.openSession();
		Transaction tr = session.beginTransaction();
		Assignament cus = (Assignament)session.get(Assignament.class,id);
		session.delete(cus);
		tr.commit();
		session.close();

	}

	public Assignament getAssignamentbyId(long id) {
		Session  session = sessionFactory.openSession();
		Transaction tr = session.beginTransaction();
		Assignament cus = (Assignament)session.get(Assignament.class,id);
		 
		tr.commit();
		session.close();
		return cus;
	}

}

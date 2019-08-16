package com.mphasis.demo.bo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mphasis.demo.dao.AssignamentDao;
import com.mphasis.demo.entities.Assignament;
import com.mphasis.demo.exception.BuissnessException;
@Service
public class AssagnmentBoimpl implements AssignamentBo{
	@Autowired
	 AssignamentDao assignmentDao;
	public List<Assignament> getAssignments() {
		 
		List<Assignament> assignaments = assignmentDao.getAssignments();
		if(assignaments.isEmpty())
		{
			/*try 
			{
			  throw new Exception("no students");	
			}
			catch(Exception e)
			{
			  	e.printStackTrace();
			}*/
			throw new BuissnessException("no assignaments");
		}
		return assignaments;
	}

	public void insertAssignment(Assignament assignament) {
		assignmentDao.insertAssignment(assignament);

	}

	public void updateAssignment(Assignament assignament) {
		 if(assignament.getGrade() >=60)
		 {
			 assignmentDao.updateAssignment(assignament);
		 }
		 else
		 {
			 throw new BuissnessException("no assignment");
		 }

	}

	public void deleteAssignment(long id) {
		assignmentDao.deleteAssignment(id);

	}

	public Assignament getAssignamentbyId(long id) {
		return assignmentDao.getAssignamentbyId(id);
		 
	}

}

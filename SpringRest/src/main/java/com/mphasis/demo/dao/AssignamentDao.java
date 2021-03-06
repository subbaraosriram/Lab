package com.mphasis.demo.dao;

import java.util.List;

import com.mphasis.demo.entities.Assignament;

public interface AssignamentDao {
	public List<Assignament> getAssignments();
    public void insertAssignment(Assignament assignament);
	public void updateAssignment(Assignament assignament);
	public void deleteAssignment(long id);
	public Assignament getAssignamentbyId(long id);

}

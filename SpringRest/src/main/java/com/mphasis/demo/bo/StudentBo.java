package com.mphasis.demo.bo;

import java.util.List;

import com.mphasis.demo.entities.Student;

public interface StudentBo {
	public List<Student> getStudents();
	  public void insertStudent(Student student);
	  public void updateStudent(Student student);
	  public void deleteStudent(long id);
	  public Student getStudentbyId(long id);
}

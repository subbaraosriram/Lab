package com.mphasis.demo.dao;
import java.util.List;

import com.mphasis.demo.entities.*;
public interface StudentDao {
  public List<Student> getStudents();
  public void insertStudent(Student student);
  public void updateStudent(Student student);
  public void deleteStudent(long id);
  public Student getStudentbyId(long id);
}

package com.mphasis.demo.bo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mphasis.demo.dao.StudentDao;
import com.mphasis.demo.entities.Student;
import com.mphasis.demo.exception.BuissnessException;
@Service
public class StudentBoImpl implements StudentBo {
@Autowired
StudentDao studentDao;
	public List<Student> getStudents() {
		List<Student> students = studentDao.getStudents();
		if(students.isEmpty())
		{
			/*try 
			{
			  throw new Exception("no students");	
			}
			catch(Exception e)
			{
			  	e.printStackTrace();
			}*/
			throw new BuissnessException("no students");
		}
		return students;
	}

	public void insertStudent(Student student) {
		studentDao.insertStudent(student);

	}

	public void updateStudent(Student student) {
		studentDao.updateStudent(student);

	}

	public void deleteStudent(long id) {
		studentDao.deleteStudent(id);

	}

	public Student getStudentbyId(long id) {
		 
		return  studentDao.getStudentbyId(id);
	}

}

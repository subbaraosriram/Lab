package com.mphasis.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.mphasis.demo.entities.Student;
import com.mphasis.demo.bo.StudentBo;

@RestController
@RequestMapping("/student")
public class StudentController 
{
  @Autowired
  StudentBo studentBo;
  
  @RequestMapping(value="/students",method=RequestMethod.GET,produces=MediaType.APPLICATION_JSON_VALUE)
  public  List<Student> getAll()
  {
	
	  return studentBo.getStudents();
	  
  }
  @RequestMapping(value="/adds",method=RequestMethod.POST,produces=MediaType.APPLICATION_JSON_VALUE)
  public   void adds(@RequestBody Student stu)
  {
	
	  studentBo.insertStudent(stu);
	  
  } 
  @RequestMapping(value="/upds",method=RequestMethod.PUT,produces=MediaType.APPLICATION_JSON_VALUE)
  public    void  upd(@RequestBody Student stu)
  {
	 Student st = studentBo.getStudentbyId(stu.getId());
	if(st!=null)
	{
		
		studentBo.updateStudent(st);
	}
	else
	{
		studentBo.insertStudent(stu);
	}
	   
	  
  }
@RequestMapping(value="/dels/{id}",method=RequestMethod.DELETE,produces=MediaType.APPLICATION_JSON_VALUE)
  public   void del(@PathVariable("id") long id)
  {
	
	studentBo.deleteStudent(id);
	  
  } 
@RequestMapping(value="/get/{id}",method=RequestMethod.GET,produces=MediaType.APPLICATION_JSON_VALUE)
public   Student get(@PathVariable("id") long id)
{
	
	return studentBo.getStudentbyId(id);	  
} 
}

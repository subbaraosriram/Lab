package com.mphasis.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mphasis.demo.bo.AssignamentBo;
import com.mphasis.demo.entities.Assignament;

@RestController
@RequestMapping("/assignaments")
public class AssisnmentController {
	@Autowired
	AssignamentBo assignamentBo;
	@RequestMapping(value="/getall",method=RequestMethod.GET,produces=MediaType.APPLICATION_JSON_VALUE)
	  public  List<Assignament> getAll()
	  {
		
		  return assignamentBo.getAssignments();
		  
	  }
	 @RequestMapping(value="/add",method=RequestMethod.POST,produces=MediaType.APPLICATION_JSON_VALUE)
	  public   void adds(@RequestBody Assignament assig)
	  {
		
		 assignamentBo.insertAssignment(assig);
		  
	  } 
	@RequestMapping(value="/upda",method=RequestMethod.PUT,produces=MediaType.APPLICATION_JSON_VALUE)
	  public    void  add(@RequestBody Assignament assig)
	  {
		Assignament a = assignamentBo.getAssignamentbyId( assig.getAid());
		if(a!=null)
		{
			assignamentBo.insertAssignment(assig);
		}
		else
		{
			assignamentBo.updateAssignment(assig);
		}
		   
		  
	  }
	@RequestMapping(value="/del/{id}",method=RequestMethod.DELETE,produces=MediaType.APPLICATION_JSON_VALUE)
	  public   void del(@PathVariable("id") int id)
	  {
		
		assignamentBo.deleteAssignment(id);
		  
	  }
}

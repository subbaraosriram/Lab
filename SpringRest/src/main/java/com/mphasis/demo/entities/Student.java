package com.mphasis.demo.entities;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Student implements Serializable
{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
    @Column(nullable=false,length=25)
    private String name;
   @Column(nullable=false)
   private int age;
   @OneToMany(mappedBy="student" ,cascade=CascadeType.ALL,fetch=FetchType.LAZY)
   @JsonIgnore
   private Set<Assignament> assignments;
public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public Set<Assignament> getAssignments() {
	return assignments;
}
public void setAssignments(Set<Assignament> assignments) {
	this.assignments = assignments;
}
@Override
public String toString() {
	return "Student [id=" + id + ", name=" + name + ", age=" + age + ", assignments=" + assignments + "]";
}
 }

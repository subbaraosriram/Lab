package com.mphasis.demo.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Assignament implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	private long Aid;
    @Column(nullable=false)
    private String topic;
    @Column(nullable=false)
    private int grade;
    @ManyToOne(fetch=FetchType.EAGER,optional=false)
    @JoinColumn(name="student_id",nullable=false)
    private Student student;
	public long getAid() {
		return Aid;
	}
	public void setAid(long aid) {
		Aid = aid;
	}
	public String getTopic() {
		return topic;
	}
	public void setTopic(String topic) {
		this.topic = topic;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	@Override
	public String toString() {
		return "Assignament [Aid=" + Aid + ", topic=" + topic + ", grade=" + grade + ", student=" + student + "]";
	}
}

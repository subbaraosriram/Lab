package com.mphasis.traning.basic.exception;
import java.util.Scanner;
public class EmployeeInfo
{
	
	String name,designation,insurence;
	int id,salary;
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name,Designation,salary,id,insurence");
		String name = sc.nextLine();
		String designation  = sc.nextLine();
		int salary  = sc.nextInt();
		int id      = sc.nextInt();
		String insurence = sc.nextLine();
		
	}
	public void display()
	{
		System.out.println("name :"+name+"designation :"+designation+"salary : "+salary+"id : "+id+"insurence scheme:"+insurence);
		
	}
}	
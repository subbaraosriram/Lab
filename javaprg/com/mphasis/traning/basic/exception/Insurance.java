package com.mphasis.traning.basic.exception;
import java.util.Scanner;
interface EmployeeService
{
	    public String GetInsurance();
}

class Employee implements EmployeeService
{
   private String designation;
   private  int sal;

   public Employee(String designation, int sal)
   {
   	  this.designation=designation;
   	  this.sal=sal;
   } 
    public String GetInsurance()
    {   String insurance="";
    	 if(this.designation.equalsIgnoreCase("SystemAssociate")&& (sal>5000 && sal<20000))
    	 {
    	 	  insurance="Scheme C";

    	 }
    	 else if(this.designation.equalsIgnoreCase("Programmer")&& (sal>=20000 && sal<40000))
    	 {
    	 	  insurance="Scheme B";

    	 }
    	 else if(this.designation.equalsIgnoreCase("Manager")&& (sal>=40000))
    	 {
    	 	  insurance="Scheme A";

    	 }
    	else if(this.designation.equalsIgnoreCase("Clerk")&& (sal<5000))
    	 {
    	 	  insurance="No Scheme";

    	 }
    	 else
    	 {
             insurance="No Scheme";

    	 }
    	 
       return insurance;
    	 
    }





}

public class  Insurance 
{
	 public static void main(String args[])
	 {
	 	   
	 	  Scanner sc=new Scanner(System.in);
	 	  
	 	   System.out.println("Enter the employee   1. Designtion 2. salary details");
	 	   Employee em=new Employee(sc.nextLine(),sc.nextInt());
           System.out.println("The insurance scheme of the given person is :");
           System.out.println(em.GetInsurance());
           System.out.println(" for Repate again press 'y'");
          
	 }
}

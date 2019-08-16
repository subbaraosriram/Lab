import java.util.Scanner;
public class EmpExcp
{
	 public static void main (String args[])
	 {
          String fname,lname;
	      int age,id;
		  Scanner sc = new Scanner(System.in);
          System.out.println("Enetr first last name and age,id");
          fname=sc.nextLine();
		  fname=fname.trim();
          lname=sc.nextLine();
		  lname=lname.trim();
          age = sc.nextInt();
          id = sc.nextInt();
          try{
                if(fname.equals("") || lname.equals(""))
                  throw new NameException("Name should not be empty");
               else
			   {  
		          
                Employee e1 = new Employee(fname,lname,age,id);			
                System.out.println(e1);
			}			  
		  }
		  catch(NameException e)
		  {
			  System.out.println(e.getMessage());
		  }
			  
     }
}	 
class Employee
{
	String fname,lname;
	int age,id;
	Employee(String fname,String lname,int age,int id)
	{
		this.fname=fname;
		this.lname=lname;
		this.age=age;
		this.id=id;
	}
	public String toString()
	{
	      	return fname+"\n"+lname+"\n"+age+"\n"+id;
	}
}
class  NameException extends Exception
{
	NameException(String message)
	{
				super(message);
	}
}
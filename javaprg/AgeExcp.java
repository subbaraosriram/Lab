import java.util.Scanner;
class Varify{
	int age;
	Varify(int age)
	{
		 this.age=age;
	}
	public String  toString()
	{
		return "Age of \n"+age;
	}
}
public class  AgeExcp
{
	 public static void main (String args[])
	 {
		   int age;
		   Scanner sc = new Scanner(System.in);
           
			System.out.println("age");
			age = sc.nextInt();
			try{
			if(age < 15)
				throw new AgeException("Age was not accepted");
			else
			{  
		       
               Varify a1 = new Varify(age);			
            System.out.println(a1);
			}
			}
	      catch(AgeException e)
	      {
		 System.out.println(e.getMessage());
	 }
}	
} 
class  AgeException extends Exception
{
	AgeException(String message)
	{
		super(message);
	}
}
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class  ExeptionsT2
{
	 public static void main (String args[])throws Exception
	 {
           
		 try(  BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) 
		    
		   {
				  
				 String s= br.readLine();
				 System.out.println(s);
			}
             
		  
                			   
     }
}	 
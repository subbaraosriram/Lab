import java.io.BufferReader;
import java.io.InputStreamReader;
public class  ExeptionsT
{
	 public static void main (String args[])throws Exception
	 {
            
		   BufferReader br = null;
		    
		   try{
				 br = new BufferReader(new InputStreamReader(System.in));
				 
                 String s= br.readLine();
				 System.out.println(s);
			}
           catch(IOException e){
			   e.printStackTrace();
		   }
		   finally
		   {
			   br.close();
		   }
		   
                			   
     }
}	 
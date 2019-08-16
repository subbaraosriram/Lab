import java.util.Scanner;
class Bapp{
 private 
         double ht,we;
		 int nofrom;
 public 
         Bapp(double ht,double we,int nofrom)
         {
			 this.ht=ht;
			 this.we=we;
			 this.nofrom=nofrom;
		 }		
         void output()
		 {
			  System.out.println("info of buiding : "+ ht+" "+we+" "+nofrom);
		 }			 
}
public class  Build
{
	
	 public static void main (String args[])
	 {
               Scanner sc=new Scanner(System.in);   
               Bapp[] b=new Bapp[10];
			   System.out.println("Enter no of Buildings(1 - 9)");
			   int n=sc.nextInt();
               for(int i=0;i<n;i++)
			   {				   
			    System.out.println("Enter height,weight,no of rooms with space as saparater");
         	    b[i]=new Bapp(sc.nextInt(),sc.nextInt(),sc.nextInt());
			   
			   }
			   int j=1;
              for(int i=0;i<n;i++)
			  {   
         		  System.out.println(j+". ");				  
                    b[i].output();		
                    j++;					
               }
	 
	 }
}	 
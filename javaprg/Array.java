import java.util.Scanner;
class VarArgDemo
{
	public void show(int...a)
	{
		for(int i:a)
			System.out.println(i);
	}
}
public class Array
{
	 public static void main (String args[])
	 {
           VarArgDemo v=new VarArgDemo();
           v.show(45,67,45);		   
		   Scanner sc=new Scanner(System.in);
			int n=sc.nextInt();
            int a[] =new int [n];
		    int t;
			for(int i=0;i<(n-1);i++)
			{
			     a[i]=sc.nextInt();
			}
			for(int j=0;j<(n-1);j++)
			for(int i=0;i<(n-1);i++)
			{
			    if(a[i] >a[i+1])
				{ t=a[i+1];
                    a[i+1]=a[i];
                    a[i]=t;					
                }
			}	for(int i=0;i<(n-1);i++)
			System.out.println(a[i]);    
     }
}	 
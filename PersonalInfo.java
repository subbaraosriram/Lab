import java.util.Scanner;
import java.util.Date;
class Info{
    String fname;
    String lname;
    char g;
    double we;
    int age;
    Info(String fname,String lname,char g,double we,int age)
    {
     this.fname=fname;
     this.lname=lname;
     this.g=g;
     this.we=we;
     this.age=age;
    }
    void display()
    {
         System.out.println("Personal Info \n---------------------- \n ");
          System.out.println(  " First Name:"+fname+
                               " \nLast Name:"+lname+
                               " \nGender:"+g+
                               " \nAge:"+age+
                               " \nWeight:"+we);
       
    }
}
public class PersonalInfo
{
    public static void main(String args[])
    {
        String fname;
        String lname,cud;
        char g;
        double w;
        int d,m,y,age;
        Scanner sc = new Scanner(System.in);
        Date date=new Date();
        int year = date.getYear();
        System.out.println("Personal Info \n---------------------- \n First Name: Divya \nLast Name: Bharathi \nGender: F \nAge: 20 \nWeight: 85.55");
        System.out.println("Enter First Name , Last Name , Gender , Weight , Date of birth(dd-mm-yyyy)");
        fname=sc.next();
        lname=sc.next();
        g=sc.next().charAt(0);
        w=sc.nextDouble();
        d=sc.nextInt();
        m=sc.nextInt();
        y=sc.nextInt();
        age = year-y;                        
        Info i= new Info(fname,lname,g,w,age);
        i.display();
    }
}
import java.util.*;
class Account  throws Insufficiant
{
    private int amount,flag,number,t;
    private String name;
    long Aadhar,phone;
    Account(int number,String name,long Aadhar,long phone,int t,int inia)
    {
       this.name=name;
       this.Aadhar=Aadhar;
       this.number=number;
       this.phone=phone;
       this.t=t;
       amount=inia;
    }
    Date date=new Date();
    

    void withdraw(int amt) throws Insufficiant
    {
       if( t == 1)
       {  
        
             if((amount - amt) >= 1000 && flag < 2)
             {
                        amount -= amt;
                        System.out.println(" Withdraw amount is : " +amt);
                        flag++;
             }
             
              else
              {
                        throw new Insufficiant("minimum balance is required or limite is exprided ");
                        
              }  
       }
       }
      else
      {
        if((amount - amt) >= 10000)
          {
              amount -= amt;
              System.out.println(" Withdraw amount is : " +amt);
          } 
        else
          {
            System.out.println("minimum balance is required ");
          }  
      }

    void deposite(int depamount)
    {
        amount +=depamount;
    }
    
    void dispaly()
    {
      System.out.println("Accuntent name : "+name+"\n Aadhar Number :"+Aadhar+"\n Amount : " +amount+"\n Phone Number : "+phone+" \n Account Number"+number);
    }
}
public class BankAccount3
{
    public static void main(String args[])
    {
          Scanner sc= new Scanner(System.in);
          int opt1,opt2,amt,act,act2,bal,actnu=0,t,inia;
          char r;
          String name;
          long aad,pho;
          Account[] A = new Account[100];
        do{
            System.out.println("Choose option :" );
            System.out.println(" 1.create Account(new user) \n 2.Deposite \n 3.Withdraw \n 4.Balance checking \n 5.Transfor amount ");
            opt1=sc.nextInt();
            switch(opt1)
                       {
                          case 1:
                                  System.out.println("Enetr name aadhar phone");
                                  name = sc.next();
                                  aad  = sc.nextLong();
                                  pho  = sc.nextLong();
                                  System.out.println("\n Savings -------------------> 1\n Current -------------------------> 2");
                                  t=sc.nextInt();
                                  System.out.println("Enter Inicial amount");
                                  inia=sc.nextInt();
                                  A[actnu] = new Account(actnu,name,aad,pho,t,inia);
                                  System.out.println("Account number"+actnu);
                                  actnu++;
                                  break;
                           case 2:
                                  System.out.println("Enter Account Number");
                                  act=sc.nextInt();
                                  System.out.println("Enter amount");
                                  amt=sc.nextInt();
                                  A[act].deposite(amt);
                                  break;
                           case 3:       
                                  System.out.println("Enter Account Number");
                                  act=sc.nextInt();
                                  System.out.println("Enter amount");
                                  amt=sc.nextInt();
                                  A[act].withdraw(amt);
                                  break;
                           case 4:
                                   System.out.println("Enter Account Number");
                                   act=sc.nextInt();       
                                   A[act].dispaly();
                                   break;
                           case 5:
                                    System.out.println("next version it will be added");
                                    System.out.println("Enter Account Number (from):");
                                    act=sc.nextInt();
                                    System.out.println("Enter Account Number (to)");
                                    amt=sc.nextInt();
                                    break;
                           default:
                                     System.out.println("Choosen Wrong option");
                                     System.exit(0);
                                     break;
                         }
                         System.out.println(" Do want to repeate");
                         r = sc.next().charAt(0);
        }while(r == 'Y' || r == 'y');    
        catch(Insufficiant  e)
        {
            System.out.println(e.getMessage());
        }  
    }
}
class  Insufficiant extends Exception
{
	Insufficiant(String message)
	{
		super(message);
	}
}
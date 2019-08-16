import java.util.*;
class Saving
{
    private int amount,flag=0;
   
    

    void withdraw(int amt,String )
    {
        
        if((amount - amt) >= 1000 && flag < 2)
          {
              amount -= amt;
              System.out.println(" Withdraw amount is : " +amt);
              flag++;
          } 
        else
        {
            System.out.println("minimum balance is required or limite is exprided ");
        }  
    }
    void deposite(int depamount)
    {
        amount +=depamount;
    }
}
class Current
{
    private int amount;
     void withdraw(int amt)
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
}
 public class BankAccount
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int opt1,opt2,amt;
        char r;
        Date date=new Date();
        Saving s = new Saving(); 
        Current c = new Current();
        do{
            System.out.println("Choose option :" );
            System.out.println(" 1.Savings \n 2.Current \n 3.create Account");
            opt1=sc.nextInt();
            switch(opt1)
            {
                 case 1 :  
                          System.out.println("Choose option in saving account :" );
                          System.out.println(" 1 . Withdraw \n 2. deposite");
                         
                          opt2=sc.nextInt(); 
                          switch(opt2)
                          {
                               case 1: 
                                       System.out.println("Enetr amount to withdraw : ");
                                       amt = sc.nextInt();
                                       s.withdraw(amt,date);
                                       break;
                               case 2:
                                       System.out.println("Enetr amount to deposite");
                                       amt = sc.nextInt();
                                       s.deposite(amt);
                                       break;
                                default:
                                       System.out.println("Choosen Wrong option");
                                       System.exit(0);

                          }
                          break;
                 case 2 :         
                          System.out.println("Choose option in current account :" );
                          System.out.println(" 1 . Withdraw \n 2. deposite");
                  
                          opt2=sc.nextInt(); 
                          switch(opt2)
                          {
                               case 1: 
                                       System.out.println("Enetr amount to withdraw : ");
                                       amt = sc.nextInt();
                                       c.withdraw(amt);
                                       break;
                               case 2:
                                       System.out.println("Enetr amount to deposite");
                                       amt = sc.nextInt();
                                       c.deposite(amt);
                                       break;
                            default:
                                       System.out.println("Choosen Wrong option");
                                       System.exit(0);

                          }
                          break;
           }
           System.out.println(" Do want to repeate");
            r = sc.next().charAt(0);
        }while(r == 'Y' || r == 'y');
                 
    }
}
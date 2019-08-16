import java.util.Scanner;
abstract class Account
{
  private String acc_holder_name;
  private long acc_num;
  protected double balance;
  Account(String acc_holder_name,long acc_numm,double balance)
  {
    this.acc_holder_name=acc_holder_name;
    this.acc_num=acc_num;
    this.balance=balance;
  }
  public double getBalance()
  {
      return balance;
  }
  public abstract double withdraw(double amount);
  public double deposit(double amount)
  {
      if((amount % 100) == 0)
       balance+=amount;
      else
      System.out.println("problem with deposit alloweed multiples of 100s");
      return balance; 
  }
}
class Saving extends Account
{
    Saving(String acc_holder,long acc_num,double balance)
    {
        super(acc_holder,acc_num,balance);
    }
    public double withdraw(double amount)
    {
        if( (this.balance-amount) >= 1000)
        {
            this.balance-=amount;
        }
        else
        {
            System.out.println("Insufficiante balance ");
        }
        return balance;
    }
}
class Current extends Account
{
    Current(String acc_holder,long acc_num,double balance)
    {
        super(acc_holder,acc_num,balance);
    }
    public double withdraw(double amount)
    {
        if( (this.balance-amount) >= 10000)
        {
            this.balance-=amount;
        }
        else
        {
            System.out.println("Insufficiante balance ");
        }
        return balance;
    }
}
public class BankApp
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
       
        int opt;
        System.out.println("Welcome to Bank \n 1.Saving \n 2.Current");
         int choice = sc.nextInt();
        if(choice == 1)
        {
            
                     System.out.println("\n Enter Account Holder name  Account number  3.Balance");
                      Account s=new Saving(sc.next(),sc.nextLong(),sc.nextInt());
                      do{
                      System.out.println("Account  with balance : "+s.getBalance()+"\n 1.withdraw \n 2.deposite \n 3.exit");
                      opt=sc.nextInt();
                      switch(opt)
                      {
                          case 1:
                                     System.out.println("Enter amount to withdraw");
                                     System.out.println(s.withdraw(sc.nextDouble()));
                                     break;
                         
                          case 2:
                                     System.out.println("Enter amount to deposite");
                                     System.out.println(s.deposit(sc.nextDouble()));
                                     break;
                          case 3:    System.exit(0);
                                    break;
                                               
                      }
                      
                      }while(true);
        }
         else if(choice == 2)  {
                      System.out.println("\n current Enter Account Holder name Account number  3.Balance");
                      Account c=new Current(sc.next(),sc.nextLong(),sc.nextInt());
                      do{
                      System.out.println("Account created with balance : "+c.getBalance()+"\n 1.withdraw \n 2.deposite \n 3.exit");
                      opt=sc.nextInt();
                      switch(opt)
                      {
                          case 1:
                                     System.out.println("Enter amount to withdraw");
                                     System.out.println(c.withdraw(sc.nextDouble()));
                                     break;
                         
                          case 2:
                                     System.out.println("Enter amount to deposite");
                                     System.out.println(c.deposit(sc.nextDouble()));
                                     break;
                          case 3:    System.exit(0);
                                     break;
                                               
                      }
                    
                      }while(true);
         }
                     
            else{
                        System.out.println("choosen wrong option");
                        System.exit(0);  
                           
                }
        }
    }

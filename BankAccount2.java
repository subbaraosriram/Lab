import java.util.*;
class Account
{
    private int amount,camount,flag,number;
    private String name;
    Account(int number,String name)
    {
      this.name=name;
       this.number=number;
    }
    Date date=new Date();
    

    void saveWithdraw(int amt)
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
    void curWithdraw(int amt)
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
    void Deposite(int depamount)
    {
        amount +=depamount;
    }
    void curDeposite(int depamount)
    {
        camount +=depamount;
    }
    void dispaly()
    {
      System.out.println("Accuntent name : "+name+"\n Amount : " +amount);
    }
    int cdispaly()
    {
      return camount;
    }
}
public class BankAccount2
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int opt1,opt2,amt,act,bal,actnu=0;
        char r;
        String name;
         Account[] A = new Account[10];
        do{
            System.out.println("Choose option :" );
            System.out.println(" 1.Savings \n 2.Current \n 3.create Account \n 4.Balance checking \n 5.Transfor amount ");
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
                                       System.out.println("Enter Account number");
                                       act = sc.nextInt();
                                       if(act < 10)
                                       A[act].saveWithdraw(amt);
                                       break;
                               case 2:
                                       System.out.println("Enetr amount to deposite");
                                       amt = sc.nextInt();
                                       System.out.println("Enter Account number");
                                       act = sc.nextInt();
                                       if(act < 10)
                                       A[act].Deposite(amt);
                                       break;
                              
                                default:
                                       System.out.println("Choosen Wrong option");
                                       System.exit(0);
                                       break;

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
                                       System.out.println("Enter Account number");
                                       act = sc.nextInt();
                                       if(act < 10)
                                        A[act].curWithdraw(amt);
                                       break;
                               case 2:
                                       System.out.println("Enetr amount to deposite");
                                       amt = sc.nextInt();
                                       System.out.println("Enter Account number");
                                       act = sc.nextInt();
                                       if(act < 10)
                                       A[act].Deposite(amt);
                                       break;
                               default :
                                       System.out.println("Choosen Wrong option");
                                       System.exit(0);
                                       break;
                                 
                         }
                          break;
                  case 3:
                            System.out.println("Enter name ");
                            name=sc.nextLine();
                            A[actnu] = new Account(actnu,name);  
                            System.out.println("Account number is : "+actnu);
                            actnu++;    
                            break;
                   case 4:
                           System.out.println("Enter Account number");
                           act = sc.nextInt();
                           if(act < 10)
                           {
                                 A[act].dispaly();
                                //System.out.println("Balance in Savings Account  "+act+":"+A[act].dispaly());
                                //System.out.println("Balance in Current Account  "+act+":"+A[act].cdispaly());
                           }
                           break;
                   case 5:        
                           System.out.println("This feature is not added");
                           break;
                   default:
                           System.out.println("Choosen Wrong option");
                           System.exit(0);
                           break;        

           }
           System.out.println(" Do want to repeate");
            r = sc.next().charAt(0);
        }while(r == 'Y' || r == 'y');
                 
    }
}
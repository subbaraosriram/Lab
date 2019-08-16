    import java.util.Scanner;
    public class Puzzles
    {    

         boolean teen(int n1,int n2,int n3)
         {

            if( n1 >= 13 || n2 >= 13 || n3 >= 13)
                if(n1 <= 19 || n2 <= 19 || n3 <= 19)
                {
                    return true;
                }
                else
                    return false;
            else  
                   return false;			
         }
         boolean monkey(String s1,String s2)
         {



               if( s1.equals("asmile") && s2.equals("bsmile"))
                   return true;
               else if( !(s1.equals("asmile")) &&!( s2.equals("bsmile")))
                   return true;
               else 
                   return false;
         }
         int sumDouble(int n1,int n2)
         {

             if(n1 == n2)
             {
                 return (n1*4);
             }
             else
                 return (n1+n2);
         }
         int diff21(int n1)
         {


             if(n1 > 21)
                 return (n1-21)*2;
             else
                 return (21-n1);
         }
         boolean parrotTrouble(int n1)
         {


                      if(n1 >=0 && n1 <=23)
                      {
                          if( n1 > 20 || n1 < 7)
                              return true;
                          else
                              return false;
                      }
                      else
                      {
                          return false;
                      }					  
         }
         boolean makes(int n1,int n2)
         {

               if(n1 == 10 || n2 == 10)
                   return true;
               else if( (n1+n2) == 10)
                   return true;
               else
                   return false;
         }
         int max1020(int n1,int n2)
         {

               if(n1 >= n2)
                   if( n1 < 20 && n1 > 10)
                        return n1;
                   else
                        return 0;
               else if(n2 > n1 )
                   if( n2 < 20 && n2 > 10)
                        return n2;
                  else
                        return 0;
              else return 0;		
         }
         int teenSum(int n1,int n2)
         {


               if( (n1 >= 13 && n1 <= 19)) 
               {
                   return n1;
               }
               else if ((n2 >= 13 && n2 <= 19) )
               {
                   return n2;
               }
               else
                   return n1+n2;
         }
         boolean squirrelPlay(int n1,String n3)
         {


               if(n3.equals("Y"))
               {
                   if(n1 >= 60 && n1 <=100)
                       return true;
                   else
                       return false;
               }
               else if(n3.equals("N"))
               {
                   if(n1 >= 60 && n1 <=90)
                       return true;
                   else
                       return false;
               }
               else return false;
         }
         void stringTimes(int n1,String n4)
         {


               for(int i=0;i<n1;i++)
               System.out.println(n4);			   
         }
         void flag()
         {
             for(int i=1;i<=9;i++)
                 if(i%2 == 0)
                     System.out.println(" * * * * * ==========================");

                 else
                     System.out.println("* * * * * * =========================");
              for(int i=0;i<6;i++)
                      System.out.println("============================"); 
       }
         void bintodec(String s)
         {


              System.out.println("decimal number : "+Integer.parseInt(s,2));
       }
         boolean sleepIn(String s,String s1)
         {
           if(s.equals("N") && s1.equals("N"))
             return true;
          else
             return false;		  
       }
         void triangle()
         {
               int n=10;
               int k=1;
                for(int i=1;i<=n;i++)
                { 
                        for(int j=1;j<=i;j++)
                        {   System.out.print(k+" ");
                              k++;
                        }	  
                    System.out.println(""); 
                }
        }		
         public static void main (String args[])
         {

               Ftrinagle  f1=new Ftrinagle ();
                int n1,n2,n4;
                String s,s1,s2,s3,n3;
                Scanner sc=new Scanner(System.in);
                System.out.println(" 1.FloyedTriangle\n 2.hasTeen\n 3.sleepIn\n 4.monkeyTrouble\n 5.sumDouble\n 6.diff21\n 7.parrotTrouble\n 8.makes\n 9.max1020\n 10.teensum\n 11.squirrelPlay\n 12.stringTimes\n 13.flag\n 14.biarytodecimal ");
                int ch=sc.nextInt();
                switch(ch){
                            case 1:
                                     f1.triangle();
                                     break;
                            case 2:		 
                                        System.out.println("Enter 3 numbers");		 
                                        n1=sc.nextInt();
                                        n2=sc.nextInt();
                                        n4=sc.nextInt();
                                        boolean t=f1.teen(n1,n2,n4);
                                        System.out.println("Teen : "+t);
                                        break;
                            case 3:		
                                        System.out.println("Enter Weekday or not(Y or N)");
                                        s1=sc.next();
                                        System.out.println("Enter Vacation or not(Y or N)");
                                        s=sc.next();
                                        boolean sl=f1.sleepIn(s,s1);
                                        System.out.println("sleep or not "+ sl);
                                        break;
                            case 4:
                                        System.out.println("Enter Smill");
                                        s1=sc.next();
                                        s2=sc.next();						            
                                        boolean m=f1.monkey(s1,s2);
                                         System.out.println("trouble "+m);
                                         break;
                            case 5:			
                                         System.out.println("Enter 2 numbers");
                                         n1=sc.nextInt();
                                         n2=sc.nextInt();
                                         int st=f1.sumDouble(n1,n2);
                                         System.out.println("SumDuble : "+ st);						
                                         break;
                            case 6:		
                                        System.out.println("Enter one number");
                                        n1=sc.nextInt();
                                        int d=f1.diff21(n1);
                                        System.out.println("diff 21 : "+ d);
                                        break;
                            case 7:		
                                        System.out.println("Enter one number");
                                        n1=sc.nextInt();
                                        boolean pt=f1.parrotTrouble(n1);
                                        System.out.println("parrotTrouble : "+ pt);
                                        break;
                            case 8:		
                                          System.out.println("Enter 2 numbers");
                                          n1=sc.nextInt();
                                          n2=sc.nextInt();

                                         boolean ma=f1.makes(n1,n2);
                                         System.out.println("makes equals or sum is10 : "+ ma);	
                                         break;
                            case 9:		
                                             System.out.println("Enter 2 numbers");
                                             n1=sc.nextInt();
                                             n2=sc.nextInt();

                                            int m10=f1.max1020(n1,n2);
                                             System.out.println("maximium between 10-20 or not : "+ m10);						
                                             break;
                            case 10:	
                                            System.out.println("Enter 2 numbers");
                                             n1=sc.nextInt();
                                             n2=sc.nextInt();
                                            int ts=f1.teenSum(n1,n2);
                                            System.out.println("teenSum is between  : "+ ts);
                                             break;	
                            case 11:			
                                             System.out.println("Enetr temperature");
                                             n1=sc.nextInt();
                                             System.out.println("Summer or not(Y or N):");
                                             n3=sc.next();                                         
                                            boolean sp=f1.squirrelPlay(n1,n3);
                                              System.out.println("squirrel will Play"+ sp);
                                             break;	
                            case 12:		
                                                 System.out.println("Enter number");
                                                 n1=sc.nextInt();
                                                 System.out.println("Enter string");
                                                 n3=sc.next();
                                          f1.stringTimes(n1,n3);	 
                                          break;
                           case 13:       f1.flag();
                                          break;
                            case 14:		
                                             System.out.println("Enter biary number");
                                              s=sc.next();
                                             f1.bintodec(s);
                                              break;
                            default:          System.out.println("Out of options");
                                               break;						
                }						
         }
    }	 
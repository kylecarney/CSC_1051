//********************************************************************
//  OnePercent.java       Author: Kyle Carney
//
//  Demonstrates the creation and use of multiple Account objects.
//********************************************************************

import java.text.NumberFormat;

public class OnePercent
{
   //-----------------------------------------------------------------
   //  Creates some bank accounts and prints balances
   //-----------------------------------------------------------------
   public static void main (String[] args)
   {
      //create accounts trump, gates, musk, and uncle sam
      Account acct1 = new Account ("Donald Trump", 20230715, 400.00);
      Account acct2 = new Account ("Bill Gates", 31558040, 500.00);
      Account acct3 = new Account ("Elon Musk", 44003050, 600.00);
      Account acct4 = new Account ("Uncle Sam", 999999999);
		
      //print before taxes
      System.out.println("Before taxes \n");
      //print accounts
      System.out.println (acct1);
      System.out.println (acct2);
      System.out.println (acct3);
      System.out.println (acct4);
		
      //add account balances and get bankTotal
      double bankTotal = 0.00;
      bankTotal = acct1.getBalance() + 
                  acct2.getBalance() +
                  acct3.getBalance() +
                  acct4.getBalance();
          
      NumberFormat fmt = NumberFormat.getCurrencyInstance();            
      System.out.println("\nBank total: " + fmt.format(bankTotal) + "\n");
     
     //withdrawPercent = accts - 35%
     double withdrawPercentAccount1 = (acct1.getBalance()* .35);
     double withdrawPercentAccount2 = (acct2.getBalance()* .35);
     double withdrawPercentAccount3 = (acct3.getBalance()* .35);
     
     //acct1 withdraw 35%
     acct1.withdraw(withdrawPercentAccount1);
     acct2.withdraw(withdrawPercentAccount2);
     acct3.withdraw(withdrawPercentAccount3);
     
     //acct1 deposit
     acct4.deposit(withdrawPercentAccount1);
     acct4.deposit(withdrawPercentAccount2);
     acct4.deposit(withdrawPercentAccount3);
     
     //print after taxes
     System.out.println("After taxes \n");
     //print accounts
     System.out.println(acct1);
     System.out.println(acct2);
     System.out.println(acct3);
     System.out.println(acct4);
     
             
     System.out.println("\nBank total: " + fmt.format(bankTotal) + "\n");
   }
}
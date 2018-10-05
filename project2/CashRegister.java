//**********************************************************
//  CashRegister.java       Author: Kyle Carney
//
//  CSC 1051 Project 2: Cash Register ***                     
//
//***********************************************************

import java.util.Scanner;
//class:
public class CashRegister
{
   //method:
   public static void main (String[] args)
   {
   
   //variables: cents, quarters, dimes, nickels, pennies
   int cents, quarters, dimes, nickels, pennies;
 
//algorithm
      //1. input cents
         Scanner scan = new Scanner(System.in);
         System.out.print ("Enter an amount (in cents): ");
         cents = scan.nextInt(); 
      //2. print cents
         System.out.println (cents + " cents");
      //3. output quarters, dimes, nickels, pennies
         quarters = cents / 25;
         dimes = (cents - (quarters * 25))/10; 
         nickels = (cents - (dimes * 10 + quarters * 25)) / 5;
         pennies = (cents -((quarters * 25)+(dimes * 10)+(nickels * 5))/1);
      //4. print q, d, n, and p
         System.out.println ("\t\t\t\t" + quarters + " quarters");
         System.out.println ("\t\t\t\t" + dimes + " dimes");
         System.out.println ("\t\t\t\t" + nickels + " nickels");
      // print penny if p = 1 else print pennies
         if (pennies == 1) 
            System.out.println ("\t\t\t\t" + pennies + " penny");
         else {
            System.out.println ("\t\t\t\t" + pennies + " pennies");
            }
 }
}
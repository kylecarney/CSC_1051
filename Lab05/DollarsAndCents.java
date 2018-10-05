//*************************************************************
//  DollarsAndCents.java       Author: Kyle Carney
//  Project 3
//*************************************************************
import java.util.Scanner;
public class DollarsAndCents
{

public static void main (String[] args){
      String money;
      int i = 0;
      Scanner scan = new Scanner(System.in); 
   
      System.out.print ("How much? ");
      money = scan.next();
   
       //money = money.trim();
      double amount = Double.parseDouble(money.substring(1));
      int dollars = (int) amount;
      int cents = (int) ((amount - dollars) * 100);
      System.out.print("That is " + dollars + 
         " dollars and " + cents + " cents.");
   
      
    
       
   }
}

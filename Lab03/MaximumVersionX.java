//********************************************************************
//  MaximumVersionX.java       Author: ***
//
//  CSC 1051 Lab 3: Computing the maximum - Version ***
//
//********************************************************************

import java.util.Scanner;

public class MaximumVersionX
{
   //-----------------------------------------------------------------
   // inputs three numbers and displays the maximum of the three
   //-----------------------------------------------------------------

   public static void main (String[] args)
   {
     double a, b, c, max;
     Scanner scan = new Scanner(System.in);

     // input a, b, c

     System.out.print ("Input three numbers: ");
     a = scan.nextDouble();
     b = scan.nextDouble();
     c = scan.nextDouble();

     // output values entered
     System.out.println("Here are your numbers: " + a + "  " + b + "  " + c);

     // *** Add code to find max:
      if (a > b)
         if ( a > c)
            max = a;
         else max = c;
         else
            if (b > c)
               max = b;
            else 
               max = c;
               
     // output max
     System.out.println("maximum = " + max);   
    }
}
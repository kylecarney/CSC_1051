//********************************************************************
//  MaximumVersionX.java       Author: ***
//
//  CSC 1051 Lab 3: Computing the maximum - Version 3***
//
//********************************************************************

import java.util.Scanner;

public class MaximumVersion3
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
     if (a >= b)
         max = a;
     else 
         max = b;
     if (c >= max)
         max = c;
 
               
     // output max
     System.out.println("maximum = " + max);   
    }
}
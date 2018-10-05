//********************************************************************
//  MaximumVersionX.java       Author: ***
//
//  CSC 1051 Lab 3: Computing the maximum - Version 2***
//
//********************************************************************

import java.util.Scanner;

public class MaximumVersion2
{
   //-----------------------------------------------------------------
   // inputs three numbers and displays the maximum of the three
   //-----------------------------------------------------------------

   public static void main (String[] args)
   {
     double a, b, c, max;
     max = 1.0;
     Scanner scan = new Scanner(System.in);

     // input a, b, c

     System.out.print ("Input three numbers: ");
     a = scan.nextDouble();
     b = scan.nextDouble();
     c = scan.nextDouble();

     // output values entered
     System.out.println("Here are your numbers: " + a + "  " + b + "  " + c);

     // *** Add code to find max:
     max = 0;
     if (a >= b && a >= c)
         max = a;
     if (b >= a && b >= c)
         max = b;
     if (c >= a && c >= b)
         max = c;
               
     // output max
     System.out.println("maximum = " + max);   
    }
}
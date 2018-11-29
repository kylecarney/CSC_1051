//********************************************************************
//  TwoDArray.java       Author: Lewis/Loftus
//
//  Demonstrates the use of a two-dimensional array.
//********************************************************************
import java.lang.Math; 

public class TwoDArray
{
   //-----------------------------------------------------------------
   //  Creates a 2D array of integers, fills it with increasing
   //  integer values, then prints them out.
   //-----------------------------------------------------------------
   public static void main (String[] args)
   {
      double[][] table = new double[5][5];
      
      int x = 0;
      int y = 0;
      // Print table heading
      System.out.print("# | \t");
      for (int i = 0; i<table[0].length; i++)
         System.out.print(i + "\t\t");
      System.out.println("\n--+------------------");
      
      // Initialize values for table rows and columns
      for (int row=0; row < table.length; row++)
         for (int col=0; col < table[row].length; col++)
            {
            table[row][col] = Math.random();
               if (table[row][col] > .5)
                  {
                  x++;
                  }
               else 
                  {
                  y++;
                  }}
      
      // Print the table
      for (int row=0; row < table.length; row++)
      {
         System.out.print(row +" |\t");
         for (int col=0; col < table[row].length; col++)
            System.out.print (table[row][col] + "\t\t");
         System.out.println();
      }
      System.out.println ("greater than .5: " + x);
      System.out.println ("less than .5: " + y);
   }
}
//********************************************************************
//  TwoDArray.java       Author: Lewis/Loftus
//
//  Demonstrates the use of a two-dimensional array.
//********************************************************************

public class PreTwoDArray
{
   //-----------------------------------------------------------------
   //  Creates a 2D array of integers, fills it with increasing
   //  integer values, then prints them out.
   //-----------------------------------------------------------------
   public static void main (String[] args)
   {
      int[][] table = new int[5][10];
   
      // Load the table with values
      System.out.print("# | \t");
      for (int i = 0; i<table[0].length; i++)
         System.out.print(i + "\t\t");
      System.out.println("\n--+------------------");
      
      for (int row=0; row < table.length; row++)
         for (int col=0; col < table[row].length; col++)
            table[row][col] = row * 10 + col;
  
      
      // Print the table
      for (int row=0; row < table.length; row++)
      {
         System.out.print(row +" |\t");
         for (int col=0; col < table[row].length; col++)
            System.out.print (table[row][col] + "\t\t");
         System.out.println();
      }
   }
}
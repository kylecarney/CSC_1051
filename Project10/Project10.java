//********************************************************************
//  Project10.java       Author: Kyle Carney
//
//  Demonstrates how to analyze real social network data sets
//   using 2D arrays and create output files
//********************************************************************
import java.lang.Math; 
import java.util.Scanner;
import java.io.*;

public class Project10
{
   //-----------------------------------------------------------------
   //  Creates a 2D array of integers, fills it with increasing
   //  integer values, then prints them out.
   //-----------------------------------------------------------------
   public static void main (String[] args) throws IOException
   {
      String line;
      Scanner fileScan;
      int a, b;
   
      boolean[][]table =  new boolean[4][4]; // Declare and instantiate 4x4 2D table array
      
      File myFile = new File("likes.txt"); // Declare likes file
      fileScan = new Scanner (myFile); // Input file
      
      // Read and process each line of the file
      while (fileScan.hasNext())
      {
         {
            a = fileScan.nextInt(); // First number
            b = fileScan.nextInt(); // Second number
            table[a][b] = true; // Set table[a][b] to true
            // Print a & b
            System.out.println(a + " " + b); 
        } 
      }
   }
}

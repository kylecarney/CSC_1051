//********************************************************************
//  Matches.java       Author: Kyle Carney
//
//  Demonstrates how to use input from text files into a 2D array
//********************************************************************
import java.lang.Math; 
import java.util.Scanner;
import java.io.*;

public class Matches
{
    //-----------------------------------------------------------------
    //  Creates a 2D array of integers, fills it with increasing
    //  integer values, then prints them out.
    //-----------------------------------------------------------------
   public static void main(String [] args)  throws IOException
   {
      Scanner fileScan;
      String line;
      
      // Obtain size and names of two files  from command line arguments
      int size = Integer.parseInt(args[0]);
      // System.out.println(args[0]); // Test args[0]
      File inputFile = new File(args[1]);
      // System.out.println(args[1]);  // Test args[1] 
      fileScan = new Scanner (inputFile);
      // Print message to user with the values of size and the first file name obtained
      System.out.println("The size of file " + inputFile + " is " + size + " x " + size);
      // Instantiate a square two-dimensional array of boolean, using size as the number of rows and columns
      boolean [][]table = new boolean [size][size];
      // output file
      String fileName = args[2];
      PrintWriter outFile = new PrintWriter(fileName);
      // Input pairs of values from the file until the end of file; for each pair [ x  y ], 
      // set the value in the 2D array at row x, column y to true
      while (fileScan.hasNext())
      {
         int x = fileScan.nextInt();
         int y = fileScan.nextInt();
         System.out.println (x + " " + y);
         table [x][y] = true;
         // [Optional: Display the boolean array, to make sure values are input from the file correctly)  
         // System.out.println(table[x][y]); // Test values of array
      }
      // After all pairs of values are input, print a message to the user "File Input successfully completed. 
      // Now processing values to find matches."
      System.out.println("File Input successfully completed. " +
                         "Now processing values to find matches.");
       for (int i = 0; i < table.length; i++)
       {
         System.out.print("test");
       }
      //String one = args[0]; 
     // String two = args[1]; 
      
      //int x = Integer.parseInt(one);	
     // int y = Integer.parseInt(two);	
      
      
     // boolean [][]table =  new int[size][size];
      
      
    //  System.out.println(args[0] + args[1] args[2]); 
      
        // Read and process each line of the file
      //  while (fileScan.hasNext())
      //  {
       //    line = fileScan.nextLine();
     //      System.out.println (line.toUpperCase());
      //  }
      
      // close file
      outFile.close();
                
   }
}

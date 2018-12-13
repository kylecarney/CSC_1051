//********************************************************************
//  Matches.java       Author: Kyle Carney
//
//  Demonstrates how to input data from a text file and finds matches
//********************************************************************
import java.lang.Math; 
import java.util.Scanner;
import java.io.*;

public class Matches
{

   public static void main (String[] args) throws IOException
   {
   // 1. obtain size and names of two files from command line arguments
   String file1 = args[0];
   String file2 = args[1];
   // 2. print message to user with the values of size and the first file name obtained
    System.out.println("Size of args is " + args.length + ", and first file is: " + args[0]);
   // 3. instantiate a square 2D array of boolean, using size as the number of rows and cols
   
   // 4. input pairs of values from the file until the end of file; for each pair [ x y ], 
   //    set the value in the 2D array at row x column y to true
   
   // 5. after all pairs of values are input, print a message to the user 
   //    "File Input successfully completed" Now processing values to find matches."
   
   // 6. Process the values in the boolean array, output the matches -- 
   //    two per line, with a space between them -- to a text file names appropriatedly 
   //    using the last command line argument be sure to output each match only once
   
   // 7. print a message to the user stating that the matches have been found and the name 
   //    of the file where they are saved (i.e. last command line argument)        
   }
}

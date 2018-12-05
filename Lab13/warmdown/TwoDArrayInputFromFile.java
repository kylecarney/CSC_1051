//********************************************************************
//  TwoDArrayInputFromFile.java       Author: Kyle Carney
//
//  Demonstrates how to use input from text files into a 2D array
//********************************************************************
import java.lang.Math; 
import java.util.Scanner;
import java.io.*;

public class TwoDArrayInputFromFile
{
   //-----------------------------------------------------------------
   //  Creates a 2D array of integers, fills it with increasing
   //  integer values, then prints them out.
   //-----------------------------------------------------------------
   public static void main (String[] args) throws IOException
   {
      String line;
      Scanner fileScan;

      boolean[][]table =  new boolean[4][4]; // Declare and instantiate 4x4 2D table array
      
      File myFile = new File("likes.txt"); // Declare likes file
      fileScan = new Scanner (myFile); // Input file
      
      // Read and process each line of the file
      while (fileScan.hasNext())
      {
         {
         line = fileScan.nextLine();
         int result = Integer.parseInt(line);
         
         //table[x][y]=true;
         // Need to set likes.txt numbers to true
        // table[a][b] = true;
         System.out.println(line);
         System.out.println(result);
         }
      }
      
      
        
      System.out.print("# | \t");
      for (int i = 0; i<table[0].length; i++) {
         System.out.print(i + "\t\t");
         }
      System.out.println("\n--+----------------------");
      
      // Print the table
      for (int row=0; row < table.length; row++) {
         System.out.print(row +" |\t");
         for (int col=0; col < table[row].length; col++)
            if (table[row][col] == true) {
               System.out.print ("*" + "\t\t");
            }
            else {
               System.out.print ("\t\t");            
            }
         System.out.println();
       }
       System.out.println();
       System.out.println ("Matching pairs of numbers:"); 
     for (int row=0; row < table.length; row++) {
         for (int col=0; col < table[row].length; col++)
            if (table[row][col] == true && table[col][row] == true) {
                System.out.print ("(" + col + "," + row + ")"); 
               }
       }
     }
   }
   
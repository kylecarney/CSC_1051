//********************************************************************
//  FileInput.java       Author: MAP
//
//  Demonstrates the use of Scanner to read text file input.
//********************************************************************

import java.util.Scanner;
import java.io.*;

public class FileInput
{
   //-----------------------------------------------------------------
   //  Reads text from a file and prints it in uppercase.
   //-----------------------------------------------------------------
   public static void main (String[] args) throws IOException
   {
      String line;
      Scanner fileScan;
      int lineNumber = 0;

      File myFile = new File(args[0]);
      fileScan = new Scanner (myFile);

      // Read and process each line of the file
      while (fileScan.hasNext())
      {+
         line = fileScan.nextLine();
         if (line.toUpperCase().contains("AIR"))
         {
            System.out.println(lineNumber + "\t" + line);}
         lineNumber++;
      }
     System.out.println("Total number of lines in file: " + lineNumber);
   }
}
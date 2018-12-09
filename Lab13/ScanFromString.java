//********************************************************************
//  ScanFromString.java        MA Papalaskari
//  Simple example: scanning from a String
//********************************************************************

import java.util.Scanner;

public class ScanFromString
{
   public static void main(String[] args)
   {
      Scanner scan = new Scanner(System.in);
      
      System.out.print("Please type 3 words:  ");
      String line = scan.nextLine();
           
      Scanner scanLine = new Scanner(line);
      
      String word1 = scanLine.next();
      String word2 = scanLine.next();
      String word3 = scanLine.next();
      
      System.out.println("Word 1: " + word1);
      System.out.println("Word 2: " + word2);
      System.out.println("Word 3: " + word3);

   }
}
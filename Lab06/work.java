//*************************************************************
//  work.java       Author: Kyle Carney
//  Lab 6
//*************************************************************
import java.util.Scanner;
import java.util.Random;

public class work
{
   public static void main(String[] args)
   {
   //initialize scanner
   Scanner scan = new Scanner(System.in);
   
   //initialize string
   String word = "";
  

   //print mac os version number
   System.out.print("Please enter a Mac OS version number 1-10: ");
   //input mac os version number
   int n = scan.nextInt();
      
   //switch statement to print version number
   switch (n)
   {
      case 1: 
         word = "Puma";
         break;
      case 2:
         word = "Jaguar";
         break;
      case 3:
         word = "Panther";
         break;
      case 4:
         word = "Tiger";
         break;
      case 5:
         word = "Leopard";
         break;
      case 6:
         word = "Snow Leopard";
         break;
      case 7:
         word = "Lion";
         break;
      case 8: 
         word = "Mountain Lion";
         break;
      case 9:
         word = "Mavericks";
         break;
      case 10:
         word = "Yosemite";
         break;
      
      
   }
   System.out.println("Mac OS Version " + n + ": " + word);
     
   }
}
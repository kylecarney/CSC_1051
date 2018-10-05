//*************************************************************
//  AllCaps.java       Author: Kyle Carney
//  Project 3
//*************************************************************
import java.util.Scanner;
public class AllCaps
{
   
   public static void main (String[] args){
   String name;
   int i = 0;
   Scanner scan = new Scanner(System.in); 
      
     
      System.out.print ("Please enter your first name: ");
      name = scan.next();
      
      System.out.print ("Hello...");
      
      
      while (i < name.length())
      {
       name = name.toUpperCase();
         System.out.print("\n$ " + name.charAt(i) + " ***");
         i++;
      
      }
       
   }
  	
}
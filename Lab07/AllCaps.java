//*************************************************************
//  AllCaps.java       Author: Kyle Carney
//  Lab 7
//*************************************************************
import java.util.Scanner;
public class AllCaps
{
   
   public static void main (String[] args){
   String name;

   Scanner scan = new Scanner(System.in); 
      
   int vowelCounter = 0; 
     
   System.out.print ("Please enter your first name: ");
   name = scan.next();
      
   System.out.print ("Hello...");
   
      int n = name.length();
      name = name.toUpperCase();
      for (int i = (n-1); i >= 0; i--){
         System.out.print("\n$" + name.charAt(i) + " ***");
    

      if (name.charAt(i) == 'A' || name.charAt(i) == 'E' || name.charAt(i) == 'I' || name.charAt(i) == 'O' || name.charAt(i) == 'U'){ 
         vowelCounter++;
         }
         
}   
      System.out.print("\nYour name contains " + vowelCounter); 
      if (vowelCounter == 1)
          System.out.print(" vowel.");
      else 
         System.out.print(" vowels.");  
         
 }   
}
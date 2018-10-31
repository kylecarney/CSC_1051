//*************************************************************
//  partA.java       Author: Kyle Carney
//  Lab 7
//*************************************************************
import java.util.Scanner;
public class partA
{
   
   public static void main (String[] args){
   String name;

   Scanner scan = new Scanner(System.in); 
      
   int vowels = 0;
   int count = 0;
     
   System.out.print ("Please enter your first name: ");
   name = scan.next();
      
   System.out.print ("Hello...");
   
      int n = name.length();
      name = name.toUpperCase();
      for (int i = (n-1); i >= 0; i--){
         System.out.print("\n$" + name.charAt(i) + " ***");
    

      if (name.charAt(i) == 'A' || name.charAt(i) == 'E' || name.charAt(i) == 'I' || name.charAt(i) == 'O' || name.charAt(i) == 'U'){ 
         vowels++;
         }
         
}    
      String vowels1 = " ";
      switch (vowels)
      {
         case 1: 
            vowels1 = "one";
            break;
         case 2:
            vowels1 = "two";
            break;
         case 3: 
            vowels1 = "three";
            break;
         case 4: 
            vowels1 = "four";
            break;
         case 5:
            vowels1 = "five";
            break;
         case 6: 
            vowels1 = "six"; 
            break;
         case 7: 
            vowels1 = "seven";
            break;
         case 8:
            vowels1 = "eight";
            break;
         case 9: 
            vowels1 = "nine";
            break;
         case 10:
            vowels1 = "ten";
            
      }
      System.out.print("\nYour name contains " + vowels1); 
      if (vowels == 1)
          System.out.print(" vowel.");
      else 
         System.out.print(" vowels.");  
 }   
}
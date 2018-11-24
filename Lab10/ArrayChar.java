//********************************************************************
//  ArrayChar.java       Author: Kyle Carney
//
//  Lab 10
//********************************************************************
public class ArrayChar {
   public static void main(String args[]) {
   
      char [] anArray;
      anArray = new char [26];
      
      for (int i = 0; i < 26; i++)
         anArray[i] = (char)(i+'a'); 
      
      for (int i = 0; i < 26; i++) 
         System.out.println("Character at index " + i + " is: " + anArray[i]);
   }
}

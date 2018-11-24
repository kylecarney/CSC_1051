//********************************************************************
//  ArrayChar1.java       Author: Kyle Carney
//
//  Lab 10
//********************************************************************

public class ArrayChar1 {
    public static void main(String args[]) {
        String letters = "abcdefghijklmnopqrstuvwxyz";
   char [] anArray;
    for (int i=0; i < 26; i++) {
	anArray[i] = letters.charAt(i);

   
   for (int x = 0; x < 1; x++) 
	System.out.println("Character at index " + i + " is: " + anArray[i]);
   
	}
    }
}
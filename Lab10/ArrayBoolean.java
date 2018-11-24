//********************************************************************
//  ArrayChar.java       Author: Kyle Carney
//
//  Lab 10
//********************************************************************
import java.util.Random;

public class ArrayBoolean
{
   public static void main (String[] args) {
      boolean [] anArray; // declares an array of booleans

      anArray = new boolean[100];
      for (int i=0; i < 100; i++){
         if (i%2 == 0)
            anArray[i] = true;
         else
            anArray[i] = false;
      }

   // for loop that prints out array values
      for (int i = 0; i < 100; i++)
         System.out.println("Element at index " + i + ": " +  anArray[i]);   
   }
}
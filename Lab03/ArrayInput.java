//********************************************************************
//  ArrayInput.java       Author: Kyle Carney
//
//  Lab 10
//********************************************************************
import java.util.Random;

public class ArrayInput
{
   public static void main (String[] args) {
   double [] anArray; // declares an array of doubles

   Random rand = new Random();
   
   anArray = new double [100]; // allocates memory for 100 doubles
   // for loop that creates random numbers between 0 and 1
   for (int x = 0; x < 100; x++)
   anArray[x] = rand.nextDouble();

   // for loop that prints out array values
   for (int i = 0; i < 100; i++)
   System.out.println("Element at index " + i + ": " +  anArray[i]);   
   }
}
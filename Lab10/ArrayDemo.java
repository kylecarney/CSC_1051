//********************************************************************
//  ArrayDemo.java       Author: Kyle Carney
//
//  Lab 10
//********************************************************************
import java.util.Random;

public class ArrayDemo
{
   public static void main (String[] args) {
   int [] anArray; // declares an array of integers
   
   //constant final int size 10
   final int SIZE = 10;
   anArray = new int[SIZE]; // allocates memory for 10 integers
   // for loop that initializes array 0 = 100, 1 = 200, and so forth
   for (int x = 0; x < SIZE; x++)
   anArray[x] = (x + 1) * 100;
  
   
   // for loop that prints out array values
   for (int i = 0; i < SIZE; i++)
   System.out.println("Element at index " + i + ": " +  anArray[i]);   
   }
}
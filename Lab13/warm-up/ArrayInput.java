//********************************************************************
//  ArrayInputFromFile.java       Author: Kyle Carney
//
//  Lab 10
//********************************************************************
import java.util.Random;
import java.util.Scanner;

public class ArrayInput
{
public static void main (String[] args)
{
    int[] anArray = new int[100];
    Scanner scan = new Scanner(new File("oneHundredInts.txt"));
    

    for (int i = 0; i < anArray.length; i++)
    {
        System.out.println("Please enter number");
        anArray[i] = input.nextInt();
    }
    for (int i=0; i<5; i++)
    System.out.println("Value at index " + i+ " is: " + anArray[i]);
}
}
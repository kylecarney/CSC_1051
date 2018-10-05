//*************************************************************
//  Excercises.java       Author: Kyle Carney
//  Project 3
//*************************************************************
import java.util.Scanner;
public class Excercises
   {
   public static void main (String[] args){
   
      String word = "evolve";
      String upperCaseWord = word.toUpperCase();
      int n = 0;
      while (n < word.length())
      { 
         System.out.print("\n$ " + upperCaseWord.charAt(n) + " ***");
         n++;
      }
  }
 } 	

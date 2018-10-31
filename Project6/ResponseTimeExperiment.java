// ResponseTimeExperiment.java 
// Measure response time for addition problems.
// M A Papalaskari

import java.util.Scanner;
import java.util.Random;

public class ResponseTimeExperiment
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      Random rand = new Random();
   
      System.out.print("Please enter your name: ");
      String name = in.nextLine();
   
      System.out.println("Hello " + name 
         + ". Please answer as fast as you can.");
         
      System.out.println("\n\nHit <ENTER> when ready.");
      
      in.nextLine();  // wait for user to hit <ENTER>
   
      int a = rand.nextInt(100);
      int b = rand.nextInt(100);
   
      long startTime = System.currentTimeMillis();
   
      System.out.print(a + " + " + b + " = ");
      String response = in.nextLine();
      int number = Integer.parseInt(response);
   
      long endTime = System.currentTimeMillis();
   
      int outcome;
      if  (number == a + b)
         outcome = 1;
      else
         outcome = 0;
         
      long reactionTime = endTime - startTime;
   
      if (outcome == 1)
         System.out.println("Correct!");
      else
         System.out.println("Incorrect.");
         
      System.out.println("That took " + reactionTime + " milliseconds");
      System.out.println("Thank you "  + name + ", goodbye.");
   }
}
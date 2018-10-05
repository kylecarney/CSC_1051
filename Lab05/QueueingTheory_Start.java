//********************************************************************
//  QueueingTheory_Start.java       Author: M A Papalaskari
//
//  CSC 1051 Lab 5: Starter code for Lab 5 and Project 5 ***
//********************************************************************
import java.util.*;

public class QueueingTheory_Start {

   public static void main(String[] args)  {
   //-----------------------------------------------------------------
   // Simulates a customer service queue using a Java String.
   //-----------------------------------------------------------------
      Random rand = new Random();   // randomized arrivals (and more?)
      String queue = "";            // queue starts out empty
      int minute = 1;               // unit of time is minutes

      double arrivalProbability = .25;   // prob of customer arrival
                        // on any given minute (try different values!)
      int processingTime = 4;     // each customer takes 4 minutes

      char personLetter = 'C';    // symbolizes each customer

      System.out.println("\n\n***************************************");
      System.out.println("Call center simulation.");
      System.out.println("Calls placed with probability per minute: "
                          + arrivalProbability);
      System.out.println("Call duration:  " + processingTime);

      // main loop of simulation - lasts 60 minutes
      while (minute <= 30)  {

         // randomly decide if a customer has arrived and add to queue
         if (rand.nextFloat() < arrivalProbability) {

            // add as many symbols as processingTime (minutes) required
            int n = 0;
            while  (n < processingTime){
               queue += personLetter;
               n++;
            }

            personLetter++; // change symbol for next customer
         }

         // display the current state of the queue
         System.out.println("minute " + minute + "  queue length " + queue.length() +  
         "  queue contents: " + "<<<" + queue + ">>>");

         // serve customer at front of queue (if any) for 1 minute
         if (queue.length() > 0)
            queue = queue.substring(1);

         minute++; // tick tock... as time goes by
      }
   }
}
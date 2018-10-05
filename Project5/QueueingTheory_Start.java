//********************************************************************
//  QueueingTheory_Start.java       Author: Kyle Carney
//
//  CSC 1051 Project 5: Customer Service Simulation
//********************************************************************
import java.util.*;
import java.util.Scanner;

public class QueueingTheory_Start {

   public static void main(String[] args)  {
   //-----------------------------------------------------------------
   // Simulates a customer service queue using a Java String.
   //-----------------------------------------------------------------
      Scanner scan = new Scanner(System.in);
      Random rand = new Random();   // randomized arrivals (and more?)
      String queue = "";            // queue starts out empty
      int minute = 1;               // unit of time is minutes
      //declare int variables
      int minutesInput, minimumMinutes, maximumMinutes, idleTime, maxQueue; 
      int totalCustomers;
      double avgQueue, totalQueue; //declare double variables
      double customersInput; // input customers per minute
      char lastLetter; //declare lastLetter
      minutesInput = 0; // initalize minutesInput
      customersInput = 0; //initialize customerInput
      minimumMinutes = 0; //initialize minimumMinutes
      maximumMinutes = 0; //initialize maximumMinutes
      maxQueue = 0; //initialize maxQueue
      idleTime = 0; //initialize idleTime
      totalQueue = 0; //initialize totalQueue
      avgQueue = 0; //initialize avgQueue
      totalCustomers = 0; //initialize totalCustomers
      double arrivalProbability = .25;   // prob of customer arrival
                        // on any given minute (try different values!)
      char personLetter = (char) (rand.nextInt(26) + 'A');  // symbolizes each customer
      // print call center simulation title
      System.out.println("Call center simulation.");
      // print enter number of minutes for simulation
      System.out.print("\nPlease enter the number of minutes for the simulation: ");
      // input number of min for simulation
      minutesInput = scan.nextInt();
      // print enter number of customers per minute
      System.out.print("\nPlease enter the number of customers per minute: ");
      // input number of customers per minute
      arrivalProbability = scan.nextDouble();
      // print enter min number of min for customer service
      System.out.print("\nWhat is the minimum number of minutes " +
      " needed for customer service: ");
      // input min number of min for customer service
      minimumMinutes = scan.nextInt();
      // print enter max number of min needed for customer service
      System.out.print("\nWhat is the maximum number of minutes " +
      "needed for customer service: ");
      // input min number of minutes for customer service
      maximumMinutes = scan.nextInt();
      System.out.print("\n");
      //generate random processing time
      int processingTime = rand.nextInt(maximumMinutes) + minimumMinutes;     
      // main loop of simulation - minutes input
      while (minute <= minutesInput)  {

         // randomly decide if a customer has arrived and add to queue
         if (rand.nextFloat() < arrivalProbability) {

            // add as many symbols as processingTime (minutes) required
            int n = 0;
            while  (n < processingTime){
               queue += personLetter;
               n++;
            }
            
            // keep track of total number of customers
            lastLetter = 0;
            if (personLetter != lastLetter)
            totalCustomers ++;
            
            // lastLetter = personLetter
            lastLetter = personLetter;
            // change symbol for next customer A=Z
            personLetter = (char) (rand.nextInt(26) + 'A'); 
            
            do { // generate new randomLetter when personLetter is same as last letter
              personLetter = (char) (rand.nextInt(26) + 'A');  
            } while (personLetter == lastLetter); 
         }
         // display the current state of the queue
         System.out.println(minute + " >>> \t" + queue);
         
         //if queue length > 0 totalQueue = totalqueue + queue length
         if (queue.length() > 0)
            totalQueue = totalQueue + queue.length();
            
         //average queue = total queue / total minutes
         avgQueue = totalQueue / minutesInput;
         
         // if queue length is > max queue increase maxqueue set maxQueue = queue.length
         if (queue.length() > maxQueue)
         maxQueue = queue.length();
         
         //  if queue is empty increase total minutes of idle time
         if (queue.length() < 1)
            idleTime ++;
         
         // serve customer at front of queue (if any) for 1 minute
         if (queue.length() > 0)
            queue = queue.substring(1);
            
         minute++; // tick tock... as time goes by
      }
      System.out.println("\n\n***************************************");
      //print call center simulation
      System.out.println("Call center simulation.");
      // print calls placed with probability per minute
      System.out.println("Calls placed with probability per minute: "
                          + arrivalProbability);
      //print call duration minimum to maximum
      System.out.println("Call duration:  " + minimumMinutes + " to " + maximumMinutes);
      //print idle time
      System.out.println("Idle time: " + idleTime );
      //print maximum queue length
      System.out.println("Max queue length: " + maxQueue);
      //print average queue length
      System.out.println("Avg queue length: " + avgQueue);
      //print total number of customers
      System.out.println("Total number of customers during session: " + totalCustomers);
 }
}
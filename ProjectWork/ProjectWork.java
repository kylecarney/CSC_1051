//*************************************************************
//  ChcekIn.java       Author: Kyle Carney
//  Project 3
//*************************************************************
import java.util.Scanner;
public class ProjectWork
{
   // variables:
   int id, id2;
   
   public static void main (String[] args){
   
   // algorithm:
      
   
      Scanner scan = new Scanner(System.in); 
      // print what is 4 digit id?
      System.out.print ("Enter your 4-digit ID: ");
      // input id number
      int id = scan.nextInt();
      
      // length = digits of id
      int length = String.valueOf(id).length();
      
      //if length is 4 digits
      if (length == 4) {
         //print 3 questions
         System.out.print("Welcome. \nPlease answer 3 questions right for the magic code!\n");
         System.out.print("How many mens bball championships does Nova have? ");
         int question1 = scan.nextInt();
         System.out.print("How many mens Super Bowls did Eagles win? ");
         int question2 = scan.nextInt();
         System.out.print("How many bytes in a kilobyte ");
         int question3 = scan.nextInt();
         if (question1 == 3 && question2 == 1 & question3 == 1024)
            System.out.println("You answered the questions correctly.\n" +
                             "Your magic number is 4902");
         else
            System.out.println("Sorry you answered one or more questions wrong.\n" +
                                  "You did not generate a magic code\n" +
                                  "Thank you. Goodbye!");
         }
      // if id != 4
      if (length != 4)
      // print what is 4 digit id?
      System.out.print ("Enter your 4-digit ID: ");
      //input 2nd attempt id
      int id2 = scan.nextInt();
      
      int length2 = String.valueOf(id2).length();
      
      
         if (length != 4 && length2 != 4)
            System.out.println("Sorry your input for ID is invalid. Goodbye!");
         else
            if (length2 == 4)
            System.out.print("Welcome.\nPlease answer 3 questions right for the magic code!\n" +
                              "How many mens bball championships does Nova have? ");
               int question4 = scan.nextInt();
            System.out.print("How many mens Super Bowls did Eagles win? ");
               int question5 = scan.nextInt();
            System.out.print("How many bytes in a kilobyte ");
               int question6 = scan.nextInt();
            if (question4 == 3 && question5 == 1 && question6 == 1024)
            System.out.println("You answered the questions correctly.\n" +
                              "Your magic number is 4902");
               else                
                  System.out.println("Sorry you answered one or more questions wrong.\n" +
                                  "You did not generate a magic code\n" +
                                  "Thank you. Goodbye!");
         }                     
       }
      
     

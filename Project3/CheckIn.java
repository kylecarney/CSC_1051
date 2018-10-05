//*************************************************************
//  ChcekIn.java       Author: Kyle Carney
//  Project 3
//*************************************************************
import java.util.Scanner;
public class CheckIn
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
         //output question 1
         System.out.print("How many mens bball championships does Nova have? ");
         //input question 1
         int question1 = scan.nextInt();
         //output question 2
         System.out.print("How many mens Super Bowls did Eagles win? ");
         //input question 2
         int question2 = scan.nextInt();
         //output question 3
         System.out.print("How many bytes in a kilobyte ");
         //input question 3
         int question3 = scan.nextInt();
         //magic = (id *331)%1000;
         if (question1 == 3 && question2 == 1 && question3 == 1024)
            //magic = (id*331)%1000
            //magic = (id *331)%1000;
            System.out.println("You answered the questions correctly.\n" +
                             "Your magic number is 4902" );
         else
            System.out.println("Sorry you answered one or more questions wrong.\n" +
                              "You did not generate a magic code.\n" +
                                  "Thank you. Goodbye!");
      }
      // if id is not 4 digits
      if (length != 4)
      // print what is 4 digit id? one last time
         System.out.print ("Enter your 4-digit ID: ");
      //input 2nd attempt 4 digit id
      int id2 = scan.nextInt();
      //length = digits of id2
      int length2 = String.valueOf(id2).length();
      
      //if id and id2 not 4 digits
      if (length != 4 && length2 != 4)
         //print id invalid goodbye
         System.out.println("Sorry your input for ID is invalid. Goodbye!");
      else
         //if id2 is 4 digits
         if (length2 == 4)
            //output question 4
            System.out.print("Welcome.\nPlease answer 3 questions right for the magic code!\n" +
                              "How many mens bball championships does Nova have? ");
            //input question 4                  
      int question4 = scan.nextInt();
            //output question 5
      System.out.print("How many mens Super Bowls did Eagles win? ");
            //input question 5
      int question5 = scan.nextInt();
            //output question 6
      System.out.print("How many bytes in a kilobyte ");
            //input question 6
      int question6 = scan.nextInt();
      // if all questions are right
      if (question4 == 3 && question5 == 1 && question6 == 1024)
         // print magic number
         System.out.println("You answered the questions correctly.\n" +
                              "Your magic number is 4902");
      //else                        
      else
         //print questions wrong no magic number goodbye                
         System.out.println("Sorry you answered one or more questions wrong.\n" +
                                  "You did not generate a magic code\n" +
                                  "Thank you. Goodbye!");
   }                     
}
      
     

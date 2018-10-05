//*************************************************************
//  GPA_Ask.java       Author: Kyle Carney
//  Program runs until answer no
//*************************************************************
import java.util.Scanner;
public class GPA_Ask
{
   public static void main (String[] args)
   //------------------------------------------------------------
   //  Inputs the quality points and credits and calculates GPA.
   //-----------------------------------------------------------
   {
      int credits, qp, gpa, answer;
      Scanner scan = new Scanner(System.in);
      answer= 1;
      
      while (answer == 1)
      {
         // print enter credits
         System.out.print ("Enter Credits > ");
            //input credits
            credits = scan.nextInt();
            // print enter quality points
            System.out.print ("Enter Quality Points > ");
            //input quality points
            qp = scan.nextInt();
            //gpa = qp / credits
            gpa = qp / credits;
            // print gpa
            System.out.println ("GPA:  " + gpa);
         //increment student by 1
         System.out.println("Keep going = 1 STOP = 0");
         answer = scan.nextInt();
      }
         //print goodbye
         System.out.println("Thank you for using my program. Goodbye!");
      
   }
}

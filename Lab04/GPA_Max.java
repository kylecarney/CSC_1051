//*************************************************************
//  GPA_Max.java       Author: Kyle Carney
//  Demonstrates the use of Scanner input and simple computation.
//*************************************************************
import java.util.Scanner;
public class GPA_Max
{
   public static void main (String[] args)
   //------------------------------------------------------------
   //  Inputs the quality points and credits and calculates GPA.
   //-----------------------------------------------------------
   {
      int credits, qp, gpa, student, max;
      Scanner scan = new Scanner(System.in);
     
      student = 1;
      max = 0;
      while (student <= 3)
      {
      // input credits
         System.out.print ("Enter Credits > ");
         credits = scan.nextInt();
      // input quality points
         System.out.print ("Enter Quality Points > ");
         qp = scan.nextInt();
      
      // calculate & output GPA
         gpa = qp / credits;
         System.out.println ("GPA:  " + gpa);
         //while gpa > max
         if (gpa > max)
         max = gpa;
         //print max GPA
         System.out.println("Max GPA is: " + max);
         
         
         
         
      //
         student = student + 1;
      
      // print goodbye message
         System.out.println ("Thanks for using my program.");
      }
   }
}

//*************************************************************
//  GPA_ExactCount.java       Author: Kyle Carney
//  Exactly 3 grade inputs
//*************************************************************
import java.util.Scanner;
public class GPA_ExactCount
{
   public static void main (String[] args)
   //------------------------------------------------------------
   //  Inputs the quality points and credits and calculates GPA.
   //-----------------------------------------------------------
   {
      double credits, qp, gpa, student;
      Scanner scan = new Scanner(System.in);
     
      student = 1;
      while (student <= 3)
      {
      // input credits
         System.out.print ("Enter Credits > ");
         credits = scan.nextInt();
      // input quality points
         System.out.print ("Enter Quality Points > ");
         qp = scan.nextInt();
      
      // output values entered
         System.out.println ("Credits:        " + credits);
         System.out.println ("\nQuality Points: " + qp);
      
      // calculate & output GPA
         gpa = qp / credits;
         System.out.println ("GPA:  " + gpa);
      //
         student = student + 1;
      
      // print goodbye message
         System.out.println ("Thanks for using my program.");
      }
   }
}

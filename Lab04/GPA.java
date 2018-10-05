//*************************************************************
//  GPA.java       Author: Kyle Carney
//  Demonstrates the use of Scanner input and simple computation.
//*************************************************************
import java.util.Scanner;
public class GPA
{
   public static void main (String[] args)
   //------------------------------------------------------------
   //  Inputs the quality points and credits and calculates GPA.
   //-----------------------------------------------------------
   {
      double credits, qp, gpa;
      Scanner scan = new Scanner(System.in);

      // get input
      System.out.print ("Enter Credits > ");
      credits = scan.nextInt();
      System.out.print ("Enter Quality Points > ");
      qp = scan.nextInt();


      // output values entered
      System.out.println ("Credits:        " + credits);
      System.out.println ("\nQuality Points: " + qp);

      // calculate & output GPA
      gpa = qp / credits;
      System.out.println ("GPA:  " + gpa);
      
      // print goodbye message
      System.out.println ("Thanks for using my program.");
   }
}

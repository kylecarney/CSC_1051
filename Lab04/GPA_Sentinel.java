//*************************************************************
//  GPA_Sentinel.java       Author: Kyle Carney
//  Program runs until credits input is -1
//*************************************************************
import java.util.Scanner;
public class GPA_Sentinel
{
   public static void main (String[] args)
   //------------------------------------------------------------
   //  Inputs the quality points and credits and calculates GPA.
   //-----------------------------------------------------------
   {
      double credits, qp, gpa;
      Scanner scan = new Scanner(System.in);
      //credits = 0
      credits = 0;
     //while credits are not -1
      while (credits != -1)
      {
         // print credits?
         System.out.print ("Enter Credits > ");
         //input credits
         credits = scan.nextInt();
         // print quality points?
         System.out.print ("Enter Quality Points > ");
         //input quality points
         qp = scan.nextInt();
         // gpa = qp / credits
         gpa = qp / credits;
         // print GPA
         System.out.println ("GPA:  " + gpa);
      }
      System.out.println("Thank you for using my program. Goodbye!");
   }
}

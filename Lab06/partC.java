//*************************************************************
//  partC.java       Author: Kyle Carney
//  Lab 6 part C
//*************************************************************
import java.util.Scanner;
public class partC
{
   public static void main (String[] args)
   //------------------------------------------------------------
   //  Inputs the quality points and credits and calculates GPA.
   //-----------------------------------------------------------
   {
      double credits, qp, gpa, student;
      Scanner scan = new Scanner(System.in);
    
   
      
      for (int increment = 0; increment < 3; increment ++)
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
        
      }
        
     
      // print goodbye message
         System.out.println ("Thanks for using my program.");
     
   }
}

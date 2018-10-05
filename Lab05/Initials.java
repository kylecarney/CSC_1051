//*************************************************************
//  Initials.java       Author: Kyle Carney
//  Project 3
//*************************************************************
import java.util.Scanner;
public class Initials
{
   
   public static void main (String[] args){
      Scanner scan = new Scanner(System.in); 
       // print first name?
      System.out.print ("Please enter your first name: ");
       // input first name
      String firstName = scan.next();
       //print last name?
      System.out.print ("Please enter your last name: ");
       //input last name
      String lastName = scan.next();
      System.out.print ("Great meeting you " + firstName.charAt(0) +
         "." +
         lastName.charAt(0) + "., have a nice day.");
   }
       
}
  	

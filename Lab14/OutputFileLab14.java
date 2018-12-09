//*************************************************************
//  OutputFileLab14.java       Author: Kyle Carney
//  Lab 14
//*************************************************************

//imports
import java.text.NumberFormat;
import java.util.Scanner;
import java.io.*;

public class OutputFileLab14
{
   
public static void main (String[] args) throws IOException {
//initialize scanner
Scanner scan = new Scanner(System.in);
 
//declare variables 
int doAgain;

//initialize variables doAgain & year
doAgain = 1;

// Scanner in
Scanner in = new Scanner(System.in);

//print do again?
while (doAgain == 1) {  
   //print enter initial investment
   System.out.print("Please enter file name to be created: ");
   //input initial investment
   String name = in.nextLine();

   // Creates new file with name
   PrintWriter outFile = new PrintWriter(name + ".txt"); 

//print do again?
System.out.println("\n\nWould you like to do another? (NO=0, YES=1)");
//input do again
doAgain = scan.nextInt();
}}}
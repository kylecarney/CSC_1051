//*************************************************************
//  partE3.java       Author: Kyle Carney
//  Lab 7 
//*************************************************************
import java.util.Scanner;
public class partE3
{
   
   public static void main (String[] args){
   String name;
   int dimension;
   Scanner scan = new Scanner(System.in); 
   
   //print input for grid dimension   
   System.out.print ("Input number for grid dimensions: ");
   //input grid dimension
   dimension = scan.nextInt();
   
   //set max rows to input for dimension
   final int MAX_ROWS = dimension;

   // for (row = max; row >= 1; row --)
   for (int row = MAX_ROWS; row >= 1; row--)
   {
      System.out.print(row + " "); //print row + space
         for (int star = 1; star <= row; star++) //for (star = 1; star <= row; star++) 
            System.out.print ("*");//print *
               //for (space = row; space <= max; space++)
               for (int space = row; space <= MAX_ROWS; space++) {
                  System.out.print(" ");// print out " " 
   }
   System.out.print(row);//print row
   System.out.println();//print next line
       
 
      }}}

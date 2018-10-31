//*************************************************************
//  partB.java       Author: Kyle Carney
//  Lab 7 
//*************************************************************
import java.util.Scanner;
public class partB
{
   
   public static void main (String[] args){
   String name;
   int dimension;
   Scanner scan = new Scanner(System.in); 
   
   //print input for grid dimension   
   System.out.print ("Input number for grid dimensions: ");
   //input grid dimension
   dimension = scan.nextInt();
   
final int MAX_ROWS = dimension;

 for (int row = 1; row <= MAX_ROWS; row++)
 {
 System.out.print(row + " ");
 for (int star = 1; star <= dimension; star++)
      System.out.print ("*");
      System.out.println();
 }
      }}

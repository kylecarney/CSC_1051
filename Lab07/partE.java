//*************************************************************
//  partE.java       Author: Kyle Carney
//  Lab 7 
//*************************************************************
import java.util.Scanner;
public class partE
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

 for (int row = MAX_ROWS; row >= 1; row--) {
System.out.print(row + "\t");
     for (int star = row; star >= 1; star --)
       System.out.print("*");
     
       System.out.println(" " + row);
   
 }
}


  
      }

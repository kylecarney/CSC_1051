import java.util.Scanner;

//public class
public class Vacation {
public static void main(String[]args){
   //variables
   int age;
   //initialize scanner
   Scanner scan = new Scanner(System.in);
      
   //algorithm
   //print welcome message
   System.out.print ("Welcome to the Vacation App!");
   //input age
   System.out.println("\nWhat is your age");
   age = scan.nextInt();
   //if age > 30
   if (age >30) {
   //print destination 1 suggestion
   System.out.print ("Since you are " + age + " year's old you should vacation at Bora Bora!");
   //else if not > 30
   } else  {
   //print destination 2 suggestion
   System.out.print ("Since you are " + age + " year's old you should vacation at Mexico!");
   //print goodbye message
    System.out.print ("\nThank you for using the Vacation App!");
  }
} 
     
  }
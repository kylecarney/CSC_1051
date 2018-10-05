import java.util.Scanner;

public class PetName{
   public static void main(String[]args){
      String name = "Kyle";
      String petName = "Jenny";
      int age = 30;
      
      //initialize scanner
      Scanner scan = new Scanner(System.in);

      System.out.println("What is your name");
       name = scan.nextLine();
      
      System.out.println("What is your pets name");
       petName = scan.nextLine();
      
      System.out.println("What is your age");
      age = scan.nextInt();
      
      System.out.println("Hello, my name is " + name + " and I am " + age + 
      " years old. I'm enjoying my time at Villanova, though I miss my pet "
      + petName + " very much!");
    
    
             }
      }
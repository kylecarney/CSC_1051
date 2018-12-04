import java.util.Scanner; // imports class so we can use Scanner object

public class Test
{
   public static void main( String[] args )
   {
      int counter10 = 0;
      int counter20 = 0;
      int counter30 = 0;
      int counter40 = 0;
      int counter50 = 0;
      int counter60 = 0;
      int counter70 = 0;
      int counter80 = 0;
      int counter90 = 0;
      int counter100 = 0;
      
      Scanner keyboard = new Scanner( System.in );
   
      System.out.println ("Welcome to the histogram maker!");
      System.out.println ("Please enter your numbers (in range 1... 100), terminated by -1\n");
   
        // This inputs the numbers and stores as one whole string value
        // (e.g. if user entered 1 2 3, input = "1 2 3").
      String input = keyboard.nextLine();
   
        // This splits up the string every at every space and stores these
        // values in an array called numbersStr. (e.g. if the input variable is 
        // "1 2 3", numbersStr would be {"1", "2", "3"} )
      String[] numbersStr = input.split(" ");
   
        // This makes an int[] array the same length as our string array
        // called numbers. This is how we will store each number as an integer 
        // instead of a string when we have the values.
      int[] numbers = new int[ numbersStr.length ];
   
        // Starts a for loop which iterates through the whole array of the
        // numbers as strings.
      for ( int i = 0; i < numbersStr.length; i++ )
      {
            // Turns every value in the numbersStr array into an integer 
            // and puts it into the numbers array.
         numbers[i] = Integer.parseInt( numbersStr[i] );
            // OPTIONAL: Prints out each value in the numbers array.
         //System.out.print( numbers[i] + ", " );
      }
      System.out.println("\n\nHistogram of values entered:");
      System.out.println("============================");
      
   
         // For loop to increment counters 
      for ( int x = 0; x < numbersStr.length; x++ )
      {
         if (numbers[x] >= 1 && numbers[x] <= 10)
         {
            counter10++;
         }
         else if (numbers[x] >= 11 && numbers[x] <= 20)
         {
            counter20++;
         }
         else if (numbers[x] >= 21 && numbers[x] <= 30)
         {
            counter30++;
         }           
         else if (numbers[x] >= 31 && numbers[x] <= 40)
         {
            counter40++;
         }  
         else if (numbers[x] >= 41 && numbers[x] <= 50)
         {
            counter50++;
         } 
         else if (numbers[x] >= 51 && numbers[x] <= 60)
         {
            counter60++;
         }   
         else if (numbers[x] >= 61 && numbers[x] <= 70)
         {
            counter70++;
         } 
         else if (numbers[x] >= 71 && numbers[x] <= 80)
         {
            counter80++;
         }     
         else if (numbers[x] >= 81 && numbers[x] <= 90)
         {
            counter90++;
         }   
         else if (numbers[x] >= 51 && numbers[x] <= 100)
         {
            counter100++;
         }                        
      }
         // Print values between 1-10
      int i = 0;
      System.out.print("\n\n |  " + i + "     - 10" + "      |  ");
      for (int x = 0; x < counter10; x++)
      {
         System.out.print("*");
      }
         // Print values between 11-20
      i = 11;
      System.out.print("\n\n |  " + i + "    - " + (i+9) + "      |  ");
      for (int x = 0; x < counter20; x++)
      {
         System.out.print("*");
      }  
          // Print values between 21-30
      i = 21;
      System.out.print("\n\n |  " + i + "    - " + (i+9) + "      |  ");
      for (int x = 0; x < counter30; x++)
      {
         System.out.print("*");
      }   
         // Print values between 31-40
      i = 31;
      System.out.print("\n\n |  " + i + "    - " + (i+9) + "      |  ");
      for (int x = 0; x < counter40; x++)
      {
         System.out.print("*");
      }    
         // Print values between 41-50
      i = 41;
      System.out.print("\n\n |  " + i + "    - " + (i+9) + "      |  ");
      for (int x = 0; x < counter50; x++)
      {
         System.out.print("*");
      }  
         // Print values between 51-60
      i = 51;
      System.out.print("\n\n |  " + i + "    - " + (i+9) + "      |  ");
      for (int x = 0; x < counter60; x++)
      {
         System.out.print("*");
      }  
         // Print values between 61-70
      i = 61;
      System.out.print("\n\n |  " + i + "    - " + (i+9) + "      |  ");
      for (int x = 0; x < counter70; x++)
      {
         System.out.print("*");
      }             
         // Print values between 61-70
      i = 61;
      System.out.print("\n\n |  " + i + "    - " + (i+9) + "      |  ");
      for (int x = 0; x < counter70; x++)
      {
         System.out.print("*");
      }  
         // Print values between 71-80
      i = 71;
      System.out.print("\n\n |  " + i + "    - " + (i+9) + "      |  ");
      for (int x = 0; x < counter80; x++)
      {
         System.out.print("*");
      }  
         // Print values between 81-90
      i = 81;
      System.out.print("\n\n |  " + i + "    - " + (i+9) + "      |  ");
      for (int x = 0; x < counter90; x++)
      {
         System.out.print("*");
      }    
         // Print values between 91-100
      i = 91;
      System.out.print("\n\n |  " + i + "    - " + (i+9) + "     |  ");
      for (int x = 0; x < counter100; x++)
      {
         System.out.print("*");
      }         
      
      System.out.print("\n\n\n============================");
      System.out.print("\nThank you for using my program.");
   }}
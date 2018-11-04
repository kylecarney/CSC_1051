//********************************************************************
//  YouVeGotShoes.java       Author: Kyle Carney
//                   
//
//  CSC-1051-1 Project 7: You've Got Shoes!
//********************************************************************
import java.util.Scanner;
import java.text.NumberFormat; 
import java.text.DecimalFormat;

public class YouVeGotShoes
{
   //-----------------------------------------------------------------
   //  Creates some new data for shoes
   //-----------------------------------------------------------------
   public static void main (String[] args)
   {
      //initialize scanner
      Scanner scan = new Scanner(System.in);
      //1. create new shoes 40 likes/each, and prices $50, $100, and $40
      Shoe shoe1 = new Shoe ("Nike", "Flywire", 50.00, 121045, 40);
      Shoe shoe2 = new Shoe ("Under Armour", "Heatseeker", 100.00, 406639, 40);
      Shoe shoe3 = new Shoe ("Adidas", "Cloudfoam", 40.00, 394055, 40);
      
      // print enter price for shoe 4
      System.out.print ("Please enter the price for the fourth shoe\n>> ");
     
      //input shoe 4 price
      double shoe4Price = scan.nextDouble();
      //2. Create a 4th shoe without providing number of likes
      Shoe shoe4 = new Shoe ("Reebok", "Crossfit", shoe4Price, 403994);
      
      //print Shoe info before changes
      System.out.println ("\n\nShoe info before changes" +
                          "\n------------------------");
      //3. print all info for 4 shoes in stock
      System.out.println (shoe1);
      System.out.println (shoe2);
      System.out.println (shoe3);
      System.out.println (shoe4);
      
      //4. (optional) use setPicture() to change 4th shoe image
      //5. Use like() with no paramaters to increase likes of 4th shoe
      shoe4.like();
      //6. Increase shoe3 likes by 5
      shoe3.like(5);
      //7. Decrease likes shoe2 by 1
      shoe2.like(-1);
      //8. Set price of shoe1 to 29.99
      shoe1.setPrice(29.99);
      //9. Use getPrice() and setPrice() to discount shoes
      shoe2.getPrice();
      shoe3.getPrice();
      shoe4.getPrice();
      //give other three shoes discount of 20%
      double discount2 = shoe2.price*.8;
      double discount3 = shoe3.price*.8;
      double discount4 = shoe4.price*.8;
      //set price to discounted price
      shoe2.setPrice(discount2);
      shoe3.setPrice(discount3);
      shoe4.setPrice(discount4);
      //print Shoe info after changes
      System.out.println ("\n\nShoe info after changes" +
                          "\n------------------------");
      //10. print all info for 4 shoes after changes
      System.out.println (shoe1);
      System.out.println (shoe2);
      System.out.println (shoe3);
      System.out.println (shoe4);
      //total price = shoe1 + shoe2 + shoe3 + shoe4
      double totalPrice = shoe1.getPrice() + shoe2.getPrice() + 
                          shoe3.getPrice() + shoe4.getPrice();
      //print summary
      System.out.println ("\nSummary\n-------\n");
      NumberFormat fmt = NumberFormat.getCurrencyInstance();
      //11. print total price of shoes
      System.out.println ("Total price of shoes\n" +
                          fmt.format(totalPrice));
   
      DecimalFormat df = new DecimalFormat("#.25");  
      //averageLikes = likes for shoe1 + shoe2 + shoe3 + shoe4 / 4
      double averageLikes = (shoe1.getLikes() + shoe2.getLikes() +
                         shoe3.getLikes() + shoe4.getLikes())/4;
      //12. print average number of likes
      System.out.println ("Average number of likes = " + df.format(averageLikes));
   }
   
}
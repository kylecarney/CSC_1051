//********************************************************************
//  Shoe.java       Author: Kyle Carney
//                      
//
//  CSC-1051-1 Project 7: You've Got Shoes
//********************************************************************
import java.text.NumberFormat; 

public class Shoe
{
 //-----------------------------------------------------------------
 // Data, AKA instance variables
 //-----------------------------------------------------------------
   String manufacturer;
   String name;
   double price;
   int SKU;
   int likes;
 //-----------------------------------------------------------------
 // Constructor: Shoe
 //-----------------------------------------------------------------
 public Shoe (String x, 
              String y, 
              double z, 
              int i, 
              int a)
 
 {
   manufacturer = x;
   name = y;
   price = z;
   SKU = i;
   likes = a;
 } 
  //-----------------------------------------------------------------
 // Constructor: Shoe (manufacturer, name, price, SKU)
 //-----------------------------------------------------------------
  public Shoe (String x, String y, double z, int i)
 
 {
   manufacturer = x;
   name = y;
   price = z;
   SKU = i;
   likes = 0;
 } 
  //-----------------------------------------------------------------
 //  Returns a one-line description of the shoe as a string.
//-----------------------------------------------------------------
   public String toString ()
   {
      NumberFormat fmt = NumberFormat.getCurrencyInstance();
      return (name + " by " + manufacturer + ", SKU: " +  SKU +
              " "  + fmt.format(price) + "... " + likes + " likes.");
   }
  //-----------------------------------------------------------------
 //  Price mutator setPrice() sets price
//-----------------------------------------------------------------
   public double setPrice (double x)
   {
      price = x;
      return price;
   }
  //-----------------------------------------------------------------
 //  Price accessor getPrice() returns price
//-----------------------------------------------------------------
   public double getPrice ()
   {
      return price;
   }
  //-----------------------------------------------------------------
 //  Likes accessor getLikes() returns likes
//-----------------------------------------------------------------
   public int getLikes ()
   {
      return likes;
   }
  //-----------------------------------------------------------------
 // like() method increments likes by 1
//-----------------------------------------------------------------
   public int like ()
   {
      likes++; 
      return likes;
   }
  //-----------------------------------------------------------------
 // like() method adjusts likes by x
//-----------------------------------------------------------------
   public int like (int x)
   {
      likes = likes + x; 
      return likes;
   }
}
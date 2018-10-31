//********************************************************************
//  YouVeGotShoes.java       Author: Kyle Carney
//							
//
//  CSC-1051-1 Project 7: You've Got Shoes!
//********************************************************************
public class YouVeGotShoes
{
   //-----------------------------------------------------------------
   //  Creates some new data for shoes
   //-----------------------------------------------------------------
   public static void main (String[] args)
   {
      Shoe shoe1 = new Shoe ("Nike", "Flywire", 50.00, 100101, 40);
      Shoe shoe2 = new Shoe ("Under Armour", "Heatseeker", 100.00, 100102, 40);
      Shoe shoe3 = new Shoe ("Adidas", "Cloudfoam", 40.00, 100103, 40);
      
      System.out.println (shoe1);
      System.out.println (shoe2);
      System.out.println (shoe3);
     
   }
   
}
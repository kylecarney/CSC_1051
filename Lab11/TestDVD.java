//********************************************************************
//  TestDVD.java       Author: M A Papalaskari
//
//  Test client for DVD.java
//********************************************************************

public class TestDVD
{
  //-----------------------------------------------------------------
  //  Creates some DVD objects.
  //-----------------------------------------------------------------   
   public static void main(String[] args)
   {
      DVD one = new DVD("Casablanca", "Michael Curtiz", 1942, 19.95, false);
      DVD two = new DVD("District 9", "Neill Blomkamp", 2009, 19.95, false);
      DVD three = new DVD("Iron Man", "Jon Favreau", 2008, 15.95, true);

      System.out.println (one);
      System.out.println (two);
      System.out.println (three);
   }
}
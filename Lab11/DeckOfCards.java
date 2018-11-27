//********************************************************************
//  DeckOfCards.java       Author: Kyle Carney
//
//  Lab 11
//********************************************************************
import java.util.Random;

public class DeckOfCards
{
   public static void main (String[] args) {
   
   //suits[] array
      //declare and instantiate string array suits
      //initialize hearts, spades, diamonds, clubs
      String[] suits= {"hearts", "spades", "diamonds", "clubs"};
      //for loop to print index and name of each suit array element
      for (int i = 0; i < suits.length; i++) {
         System.out.println("suit at index " + i + ": " + suits[i]);
      }
      //break
      System.out.println("\n**********************************\n");
   //ranks[] array
      //initialize ranks array
         String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "jack", "queen", "king", "ace"};
 
      
      //for loop to print index and name of each rank array element
      for (int i = 0; i < ranks.length; i++) {
         System.out.println("rank at index " + i + ": " + ranks[i]);    
      } 
         //break
      System.out.println("\n**********************************\n");
   //deck[] array
      //declare and instantiate string array ranks
      String[] deck = new String[52];
      //for loop to initialize all cards in deck array
      int counter = 0;
      for (int i = 0; i < 13; i++) {
        deck[i] = "" + ranks[i] + " of " + suits[1]; 
      }
      counter++;
      for (int i = 13; i < 26; i++) {
        deck[i] = "" + ranks[] + " of " + suits[1]; 
      }            
   
      for (int i = 0; i < deck.length; i++) {           
         System.out.println("rank at index " + i + ": " + deck[i]);       
      }
   } }

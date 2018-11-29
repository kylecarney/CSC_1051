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
      //declare, instantiate, and initialize suits array
        String[] suits= {"hearts", "spades", "diamonds", "clubs"};
      //for loop to print index and name of each suit array element
      for (int i = 0; i < suits.length; i++) {
         System.out.println("suit at index " + i + ": " + suits[i]);
      }
      //break
      System.out.println("\n**********************************\n");
   //ranks[] array
      //instantiate ranks array
      String[] ranks = new String[13];
      
      
      String [] rankNames = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "jack", "queen", "king", "ace"};
   
      for (int i = 0; i < ranks.length; i++) {
         ranks[i] = rankNames[i];
      }
         
      
      //for loop to print index and name of each rank array element
      for (int i = 0; i < ranks.length; i++) {
         System.out.println("rank at index " + i + ": " + ranks[i]);    
      } 
      //break
      System.out.println("\n**********************************\n");
      
   //deck[] array
      //declare and instantiate string array ranks
      String[] deck = new String[52];
 
      //counters to reset suits and ranks
      int ranksCounter = 0;
      int suitsCounter = 0;
      
      //for loop that goes through deck array
      for (int i = 0; i < deck.length; i++) {
         deck[i] = "" + ranks[ranksCounter] + " of " + suits[suitsCounter];
         ranksCounter++;
      //if (ranksCounter = 13)increment suitsCounter   
      if (ranksCounter == 13)
         suitsCounter = suitsCounter + 1;
      //if (ranksCounter = 13) ranksCounter = 0
      if (ranksCounter == 13)
         ranksCounter = 0;
      }
      //print entire deck array
      for (int i = 0; i < deck.length; i++) {           
         System.out.println("rank at index " + i + ": " + deck[i]);       
      }
      //random function
      Random rand = new Random(); 
      
      //break
      System.out.println("\n**********************************\n");
    
      //for loop to shuffle deck
      for (int i = 0; i < 100; i++) {
      int a = rand.nextInt(51);
      int b = rand.nextInt(51);
     
      deck[a] = deck[b];
      deck[b] = deck[a];
      }
   
    //  ranks[cardA] = ranks[cardC];
     for (int i = 0; i < deck.length; i++) {
      System.out.println("rank at index " + i + ": " + deck[i]); 
      }
      }}
     
   
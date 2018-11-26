//********************************************************************
//  DeckOfCards.java       Author: Kyle Carney
//
//  Lab 11
//********************************************************************
import java.util.Random;

public class DeckOfCards
{
   public static void main (String[] args) {
      //declare, instantiate, and initialize array suits
      String[] suits = {"hearts",	"spades", "diamonds", "clubs"};
      for (int i=0; i < suits.length; i++)
         //print suit at each index
         System.out.println ("suit at index " + i + ": " + suits[i]);
       //print ****** BREAK *******
       System.out.println ("********************************************"); 
       
      //declare, instantiate, and initialize array ranks
      String [] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
      for (int i=0; i < ranks.length; i++)
         //print rank at each index
         System.out.println ("rank at index " + i + ": " + ranks[i]);
         
      //declare and instantiate array of 52 items called deck
       String[] deck = new String[52];  
       
       //print ****** BREAK *******
       System.out.println ("********************************************"); 
       //for deck index 0-12 hearts
       for (int i = 0; i < 13; i++) {
         deck[i] = ranks[i] + " of " + suits[0];
         System.out.println ("deck index of " + i + ": " + deck[i]); 
       //for deck index 13-25 clubs
         for (i = 13; i < 25; i++) {
         deck[i] = ranks[i] + " of " + suits[1];
         System.out.println ("deck index of " + i + ": " + deck[i]); 
         } 
         } 
   }}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Khalil_Mouawad_Exercise1;

import java.util.Random;
import java.util.Scanner;


/**
 *
 * @author Khalil Mouawad
 * 2021-06-08
 */
public class CardTrick {
    public static void main(String[] args)
    {
      
      int value;
      String suit;
      
     
          
      Card[] magicHand = new Card[7];
    
     
      for (int i=0; i<magicHand.length; i++){
          Card card = new Card();
          Random random = new Random();
          
          card.setValue((int)(Math.random()*13)+1);
          
          magicHand[i] = card;
      }
      
      Scanner sc = new Scanner(System.in);
      Card user = new Card();

      
      System.out.println("Please pick any card value: ");
      value = sc.nextInt();
      System.out.println("Please pick a card suit: ");
      suit = sc.next();
      
      user.setValue(value);
      user.setSuit(suit);
      
            boolean match = false;
            for (int i=0; i<magicHand.length; i++) {
                if (user.getValue() == magicHand[i].getValue() &&
                        user.getSuit().equalsIgnoreCase(magicHand[i].getSuit()))
                {
                    match = true;
                    break;
                }
            }
                    if (match) {
                        System.out.println("Your card choice already exists! ");
                    }
            
                else
                        
          System.out.println("Your choice: "+value+" of "+suit);
      Card favoredCard = new Card();
      favoredCard.setValue(10);
      favoredCard.setSuit(Card.SUIT[0]);
      
      for (int i = 0; i<magicHand.length; i++){
          if (favoredCard.getValue() == magicHand[i].getValue() && 
                favoredCard.getSuit().equalsIgnoreCase(magicHand[i].getSuit()))
                                                 {
                                                       match = true;
                                                       break;
                                                }
                                          }
     
      if (match) {
          System.out.println("You found the card! ");
          
          
      } else
          System.out.println("The card was not found, please try again.");
      } 
     }
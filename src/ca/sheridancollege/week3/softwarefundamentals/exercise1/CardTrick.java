/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week3.softwarefundamentals.exercise1;

import java.util.Random;
import java.util.Scanner;
/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author Ruchita Soni
 * Student ID: 991620345
 */
public class CardTrick {
    
    /**
     *
     * @param args
     */
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        //Scanner sc=new Scanner(System.in);
       // Random r=new Random();
        for(int i=0; i<magicHand.length;i++) {   
            magicHand[i] = new Card();
            magicHand[i].setValue((int)(Math.random()*(13)+1));
            magicHand[i].setSuit(Card.SUITS[(int)(Math.random()*(4))]);
            
            
            //c.setValue(insert call to random number generator here)
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
        }
       // System.out.println("Enter value:");
        //int value=sc.nextInt();
        //System.out.println("Enter suit:");
        //String suit=sc.next();
        //Card k=new Card();
        //int value = 0;
        //k.setValue(value);
        //k.setSuit(suit);
        
        Card lucky_card = new Card();
        lucky_card.setValue(4);
        lucky_card.setSuit("Hearts");
        //insert code to ask the user for Card value and suit, create their card
        // and search magicHand here
        //Then report the result here
           
        
        for (int i = 0; i < magicHand.length; i++) {
            if(lucky_card.getValue() == magicHand[i].getValue()
                && lucky_card.getSuit().equals(magicHand[i].getSuit())) 
                {
                    System.out.println("Right card ");
            }else
             System.out.println("Wrong card. ");
                
        }
            }            } 
             
        
        
    
    


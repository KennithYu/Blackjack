/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackjack;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author theje
 */
public class GroupOfCards {
    
    private ArrayList<Card> cards = new ArrayList<Card>();
    
    public Card getTopCard() {
        return cards.get(0);
    }
    
    public Card getRandomCard() {
        Random rn = new Random();
        Card card = new Card();
        card = cards.get(rn.nextInt((cards.size() - 1) + 1));
                cards.remove(card);
        return card;
    }
   
    public int getIndexOf(Card card) {
        return cards.indexOf(card);
    }
    
    public Card getCard(int index) {
       return cards.get(index);
    }
    
    public void addCard(Card card){
    
    }
    
    public void removeCard(Card card) {
    
    }
        
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackjack;

import java.util.ArrayList;

/**
 *
 * @author theje
 */
public class Hand {
    
    private ArrayList cards = new ArrayList();
    private int totalValue;  
    
    public int getTotalValue(ArrayList cards) {
        
        Card tmp = new Card();
        for(int i = 0; i < cards.size() - 1; i++) {
            tmp = (Card)cards.get(i);
            totalValue += tmp.getNumericValue();
        }
        
        return totalValue;
    }

    public void printValues() {
        Card tmp = new Card();
        for(int i = 0; i < cards.size(); i++) {
            tmp = (Card)cards.get(i);
            System.out.println(tmp.getValueName() + " " + tmp.getSuitName());
        }
    }
    
    public void addCard(Card card) {
        cards.add(card);
    }

    public void removeCard(Card card) {
        cards.remove(card);
    }
    
}

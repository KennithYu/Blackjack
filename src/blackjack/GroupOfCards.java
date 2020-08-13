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
 * @author Shannon Han, Kennith King Hay Yu
 */
public class GroupOfCards {
    
    private ArrayList<Card> cards = new ArrayList();
    private int totalValue;
    
    public int countCards() {
        return cards.size();
    }
    
    public int getCardsTotalValue() {
        for(int i = 0; i < cards.size(); i++) {
            totalValue += cards.get(i).getNumericValue();
        }
        return totalValue;
    }
    
    public ArrayList getCards() {
        return cards;
    }

    public String toString() {
        return cards.toString();
    }
    
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
    
    public void addCard(Card card) {
        cards.add(card);
    }

    public void removeCard(int index) {
        cards.remove(index);
    }
    
    public void replaceCard(Card card, int index) {
        cards.set(index, card);
    }
    
    public String getSuitNameOf(int index) {
        return cards.get(index).getSuitName();
    }
    
    public String getValueNameOf(int index) {
        return cards.get(index).getValueName();
    }
    
    public int getNumericValueOf(int index) {
        return cards.get(index).getNumericValue();
    }
    
    public void discardAll() {
        cards.clear();
    }
    
    public void shuffleCards() {
        Random rn = new Random();

        for (int i = 0; i < cards.size(); i++) {

            int j = rn.nextInt(i + 1);
            Card tmp = cards.get(j);
            cards.set(j, cards.get(i));
            cards.set(i, tmp);
        }
    }
    
    public Card dealCard() {
        Card card = new Card();
        card = cards.get(0);
        cards.remove(0);
        return card;
    }
    
    public String peek(int numberOfCards) {
        
        String suitAndValues = "";
        for(int i = 0; i < numberOfCards; i++) {
            suitAndValues += cards.get(i).getSuitName() + " " + cards.get(i).getValueName();
        }
        
        return suitAndValues;
    }
}

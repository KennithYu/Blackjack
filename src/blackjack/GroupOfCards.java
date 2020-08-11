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
    
    private ArrayList<Card> cards = new ArrayList<Card>();
    private int totalValue;
    private Card tempCard = new Card();
    
    public void createFullDeck() {

        for(Suit suit : Suit.values())
            for(Value value : Value.values()) {
                tempCard = new Card(suit, value);
                cards.add(tempCard);
            }
    }
    
    public int countCards() {
        return cards.size();
    }
    
    public void getCardsTotalValue() {
        for(int i = 0; i < cards.size(); i++) {
            tempCard = (Card)cards.get(i);
            totalValue += tempCard.getNumericValue();
            
            //if()
        }
        System.out.println(totalValue);
    }
    
   /* public int getInitialHandValue() {
        int bothAces = 0;
        for(int i = 0; i < cards.size(); i++) {
            
            tempCard = (Card)cards.get(i);
            bothAces = (cards.get(i).getNumericValue() + cards.get(i+1).getNumericValue());
            if (bothAces == 22) {
                totalValue -= 10;
                return totalValue;
             }
             if (tempCard.getValueName() == "Ace") {
                 totalValue += 11;
                
                 if (totalValue > 21)
                    totalValue -= 10;
             }
             else {
                    totalValue += tempCard.getNumericValue();
             }
        }
        
        
        return totalValue;
    }*/

    public void printSuitAndValue() {

        for(int i = 0; i < cards.size(); i++) {
            tempCard = (Card)cards.get(i);
            System.out.println(tempCard.getValueName() + " " + tempCard.getSuitName());
        }
     
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
        tempCard = cards.get(index);
        return tempCard.getSuitName();
    }
    
    public String getValueNameOf(int index) {
        tempCard = cards.get(index);
        return tempCard.getValueName();
    }
    
    public int getNumericValueOf(int index) {
        tempCard = cards.get(index);
        return tempCard.getNumericValue();
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
        tempCard = cards.get(0);
        cards.remove(0);
        return tempCard;
    }
    
    public String peek(int numberOfCards) {
        
        String suitAndValues = "";
        for(int i = 0; i < numberOfCards; i++) {
            tempCard = cards.get(i);
            suitAndValues += tempCard.getSuitName() + " " + tempCard.getValueName();
        }
        
        return suitAndValues;
    }
}

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
public class Deck {
    
    private ArrayList<Card> cards = new ArrayList<Card>();
    private static int order = 0;
    
    public Deck(){
        cards = new Card[Suit.values().length * Value.values().length];
        createDeck();
    }
    
    public void createDeck() {
        
        int i = 0;
        for(Suit suit : Suit.values())
            for(Value value : Value.values())
                cards.add(Card(card);
    }
    
    public void refresh() {
        order = 0;
    }
    
    public void shuffleDeck() {
        Random rn = new Random();

        for (int i = cards.length - 1; i > 0; i--) {

            int j = rn.nextInt(i + 1);
            Card tmp = cards[j];
            cards[j] = cards[i];
            cards[i] = tmp;
        }
    }

    public Card dealCard() {
        return cards[order++];
    }
    
    @Override
    public void addCard(Card card) {
       
    }

    @Override
    public void removeCard(Card card) {
       
    }
}

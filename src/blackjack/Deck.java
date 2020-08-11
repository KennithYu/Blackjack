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
public class Deck extends GroupOfCards {
    
    
    
    public void createFullDeck() {

        for(Suit suit : Suit.values())
            for(Value value : Value.values()) {
                getCards().add(new Card(suit, value));
            }
    }
    
}

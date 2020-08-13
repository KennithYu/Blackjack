/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackjack;

/**
 *
 * @author
 */
public enum Suit {
    HEARTS ("Hearts"),
    DIAMONDS ("Diamonds"),
    CLUBS ("Clubs"),
    SPADES ("Spades");
    
    private String name;

    private Suit(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    
}

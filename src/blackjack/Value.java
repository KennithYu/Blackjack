/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackjack;

/**
 *
 * @author theje
 */
public enum Value {
    
    ACE ("Ace", 1, true),
    TWO ("Two", 2, false),
    THREE ("Three", 3, false),
    FOUR ("Four", 4, false),
    FIVE ("Five", 5, false),
    SIX ("Six", 6, false),
    SEVEN ("Seven", 7, false),
    EIGHT ("Eight", 8, false),
    NINE ("Nine", 9, false),
    TEN ("Ten", 10, false),
    JACK ("Jack", 10, true),
    QUEEN ("Queen", 10, true),
    KING ("King", 10, true);
    
    private String name;
    private int value;
    private boolean isFaceCard;
    
    private Value(String name, int value, boolean isFaceCard) {
    
        this.name = name;
        this.value = value;
        this.isFaceCard = isFaceCard;
        
    }

    public boolean isFaceCard() {
        return isFaceCard;
    }

    public String getName() {
        return name;
    }

    public int getValue() {
        return value;
    }
    
    
}

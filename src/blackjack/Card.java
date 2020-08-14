package blackjack;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @authors Shannon Han, Kennith King Hay Yu
 */
//this is a test
public class Card {

    private Suit suit;
    private Value value;

    /**
     * @param value
     * @param suit
     */
    public Card(Suit suit, Value value) {
        this.value = value;
        this.suit = suit;
    }
    
    public Card() {}

    public int getNumericValue() {
        return value.getValue();
    }

    public String getValueName() {
        return value.getName();
    }

    public String getSuitName() {
        return suit.getName();
    }

    public Suit getSuit() {
        return suit;
    }

    public Value getValue() {
        return value;
    }

    @Override
    public String toString() {
        
        String output = "";
        
        if(value.isFaceCard()) {
            output += getValueName();
        } else {
            output += getNumericValue();
        }
        
        output += " of " + getSuitName();
        
        return output;
    }
       
    
}

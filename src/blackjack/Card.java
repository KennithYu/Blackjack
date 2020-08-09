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

    public Card() {}
    /**
     * 
     * @param value
     * @param suit
     */
    public Card(Suit suit, Value value) {
        this.value = value;
        this.suit = suit;
    }

    public int getNumericValue() {
        return value.getValue();
    }

    public String getValueName() {
        return value.getName();
    }

    public void setValue(Value value) {
        this.value = value;
    }

    public String getSuitName() {
        return suit.getName();
    }

    public void setSuit(Suit suit) {
        this.suit = suit;
    }
}

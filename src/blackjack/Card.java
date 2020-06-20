package blackjack;

/**
 *
 * @authors Shannon Han, Kennith King Hay Yu
 */
//this is a test
public class Card {
   public enum Suit {
            HEARTS, DIAMONDS, CLUBS, SPADES
        }
        
        public enum Value {
            ACE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, 
            EIGHT, NINE, TEN, JACK, QUEEN, KING
        }
        
	private Suit suit;
	private Value value;
       
        /**
	 * 
	 * @param value
	 * @param suit
	 */
        public Card(Suit suit, Value value) {
		this.value = value;
                this.suit = suit;
	}
        
	public Value getValue() {
		return this.value;
	}

	public void setValue(Value value) {
		this.value = value;
	}

	public Suit getSuit() {
		return this.suit;
	}

	public void setSuit(Suit suit) {
		this.suit = suit;
	}
}

package blackjack;

/**
 *
 * @author Kennith King Hay Yu
 */
public class Deck extends GroupOfCards {  
    
    @Override
    public void createGroup() {
        for(Suit suit : Suit.values())
            for(Value value : Value.values()) {
                cards.add(new Card(suit, value));
            }
    }
    
    @Override
    public String toString() {
        return super.toString();
    }
    
}

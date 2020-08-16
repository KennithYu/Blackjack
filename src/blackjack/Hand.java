/**
 *
 * @author Kennith King Hay Yu
 */
package blackjack;

public class Hand extends GroupOfCards {
    
    /**
     * Overridden method getValues()
     * Checks hand for unique ace properties based on Blackjack rules
     * Aces can be 1 or 11
     * Method checks for aces and logically returns best possible value
     */
    @Override
    public int getValues() {
        int lowValue = 0;
        int highValue = 0;
        boolean hasAce = false;
        
        for (int i = 0; i < cards.size(); i++) {
            if (cards.get(i).getValue() == Value.ACE) {
                hasAce = true;
            }
            lowValue += cards.get(i).getNumericValue();
        }
        
        highValue = lowValue + 10;
        
        if(hasAce && highValue <= 21) {
            return highValue;
        } else {
            return lowValue;
        }
    }
    
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

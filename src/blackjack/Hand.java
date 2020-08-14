/**
 *
 * @authors Shannon Han and Kennith King Hay Yu
 */
package blackjack;

import java.util.ArrayList;

public class Hand extends GroupOfCards {

    public int getHandValue() {
        
        int value = 0;
        for (int i = 0; i < cards.size(); i++) {
            value += cards.get(i).getNumericValue();
        }
        
        return value;
    }
    
    @Override
    public String toString() {
        return super.toString();
    }
}

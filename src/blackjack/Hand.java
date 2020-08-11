/**
 *
 * @authors Shannon Han and Kennith King Hay Yu
 */
package blackjack;

import java.util.ArrayList;

public class Hand extends GroupOfCards {

    public int getHandValue() {
        return getCardsTotalValue();
    }
}

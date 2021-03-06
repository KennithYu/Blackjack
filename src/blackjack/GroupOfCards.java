package blackjack;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Kennith King Hay Yu
 */
public abstract class GroupOfCards {
    
    protected ArrayList<Card> cards = new ArrayList();
    
    public abstract void createGroup();
    
    public int getValues() {
        
        int value = 0;
        for (int i = 0; i < cards.size(); i++) {
            value += cards.get(i).getNumericValue();
        }
        
        return value;
    }
    
    public int countCards() {
        return cards.size();
    }
    
    public Card getTopCard() {
        return cards.get(0);
    }
    
    public Card getRandomCard() {
        Random rn = new Random();
        Card card = new Card();
        card = cards.get(rn.nextInt((cards.size() - 1) + 1));
                cards.remove(card);
        return card;
    }
    
    public void shuffleCards() {
        Random rn = new Random();

        for (int i = 0; i < cards.size(); i++) {

            int j = rn.nextInt(i + 1);
            Card tmp = cards.get(j);
            cards.set(j, cards.get(i));
            cards.set(i, tmp);
        }
    }
    
    public Card dealCard() {
        Card card = getTopCard();
        cards.remove(0);
        return card;
    }
    
    @Override
    public String toString() {
        return cards.toString();
    }
    
}

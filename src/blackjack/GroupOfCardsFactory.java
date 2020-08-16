package blackjack;

/**
 *
 * @author Kennith Yu
 */
public class GroupOfCardsFactory {
    
    public GroupOfCards getGroupOfCards (GroupOfCardsType type) {
        switch (type) {
            case HAND: return new Hand();
            case DECK: return new Deck();
        }
        return null;
    }
    
}

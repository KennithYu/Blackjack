package blackjack;
import java.util.Stack;

/**
 *
 * @authors Shannon Han. Kennith King Hay Yu
 */
public class Player {
    
    private String name;
    private Hand hand;
    private static int bank = 1000;
    private int currentMoney;
    
    public void hit(GroupOfCards deck) {
        Card card = new Card();
        card = deck.dealCard();
        hand.addCard(card);
    }
    
    public void showHand() {
        hand.printValues();
    }
    
    public void stay() {
        // TODO - implement Player.stay
        throw new UnsupportedOperationException();
    }

    /**
     * 
     * @param bet
     */
    public void betAmount(int bet) {
        // TODO - implement Player.betAmount
        throw new UnsupportedOperationException();
    }

    public void stopGame() {
        System.exit(0);
    }

    public Player(String name) {
      hand = new Hand();
      this.name = name;
    }

    public String getName() {
        return this.name;
    }
    
    public void allIn() {
        // TODO - implement Player.allIn
        throw new UnsupportedOperationException();
    }

    public void clearBet() {
        // TODO - implement Player.clearBet
        throw new UnsupportedOperationException();
    }
    

        
    /*public int determineHandValue(Card[] cards) {
        //store cards total value
        int cardsValue = 0;
        //check cards
        //if both are aces, value is 2 or 12
        int aceCount = 0;
        for(Card card : cards)
            if (card.getValue() == Card.Value.ACE) {
                aceCount++;
                if (aceCount == 2)
                    System.out.println();
            } else {
               // cardsValue += Card.Value.;
            }
        //for a card that is an ace, show prompt for whether the value is 1 or 11
        return 0;
    }*/
    
}
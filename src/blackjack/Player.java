package blackjack;
import java.io.Serializable;

/**
 * Player class holds information and functions related to a user playing Blackjack
 * Player class implements the class Serializable in order to save Player objects to a file
 * @author Kennith King Hay Yu
 */
public class Player implements Serializable {
    
    private String name;
    private int winRecord = 0;
    private static final long serialVersionUID = 1L;
    protected transient GroupOfCards hand;
    private transient PlayerStatus status;
      
    public Player(String name) {
      this.name = name;
      status = PlayerStatus.PLAYING;
      initialize();
    }
    
    public Player() {}
    
    /**
     * initialize method was created to inject a GroupOfCards object of type Hand
     * the method redundantly sets the status to PLAYING in the case of players being loaded from a file
     */
    public void initialize() {
        GroupOfCardsFactory factory = new GroupOfCardsFactory();
        hand = factory.getGroupOfCards(GroupOfCardsType.HAND);
        
        status = PlayerStatus.PLAYING;
    }
    
    public void hit(GroupOfCards deck) {
        Card card = deck.dealCard();
        hand.cards.add(card);
    }
       
    public String getHand() {
        return hand.toString();
    }
    
    public int getHandValue() {
       return hand.getValues();
    }  

    public void setName(String name) {
        this.name = name;
    }
    
    public String getName() {
        return this.name;
    }

    public int getWinRecord() {
        return winRecord;
    }

    public void setWinRecord(int winRecord) {
        this.winRecord = winRecord;
    }

    public void setStatus(PlayerStatus status) {
        this.status = status;
    }

    public PlayerStatus getStatus() {
        return status;
    } 
}

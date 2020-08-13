package blackjack;
import java.util.Stack;
import java.io.Serializable;

/**
 *
 * @authors Shannon Han. Kennith King Hay Yu
 */
public class Player implements Serializable {
    
    private String name;
    private int winRecord = 0;
    private int wallet = 1000;
    private static final long serialVersionUID = 1L;
    private transient Hand hand;
    private transient boolean stay = false;
    private transient boolean bust = false;
      
    public Player(String name) {
      hand = new Hand();
      this.name = name;
    }
    
    public Player() {
        
    }
    
    public void initializeHand() {
        hand = new Hand();
    }
    
    public void hit(GroupOfCards deck) {
        Card card = deck.dealCard();
        hand.cards.add(card);
    }
       
    public String getHand() {
        return hand.toString();
    }
    
    public int getHandValue() {
       return hand.getHandValue();
    }  

    public String getName() {
        return this.name;
    }

    public void setStay(boolean stay) {
        this.stay = stay;
    }

    public void setBust(boolean bust) {
        this.bust = bust;
    }
    
    public boolean isOut() {
        if (stay || bust) {
            return true;
        } else {
            return false;
        }
    }   

    public void setWallet(int wallet) {
        this.wallet = wallet;
    }

    public int getWallet() {
        return wallet;
    }
    
    

    @Override
    public String toString() {
        return "Player{" + "name=" + name + ", winRecord=" + winRecord + ", wallet=" + wallet + '}';
    }
    
    
    
}

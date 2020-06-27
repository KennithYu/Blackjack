package blackjack;
import java.util.Stack;

public class GameParticipant {

    private String name;
    private Stack<Card> hand = new Stack<Card>();
    
    public GameParticipant(){}
    
    public GameParticipant(String name){
        this.name = name;
    }
    
    public void handCount() {
        // TODO - implement Player.handCount
        throw new UnsupportedOperationException();
    }

}
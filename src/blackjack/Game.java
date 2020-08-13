package blackjack;

import java.util.Scanner;

/**
 *
 * @author Shannon Han
 */
public class Game {

    public String Start(String game) {
        return "***Welcome to " + game + "!***";
        
    }
    
    public void End(Player player) {
        System.exit(0);
    }
    
    public String SignalTurn(Player player) {
        return "***" + player.getName() + "'s turn:***";
    }
    
    public int evaluateScores(int score) {
        if (score > 21)
            return 0;
        else
            return 1;
    }
    
    //TODO return type
    public void promptHitOrStay() {

    }
    
}

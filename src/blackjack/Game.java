package blackjack;

import java.util.Scanner;

/**
 *
 * @author Shannon Han
 */
public abstract class Game {
    
    public abstract void displayGameRules();

    public abstract void startGame();
    
    public void exitGame() {
        System.exit(0);
    }
    
}

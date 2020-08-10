package blackjack;

import java.util.Scanner;

/**
 *
 * @author Shannon Han
 */
public class Game {
    
    public static void Start(String game) {
        System.out.println("***Welcome to " + game + "!***");
        Scanner input = new Scanner(System.in);
        input.nextLine();
    }
    
    public static void End() {
        System.exit(0);
    }
    
    public static void SignalTurn(Player player) {
        System.out.println("***" + player.getName() + "'s turn:***");
    }
    
    public void evaluateScores() {
        
    }
    
}

package blackjack;

import java.util.Scanner;

/**
 *
 * @author Shannon Han
 */
public class Game {
    
    private static Scanner input = new Scanner(System.in);
    
    public static void Start(String game) {
        System.out.println("***Welcome to " + game + "!***");
        input.nextLine();
    }
    
    public static void End(Player player) {
        System.out.println("***Over 21!***");
        input.nextLine();
        System.exit(0);
    }
    
    public static void SignalTurn(Player player) {
        System.out.println("***" + player.getName() + "'s turn:***");
    }
    
    public static int evaluateScores(int score) {
        if (score > 21)
            return 0;
        else
            return 1;
    }
    
    public static int promptHitOrStay() {
        System.out.println("Hit or Stand? \n1:hit\n2:stand");
        int choice = input.nextInt();
        return choice;

    }
    
}

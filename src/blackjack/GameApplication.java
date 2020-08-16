package blackjack;
import java.util.Scanner;
import java.util.InputMismatchException;

/**
 *
 * @author Kennith King Hay Yu
 */
public class GameApplication {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Player player1 = new Player();
        Player player2 = new Player();
        
        BlackJackGame blackJackGame = BlackJackGame.getInstance();

        int choice = 0;
        
        do {
            System.out.println("Welcome to Blackjack!");
            System.out.println("Please Select an Option: ");
            System.out.println("\t1. New Game");
            System.out.println("\t2. Load and Continue Game");
            System.out.println("\t3. View Current Player Statistics");
            System.out.println("\t4. Read Game Rules");
            System.out.println("\t5. Exit Game");

            try {
                choice = input.nextInt();
            } catch (InputMismatchException ex) {
                input.reset();
                input.nextLine();
            }

            switch (choice) {
                case 1: System.out.println("Player 1, please enter your name: ");
                        String p1Name = input.next();
                        System.out.println("Player 2, please enter your name: ");
                        String p2Name = input.next();
                        player1.setName(p1Name);
                        player2.setName(p2Name);
                        player1.initialize();
                        player2.initialize();
                        System.out.println("Welcome " + player1.getName() + " and " + player2.getName() + "!\n");
                        blackJackGame.initializeBlackJackGame(player1, player2);
                        blackJackGame.startGame();
                        break;
                        
                case 2: Player[] players = SaveAndLoadSystem.loadPlayers();
                        player1 = players[0];
                        player2 = players[1];
                        player1.initialize();
                        player2.initialize();
                        System.out.println("Welcome back " + player1.getName() + " and " + player2.getName() + "!\n");
                        blackJackGame.initializeBlackJackGame(player1, player2);
                        blackJackGame.startGame();
                        break;
                        
                case 3: if (player1.getName() == null || player2.getName() == null) {
                            System.out.println("Please start a new game or load a previously saved game to see statistics.\n");
                        } else {
                            System.out.println(player1.getName() + "'s Statistics:");
                            System.out.println("Win Record: " + player1.getWinRecord() + "\n");
                            System.out.println(player2.getName() + "'s Statistics:");
                            System.out.println("Win Record: " + player2.getWinRecord() + "\n");
                        }
                        break;
                        
                case 4: blackJackGame.displayGameRules();
                        break;
                        
                case 5: System.exit(0);
                        break;
                        
                default: System.out.println("Please select an option.\n");
                         break;
            }
        } while (choice != 5);
    }
    
}

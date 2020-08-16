package blackjack;
import java.util.Scanner;
import java.util.InputMismatchException;

/**
 * Singleton class BlackJackGame
 * Controls logic and flow of a Blackjack round
 * @author Kennith Yu
 */
public class BlackJackGame extends Game{
    
    public static BlackJackGame instance;
    private Player player1;
    private Player player2;
    private Player currentPlayer;
    private Player waitingPlayer;
    private GroupOfCards deck;
    
    private BlackJackGame() {
    }
    
    /**
     * BlackJackGame is singleton and thus needs a way to initialize its private members
     * initializeBlackJackGame assigns members from the passed parameters
     * Then injects a GroupOfCards object of type Deck
     */
    public void initializeBlackJackGame(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
        currentPlayer = player1;
        waitingPlayer = player2;
        
        GroupOfCardsFactory factory = new GroupOfCardsFactory();
        deck = factory.getGroupOfCards(GroupOfCardsType.DECK);
        deck.createGroup();
        deck.shuffleCards();
    }
    
    public static BlackJackGame getInstance() {
        if (instance == null) {
            instance = new BlackJackGame();
        }
        return instance;
    }
    
    @Override
    public void startGame() {

        System.out.println("Welcome to Blackjack\n");
        dealAndDisplayOpeningHand();
        
        do {
            if (currentPlayer.getStatus() == PlayerStatus.STAY || currentPlayer.getStatus() == PlayerStatus.BUST) {
                swapTurn();
            } else {
                actTurn(currentPlayer);
                
                if (currentPlayer.getStatus() == PlayerStatus.WINNER) {
                    break;
                }
                
                swapTurn();
            }
        } while (player1.getStatus() == PlayerStatus.PLAYING || player2.getStatus() == PlayerStatus.PLAYING);
        
        System.out.println("\nGame Over!");
        checkWinner();
        endGame();
    }
    
    public void actTurn(Player currentPlayer) {
        Scanner input = new Scanner(System.in);
        int choice = 0;
        
        do {
        System.out.println("\n" + currentPlayer.getName() + ", your turn!");
        System.out.println("\t1. Hit");
        System.out.println("\t2. Stay");
        
       
        try {
            choice = input.nextInt();
        } catch (InputMismatchException ex) {
            input.reset();
            input.nextLine();
        }
        
        switch(choice) {
            case 1: currentPlayer.hit(deck);
                    System.out.println(currentPlayer.getHand() + "\nHand Value: " + currentPlayer.getHandValue());
                    checkHand(currentPlayer);
                    break;
            case 2: currentPlayer.setStatus(PlayerStatus.STAY);
                    System.out.println(currentPlayer.getName() + " has stayed.");
                    break;
            default: System.out.println("Please select an option.");
                    break;
        }
        } while (choice == 0);
    }
    
    public void swapTurn() {
        Player hold = currentPlayer;
        currentPlayer = waitingPlayer;
        waitingPlayer = hold;
    }
    
    public void checkHand(Player player) {
        if (player.getHandValue() > 21) {
            player.setStatus(PlayerStatus.BUST);
            System.out.println(player.getName() + " has bust!");
        } else if (player.getHandValue() == 21) {
            player.setStatus(PlayerStatus.WINNER);
        }
    }
    
    public void dealAndDisplayOpeningHand() {
        player1.hit(deck);
        player1.hit(deck);
        player2.hit(deck);
        player2.hit(deck);
        
        System.out.println(displayHands());
    }
    
    public String displayHands() {
        return player1.getName() + ", your hand: \n" + player1.getHand()
            + "\n Hand Value: " + player1.getHandValue() +"\n\n"
            + player2.getName() + ", your hand: \n" + player2.getHand()
            + "\n Hand Value: " + player2.getHandValue();
    }
    
    @Override
    public void displayGameRules() {
        System.out.println("Rules of Blackjack");
        System.out.println("The objective of Blackjack is to reach a total value of 21 with the cards in your hand.");
        System.out.println("Cards are worth their numerical value. Face cards are worth ten. Aces are worth 1 or 11.");
        System.out.println("The game will automatically assign any Aces to best suit your hand.");
        System.out.println("At the beginning of the game both players are dealt a hand of two cards.");
        System.out.println("Player 1 will be prompted to hit or stay.");
        System.out.println("Hit means a card will be dealt to your hand.");
        System.out.println("Stay means you will hold your current hand and cannot be dealt anymore cards until the game is over.");
        System.out.println("Turns will swap until a player wins, both stay, or both bust.");
        System.out.println("Should a player go over 21 they become Bust and will lose the game.");
        System.out.println("A winner is declared when they are at 21, or if both players Stayed under 21 the player closest to 21 wins.");
        System.out.println("If both players bust no one wins.\n");
    }
    
    public void checkWinner() {
        if (currentPlayer.getStatus() == PlayerStatus.WINNER) {
            System.out.println("\nEnding Hands:\n" + displayHands() + "\n");
            System.out.println(currentPlayer.getName() + " has 21 and is the winner!\n");
        } else if (player1.getStatus() == PlayerStatus.BUST && player2.getStatus() == PlayerStatus.BUST) {
            System.out.println("\nEnding Hands:\n" + displayHands() + "\n");
            System.out.println("Both players have bust! No one wins!\n");
        } else {
            System.out.println("\nEnding Hands:\n" + displayHands() + "\n");
            if (player1.getHandValue() > player2.getHandValue()) {
                player1.setStatus(PlayerStatus.WINNER);
                System.out.println(player1.getName() + " is closer to 21 and is the winner!\n");
            } else if (player2.getHandValue() > player1.getHandValue()) {
                player2.setStatus(PlayerStatus.WINNER);
                System.out.println(player2.getName() + " is closer to 21 and is the winner!\n");
            } else {
                System.out.println("It's a tie! No one wins!\n");
            }
        }
    }
    
    public void endGame() {
        Scanner input = new Scanner(System.in);
        int choice = 0;
        
        if (player1.getStatus() == PlayerStatus.WINNER) {
            player1.setWinRecord((player1.getWinRecord() + 1));
        } else if (player2.getStatus() == PlayerStatus.WINNER) {
            player2.setWinRecord((player2.getWinRecord() + 1));
        }
         
        player1.setStatus(PlayerStatus.PLAYING);
        player2.setStatus(PlayerStatus.PLAYING);
        
        do {
            System.out.println("Save your game and statistics?");
            System.out.println("\t1. Yes");
            System.out.println("\t2. No");
            
            try {
                choice = input.nextInt();
            } catch (InputMismatchException ex) {
                input.reset();
                input.nextLine();
            }
            
            switch(choice) {
            case 1: SaveAndLoadSystem.savePlayers(player1, player2);
                    break;
            case 2: break;
            default: System.out.println("Please select an option.");
                    break;
            }
        } while (choice == 0);
    }
    
}

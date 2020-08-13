/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackjack;
import java.util.Scanner;
import java.util.InputMismatchException;

/**
 *
 * @author Kennith Yu
 */
public class BlackJackGame extends Game{
    
    private Player player1;
    private Player player2;
    private Player currentPlayer;
    private Player waitingPlayer;
    private Deck deck;
    
    public BlackJackGame(Player player1, Player player2, Deck deck) {
        this.player1 = player1;
        this.player2 = player2;
        currentPlayer = player1;
        waitingPlayer = player2;
        this.deck = deck;
    }
    
    @Override
    public void startGame() {

        System.out.println("Welcome to Blackjack\n");
        
        //Make bet
        
        //beginning, deal 2 cards
        dealAndDisplayOpeningHand();
        
        do {
            actTurn(currentPlayer);
            swapTurn();
        } while (!player1.isOut() && !player2.isOut());
        
        System.out.println("Game Over");
    }
    
    public void actTurn(Player currentPlayer) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("\n" + currentPlayer.getName() + ", your turn!");
        
        int choice = 0;
        try {
            choice = input.nextInt();
        } catch (InputMismatchException ex) {
            input.reset();
        }
        
        switch(choice) {
            case 1: currentPlayer.hit(deck);
                    System.out.println(currentPlayer.getHand() + "\n" + currentPlayer.getHandValue());
                    break;
            case 2: currentPlayer.setStay(true);
                    break;
            default: System.out.println("Please select an option.");
                    break;
        }
    }
    
    public void swapTurn() {
        Player hold = currentPlayer;
        currentPlayer = waitingPlayer;
        waitingPlayer = hold;
    }
    
    public void checkBust() {
        
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
        
    }
    
}

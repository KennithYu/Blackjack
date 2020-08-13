package blackjack;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @authors Shannon Han, Kennith King Hay Yu
 */
public class GameApplication {
    
    public static void main(String[] args) {
          

        SaveAndLoadSystem sl = new SaveAndLoadSystem();
        //Saving structure
//        Player player1 = new Player("Kennith");
//        Player player2 = new Player("Shannon");  
//        sl.savePlayers(player1, player2);

        // Loading structure
        Player[] players = sl.loadPlayers();
        Player player1 = players[0];
        Player player2 = players[1];
        player1.initializeHand();
        player2.initializeHand();
        System.out.println(player1.toString() + "\n" + player2.toString());
        
       
        Deck deck = new Deck();
        BlackJackGame newGame = new BlackJackGame(player1, player2, deck);
        deck.createDeck();
        deck.shuffleCards();
        
        newGame.startGame();
       
       }
    
}

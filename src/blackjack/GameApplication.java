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
        
        Game.Start("Blackjack");

        Player player1 = new Player("player1");
        Player player2 = new Player("player2");
        GroupOfCards deck = new Deck();
        
        //testing purposes only
        /*System.out.println("Before shuffle");
       
        for (int i = 0; i < deck.cards.length; i++)
            System.out.println(deck.cards[i].getSuitName() + " " + deck.cards[i].getValueName());*/
        
        deck.createFullDeck();
        deck.shuffleCards();
        
        //testing purposes only
        /*System.out.println("After shuffle");
        Card tmp = new Card();
        for (int i = 0; i < deck.countCards(); i++) {
            tmp = (Card)deck.getCard(i);
            System.out.println(tmp.getSuitName() + " " + tmp.getValueName());
        }*/
        
       //deal both players cards for their initial hand
       player1.hit(deck);
       player2.hit(deck);
       player1.hit(deck);
       player2.hit(deck);
       
       
       //Scanner input = new Scanner(System.in);
       //String i = input.nextLine();
       //System.out.flush();
       Game.SignalTurn(player1);
       System.out.println("Player1's cards:");
       player1.showHand();
       
       //show the value player1's hand
       //
            
        
        
        
    }
    
}

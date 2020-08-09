package blackjack;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @authors Shannon Han. Kennith King Hay Yu
 */
public class GameApplication {
    
    public static void main(String[] args) {
        
        Deck deck = new Deck();
        Player player1 = new Player();
        Player player2 = new Player();
        /*System.out.println("Before shuffle");
       
        for (int i = 0; i < deck.cards.length; i++)
            System.out.println(deck.cards[i].getSuitName() + " " + deck.cards[i].getValueName());*/
        
        deck.shuffleDeck();
        
        System.out.println("After shuffle");
        Card tmp = new Card();
        for (int i = 0; i < deck.cards.size(); i++) {
            tmp = (Card)deck.cards.get(i);
            System.out.println(tmp.getSuitName() + " " + deck.cards[i].getValueName());
        }
        
       //deal both players cards for their initial hand
       player1.hit(deck);
       player2.hit(deck);
       player1.hit(deck);
       player2.hit(deck);
       
       
       //Scanner input = new Scanner(System.in);
       //String i = input.nextLine();
       //System.out.flush();
       System.out.println("Player1's cards:");
       player1.showHand();
       
            
        
        
        
    }
    
}

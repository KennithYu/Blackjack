package blackjack;

import org.junit.*;
import static org.junit.Assert.*;

/**
 *
 * @author Kennith Yu
 */
public class BlackJackTest {
    private BlackJackGame instance;
    private Player player1;
    private Player player2;
    
    public BlackJackTest() {
    }
    
    @Before
    public void setUp() {
        instance = BlackJackGame.getInstance();
        player1 = new Player("Test1");
        player2 = new Player("Test2");
        instance.initializeBlackJackGame(player1, player2);
    }
    
    /**
     * Test to check hand value
     * Expected Result is that the user is still playing
     */
    @Test
    public void testCheckHand() {
        System.out.println("CheckHand");
        player1.hand.cards.add(new Card(Suit.CLUBS, Value.EIGHT));
        instance.checkHand(player1);
        PlayerStatus expResult = PlayerStatus.PLAYING;
        assertEquals(expResult, player1.getStatus());
    }
    
    /**
     * Test to check hand value
     * Expected Result is that the user has bust
     */
    @Test
    public void testCheckHandBust() {
        System.out.println("CheckHandBust");
        player1.hand.cards.add(new Card(Suit.CLUBS, Value.EIGHT));
        player1.hand.cards.add(new Card(Suit.DIAMONDS, Value.EIGHT));
        player1.hand.cards.add(new Card(Suit.CLUBS, Value.JACK));
        instance.checkHand(player1);
        PlayerStatus expResult = PlayerStatus.BUST;
        assertEquals(expResult, player1.getStatus());
    }
    
    
    /**
     * Test to check hand value
     * Expected Result is that the user won
     */
    @Test
    public void testCheckHandWin() {
        System.out.println("CheckHandWin");
        player1.hand.cards.add(new Card(Suit.CLUBS, Value.EIGHT));
        player1.hand.cards.add(new Card(Suit.DIAMONDS, Value.EIGHT));
        player1.hand.cards.add(new Card(Suit.CLUBS, Value.FIVE));
        instance.checkHand(player1);
        PlayerStatus expResult = PlayerStatus.WINNER;
        assertEquals(expResult, player1.getStatus());
    }
}

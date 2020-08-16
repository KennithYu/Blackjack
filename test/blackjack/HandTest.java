package blackjack;

import org.junit.*;
import static org.junit.Assert.*;

/**
 *
 * @author Kennith Yu
 */
public class HandTest {
    
    public HandTest() {
    }
    
    @Before
    public void setUp() {
    }

    /**
     * Test to check a hand's value
     */
    @Test
    public void testGetValues() {
        System.out.println("getValues");
        Hand instance = new Hand();
        instance.cards.add(new Card(Suit.CLUBS, Value.EIGHT));
        instance.cards.add(new Card(Suit.CLUBS, Value.FIVE));
        int expResult = 13;
        int result = instance.getValues();
        assertEquals(expResult, result);
    }
    
    /**
     * Test to check a hand's value
     * Expected result is 21 with an ace
     */
    @Test
    public void testGetValuesWithAceWin() {
        System.out.println("getValuesWithAceWin");
        Hand instance = new Hand();
        instance.cards.add(new Card(Suit.CLUBS, Value.ACE));
        instance.cards.add(new Card(Suit.CLUBS, Value.TEN));
        int expResult = 21;
        int result = instance.getValues();
        assertEquals(expResult, result);
    }
    
    /**
     * Test to check a hand's value
     * Expected result is 14 with four aces
     */
    @Test
    public void testGetValuesWithFourAces() {
        System.out.println("getValuesWithFourAces");
        Hand instance = new Hand();
        instance.cards.add(new Card(Suit.CLUBS, Value.ACE));
        instance.cards.add(new Card(Suit.DIAMONDS, Value.ACE));
        instance.cards.add(new Card(Suit.HEARTS, Value.ACE));
        instance.cards.add(new Card(Suit.SPADES, Value.ACE));
        int expResult = 14;
        int result = instance.getValues();
        assertEquals(expResult, result);
    }
}

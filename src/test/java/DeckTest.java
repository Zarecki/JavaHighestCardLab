import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class DeckTest {

    Deck deck;
    Card card;

    @Before
    public void before(){
        deck = new Deck();
    }

    @Test
    public void hasEmptyDeck(){
        assertEquals(0, deck.countCards());
    }

    @Test
    public void hasFullDeck(){
        deck.populate();
        assertEquals(52, deck.countCards());
    }

    @Test
    public void hasShuffled(){
        deck.populate();
        assertEquals(false, deck.hasShuffleWorked());
    }

    @Test
    public void hasDealtCard(){
        deck.populate();
        deck.dealCard();
        assertEquals(51, deck.countCards());
    }
}

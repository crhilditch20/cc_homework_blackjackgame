import static org.junit.Assert.*;
import org.junit.*;

public class HandTest {

  Hand hand;

    @Before 
    public void before() {
      hand = new Hand();
    }

    @Test
    public void testHandEmpty(){
      assertEquals(0, hand.cardCount());
    }

    @Test
    public void testCanAddCards(){
      Card card1 = new Card(CardSuit.SPADES, CardValue.JACK);
      hand.addCard(card1);
      assertEquals(1, hand.cardCount());
    }

    @Test
    public void canShowHand(){
      Card card1 = new Card(CardSuit.SPADES, CardValue.JACK);
      Card card2 = new Card(CardSuit.SPADES, CardValue.ACE);
      hand.addCard(card1);
      hand.addCard(card2);
      assertEquals(card1, hand.showHand(0));
    }

  }
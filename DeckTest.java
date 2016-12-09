import static org.junit.Assert.*;
import org.junit.*;

public class DeckTest {

  Deck deck;
  Player player;

    @Before 
    public void before() {
      deck = new Deck();
      player = new Player("Kevin");
    }

    @Test
    public void testDeckEmpty(){
      assertEquals(0, deck.cardCount());
    }

    @Test
    public void testCanAddCards(){
      Card card1 = new Card(CardSuit.SPADES, CardValue.JACK);
      deck.addCard(card1);
      assertEquals(1, deck.cardCount());
    }

    @Test
    public void testCanBuildDeck(){
      deck.buildDeck();
      assertEquals(52, deck.cardCount());
    }


  }


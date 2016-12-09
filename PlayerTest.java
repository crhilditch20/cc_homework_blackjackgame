import static org.junit.Assert.*;
import org.junit.*;

public class PlayerTest {

  Player player;

  @Before 
  public void before() {
    player = new Player("Kevin");
  }

  @Test
  public void testHasName() {
    assertEquals("Kevin", player.getName());
  }

  @Test
  public void testHasEmptyHand() {
    Hand hand = player.getHand();
    assertEquals(0, hand.cardCount());
  }

  @Test
  public void testHas2CardsInHand() {
    Card card1 = new Card(CardSuit.SPADES, CardValue.JACK);
    Card card2 = new Card(CardSuit.CLUBS, CardValue.KING);
    Hand hand = player.getHand();
    hand.addCard(card1);
    hand.addCard(card2);
    assertEquals(2, hand.cardCount());
  }


}
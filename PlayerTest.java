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
  public void testReceiveCard(){
    Card card1 = new Card(CardSuit.SPADES, CardValue.JACK);
    Card card2 = new Card(CardSuit.CLUBS, CardValue.KING);
    player.receiveCard(card1);
    player.receiveCard(card2);
    Hand hand = player.getHand();
    assertEquals(2, hand.cardCount());
  }

  @Test
  public void testPlayerShowsHand(){
    Card card1 = new Card(CardSuit.SPADES, CardValue.JACK);
    Card card2 = new Card(CardSuit.CLUBS, CardValue.KING);
    player.receiveCard(card1);
    player.receiveCard(card2);
    assertEquals(24, player.showHand());
  }

  // @Test
  // public void testIsWinner(){
  //   Card card1 = new Card(CardSuit.SPADES, CardValue.JACK);
  //   Card card2 = new Card(CardSuit.CLUBS, CardValue.KING);
  //   player.receiveCard(card1);
  //   player.receiveCard(card2);
  //   assertEquals(false, player.canWin());
  // }


}
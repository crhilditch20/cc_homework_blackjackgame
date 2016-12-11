import static org.junit.Assert.*;
import org.junit.*;

public class DealerTest {

  Dealer dealer;

  @Before 
  public void before() {
    dealer = new Dealer("Alan");
  }

  @Test
  public void testHasName() {
    assertEquals("Alan", dealer.getName());
  }

  @Test
  public void testHasEmptyHand() {
    Hand hand = dealer.getHand();
    assertEquals(0, hand.cardCount());
  }

  @Test
  public void testReceiveCard(){
    Card card1 = new Card(CardSuit.SPADES, CardValue.JACK);
    Card card2 = new Card(CardSuit.CLUBS, CardValue.KING);
    dealer.receiveCard(card1);
    dealer.receiveCard(card2);
    Hand hand = dealer.getHand();
    assertEquals(2, hand.cardCount());
  }

  @Test
  public void testDealerShowsHand(){
    Card card1 = new Card(CardSuit.SPADES, CardValue.JACK);
    Card card2 = new Card(CardSuit.CLUBS, CardValue.KING);
    dealer.receiveCard(card1);
    dealer.receiveCard(card2);
    assertEquals(24, dealer.showHand());
  }

 
}
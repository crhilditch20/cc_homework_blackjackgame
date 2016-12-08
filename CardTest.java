import static org.junit.Assert.*;
import org.junit.*;

public class CardTest {

  Card card;

  @Before 
  public void before() {
    card = new Card(CardSuit.SPADES, CardValue.JACK);
  }

  @Test
  public void testHasSuit(){
    assertEquals(CardSuit.SPADES, card.getSuit());
  }

  @Test
  public void testHasValue(){
    assertEquals(CardValue.JACK, card.getValue());
  }

  // @Test
  // public void testValueToInteger(){
  //   assertEquals(10, card.valueToInteger());
  // }
}
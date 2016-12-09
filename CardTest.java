import static org.junit.Assert.*;
import org.junit.*;

public class CardTest {

  Card card;

  @Before 
  public void before() {
    card = new Card(CardSuit.SPADES, CardValue.KING);
  }

  @Test
  public void testHasSuit(){
    assertEquals(CardSuit.SPADES, card.getSuit());
  }

  @Test
  public void testHasValue(){
    assertEquals(CardValue.KING, card.getValue());
  }

  @Test
  public void testConvertValueToInteger(){
    assertEquals(13, card.valueToInteger());
  }
}
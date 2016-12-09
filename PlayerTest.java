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


}
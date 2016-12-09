import static org.junit.Assert.*;
import org.junit.*;

public class GameTest {

  Game game;

  @Before 
  public void before() {
    game = new Game();
  }

  @Test
  public void testCountPlayers(){
    assertEquals(0, game.countPlayers());
  }

  @Test
  public void testCanAddPlayers(){
    Player player = new Player("Kev");
    game.addPlayer(player);
    assertEquals(1, game.countPlayers());
  }
}
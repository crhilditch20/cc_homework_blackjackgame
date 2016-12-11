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
    Player player = new Player("Steph");
    game.addPlayer(player);
    assertEquals(1, game.countPlayers());
  }

  @Test
  public void testPlayerGetsTwoCards(){
    Player player1 = new Player("Steph");
    Player player2 = new Player("Jeff");
    game.startGame();
    game.addPlayer(player1);
    game.addPlayer(player2);
    game.playerGetsTwoCards();
    Hand hand = player1.getHand();
    int result = hand.cardCount();
    assertEquals(2, result);
  }
}
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
    Dealer dealer = new Dealer("Jeff");
    game.addPlayer(player);
    game.addDealer(dealer);
    assertEquals(2, game.countPlayers());
  }

  @Test
  public void testDealCardsToAll(){
    Player player = new Player("Steph");
    Dealer dealer = new Dealer("Jeff");
    game.startGame();
    game.addPlayer(player);
    game.addPlayer(dealer);
    game.dealCardsToAll();
    Hand hand = player.getHand();
    int result = hand.cardCount();
    assertEquals(2, result);
  }

  // @Test
  // public void testCanDeclareWinner(){
  //   Player player = new Player("Steph");
  //   Dealer dealer = new Dealer("Jeff");
  //   game.startGame();
  //   game.addPlayer(player);
  //   game.addPlayer(dealer);
  //   game.dealCardsToAll();
  //   assertEquals("Steph is the winner", game.declareWinner());
  // }

 
}
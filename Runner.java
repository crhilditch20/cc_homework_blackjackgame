import java.util.*;

class Runner{
  public static void main(String[] args) {
    Game game = new Game();
    Player player1 = new Player("Jo");
    Dealer dealer = new Dealer("Kev");

    game.startGame();
    game.addPlayer(player1);
    game.addDealer(dealer);

    game.dealCardsToAll();
    game.showAllHands();

    game.declareWinner();

   
   }
  
}
import java.util.*;

public class Game {

  private ArrayList<Player> players;
  private Deck deck;


  public Game(){
    this.players = new ArrayList<Player>();
    this.deck = new Deck();
  }

  public void startGame(){
    this.deck.buildDeck();    
  }

  public int countPlayers(){
    return players.size();
  }

  public void addPlayer(Player player){
    players.add(player);
  }

  public void playerGetsTwoCards(){
    int i = 0;
    for (i = 0; i < 2; i++){
      for (Player player:players){
        Card card = deck.dealCard();
        player.receiveCard(card);
      }
    }

  }

}



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

  }
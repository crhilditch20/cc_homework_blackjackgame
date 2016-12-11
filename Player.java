import java.util.*;

public class Player {

  private String name;
  private Hand hand;
  private boolean under21;
  

  public Player(String name){
    this.name = name;
    this.hand = new Hand();
    this.under21 = under21;
  }

  public String getName(){
    return this.name;
  }

  public Hand getHand(){
    return this.hand;
  }

  public void receiveCard(Card card){
    this.hand.addCard(card);
  }

  public int showHand(){
    return this.hand.calculateValue();
  }


}
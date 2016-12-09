import java.util.*;

public class Hand{

  private ArrayList<Card> hand;

  public Hand(){
    this.hand = new ArrayList<Card>();
  }

  public int cardCount(){
    return this.hand.size();
  }

  public void addCard(Card card){
    this.hand.add(card);
  }

  public Card showCard(int index){
    return this.hand.get(index);
  }


}
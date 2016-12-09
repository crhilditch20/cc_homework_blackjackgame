import java.util.*;

class Runner{
  public static void main(String[] args) {

    Deck deck = new Deck();
    Player player = new Player("Bob");
    deck.buildDeck();
    Hand hand = player.getHand();
   
    Card card1 = deck.dealCard();
    Card card2 = deck.dealCard();
    hand.addCard(card1);
    hand.addCard(card2);
    int handValue = hand.calculateValue();
    System.out.println(handValue);
      



   
  }

}
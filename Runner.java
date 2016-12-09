import java.util.*;

class Runner{
  public static void main(String[] args) {

    Deck deck = new Deck();
    deck.buildDeck();
    ArrayList<Card> cards = deck.getCards();

   for (Card card : cards){
    System.out.println(card.getValue() + " of " + card.getSuit());
   }
  }

}
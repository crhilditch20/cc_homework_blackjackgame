import java.util.*;

class Runner{
  public static void main(String[] args) {
    Deck deck = new Deck();
    Player player1 = new Player("Bob");
    Player player2 = new Player("Jen");
    deck.buildDeck();
    Hand hand = new Hand();
    Card card1 = deck.dealCard();
    Card card2 = deck.dealCard();
    Card card3 = deck.dealCard();
    Card card4 = deck.dealCard();
    player1.receiveCard(card1);
    player1.receiveCard(card2);
    player2.receiveCard(card3);
    player2.receiveCard(card4);
    

    
      
   // presume this will form the basis of the Game class....

   }
  
}
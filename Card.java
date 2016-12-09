public class Card {

    private CardSuit suit;
    private CardValue value;

    public Card(CardSuit suit, CardValue value) {
      this.suit = suit;
      this.value = value;
    }

    public CardSuit getSuit(){
      return this.suit;
    }

    public CardValue getValue(){
      return this.value;
    }

    public int valueToInteger(){
      return (this.value.ordinal()+2); 
    }

    //could use .ordinal() for this??
}
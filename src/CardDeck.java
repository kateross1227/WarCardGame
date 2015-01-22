// create class CardDeck that extends CardList
public class CardDeck extends CardList {
  private int suits = 4;
  private int ranks = 13;
  private int swaps = 10000;
  
  //Constructors
  public CardDeck() {
    super();
    Card c;
    for (int suit = 1; suit <= suits; suit++){
      for (int rank = 1; rank <= ranks; rank++) {
        this.addCardToBottom(new Card (suit, rank));
      }
    }
  }
  
  //Accessors
  public void Shuffle(){
    Card card;
    for (int count = 0; count < swaps; count++) {
      card = this.removeRandomCard();
      this.addCardToBottom(card);
    }
  }
}

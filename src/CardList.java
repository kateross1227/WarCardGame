// create class CardList
  import java.util.*;
  
public class CardList {
  private ArrayList<Card> cards;
  private Random random = new Random();
  
  //Constructors
  public CardList() {
    //TODO
    cards = new ArrayList<Card>();
  }
  
  //Accessors
  public int getSize(){
    return cards.size();
  }
  
  public Card getCard(int c) {
    return cards.get(c);
  }
  
  //Mutators
  public void addCardToBottom(Card c) {
    cards.add(c);
  }
  
  public void addCardToTop(Card c) {
    cards.add(0, c);
  }
  
  public Card takeCardFromTop() {
    return cards.remove(0);
  }
  
  public Card removeRandomCard() {
    int randCardNum = random.nextInt(cards.size());
    return cards.remove(randCardNum);
  }
}

public class War {
  
  public static void main(String[] args) {
    // create deck, hands and stacks
    CardDeck deck = new CardDeck();
    CardList handA = new CardList();
    CardList handB = new CardList();
    CardList stackA = new CardList();
    CardList stackB = new CardList();
    deck.Shuffle();
    
    // deal the cards
    for (int i = 22; i > 0; i--) {
      handA.addCardToBottom(deck.takeCardFromTop());
      handB.addCardToBottom(deck.takeCardFromTop());
    }
    
    // play
    System.out.println("A --- Player --- B");
    Card a = new Card(4, 13);
    Card b = new Card(4, 13);
    int round = 1;
    
    while (handA.getSize() > 0 && handB.getSize() > 0) {
      Card a1 = handA.takeCardFromTop();
      stackA.addCardToTop(a1);
      Card b2 = handB.takeCardFromTop();
      stackB.addCardToTop(b2);

      System.out.println(handA.getSize() + " ---Round" + round + "--- " + handB.getSize());

      while (a1.compareTo(b2) != 0) {
        //when someone wins normally
        if (a1.compareTo(b2) < 0) { //hand B wins!
          handB.addCardToBottom(a1);
          handB.addCardToBottom(b2);
        }
        else if (a1.compareTo(b2) > 0){ //hand A wins!
          handA.addCardToBottom(a1);
          handA.addCardToBottom(b2);
        }
      }
      
        System.out.println(handA.getSize() + " ---WAR--- " + handB.getSize());
        //round = 1;
        
        if ((stackA.getCard(stackA.getSize() - 1)).compareTo(stackB.getCard(stackB.getSize() - 1)) > 0) {
          System.out.println(handA.getSize() + " ---WAR--- " + handB.getSize());
          for (int i = 0; i < stackA.getSize(); i++) {
            handA.addCardToBottom(stackA.takeCardFromTop());
            handA.addCardToBottom(stackB.takeCardFromTop());
          }
        }
      
          round ++;
          System.out.println(" " + a1.toString() + "  :  " + b2.toString() + "    ");
    }
  }
}

public class War {
  
  public static void main(String[] args) {
    // create deck, hands and stacks
    CardDeck deck = new CardDeck();
    CardList handA = new CardList();
    CardList handB = new CardList();
    CardList stackA = new CardList();
    CardList stackB = new CardList();
    
    //shuffle the deck
    deck.Shuffle();
    
    // deal the cards Hand A
    for (int i = 0; i < deck.getSize(); i++) {
      handA.addCardToBottom(deck.takeCardFromTop());
    }
    
    //deal the cards Hand B
    handB = deck;
    
    // play
    System.out.println("A --- Player --- B");
    int round = 1;
    

          
    while (handA.getSize() != 0 && handB.getSize() != 0) {
      System.out.println(handA.getSize() + " ---Round " + round + "--- " + handB.getSize());
      
      //players turn over cards
      stackA.addCardToTop(handA.takeCardFromTop());
      stackB.addCardToTop(handB.takeCardFromTop());

      System.out.println(" " + stackA.getCard(0).toString() + "  :  " + stackB.getCard(0).toString() + "    ");
      
      //WAR
      while (stackA.getSize() > 0 && stackB.getSize() > 0 && stackA.getCard(0).compareTo(stackB.getCard(0)) == 0) {        
        if (handA.getSize() < 2) {
        //if hand A doesn't have enough cards for war
        if (handA.getSize() < 2) {
          for (int i = 0; i < stackB.getSize(); i = 0) {
            handB.addCardToTop(stackA.takeCardFromTop());
            handB.addCardToTop(stackB.takeCardFromTop());
          }
          if (handA.getSize() > 0) {
            handB.addCardToTop(handA.takeCardFromTop());
          }
        }
        //hand B doesn't have enough cards for war
        else if (handB.getSize() < 2) {
          for (int i = 0; i < stackB.getSize(); i = 0) {
            handA.addCardToTop(stackB.takeCardFromTop());
            handA.addCardToTop(stackA.takeCardFromTop());
          }
          if (handB.getSize() > 0) {
            handA.addCardToTop(handB.takeCardFromTop());
          }
        }
        
        else {
          System.out.println("-----WAR!-----");
          stackA.addCardToTop(handA.takeCardFromTop());
          stackB.addCardToTop(handB.takeCardFromTop());
          stackA.addCardToTop(handA.takeCardFromTop());
          stackB.addCardToTop(handB.takeCardFromTop());
          
          System.out.println("   " + stackA.getCard(0).toString() + " : " + stackB.getCard(0).toString());
        }
      }
      
      //When SOmeone WINS
      
      //PLAYER A
      if (stackB.getSize() == 0 || stackA.getCard(0).compareTo(stackB.getCard(0)) > 0) {
        for (int i = 0; i < stackB.getSize(); i = 0) {
          handA.addCardToTop(stackA.takeCardFromTop());
          handA.addCardToTop(stackB.takeCardFromTop());
        }
      }
      //PLAYER B
      else {
        for (int i = 0; i < stackB.getSize(); i = 0) {
          handB.addCardToTop(stackA.takeCardFromTop());
          handB.addCardToTop(stackB.takeCardFromTop());
        }
      }
      
      round++;
      
      //GAME OVER
      System.out.println("  GAME OVER!  ");
        
      if (handA.getSize() != 0) {
        System.out.println ("Player A WINS");
      }
      else {
        System.out.println("Player B WINS");
      }
      }
    }
  }
}

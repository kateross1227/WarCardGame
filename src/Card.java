// Complete Class card by extending abstract Class PlayingCard and implementing the Comparable interface
public class Card extends PlayingCard implements Comparable<Card> {
  
  //Constructors
  public Card(int suit, int rank) {
    super(suit, rank);
  }
  
  //Accessors
  public String toString() {
    String temp = "";
    if (this.getSuit() == 1) { //returns Printed solution if Hearts
      if (this.getRank() == 10) {
        temp = "H - T";
      }
      else if (this.getRank() == 11) {
        temp = "H - J";
      }
      else if (this.getRank() == 12) {
        temp = "H - Q";
      }
      else if (this.getRank() == 13) {
        temp = "H - K";
      }
      else { //everything else
        temp = "H - " + this.getRank();
      }
    }
    if (this.getSuit() == 2) { //returns Printed solution if Clubs
      if (this.getRank() == 10) {
        temp = "C - T";
      }
      else if (this.getRank() == 11) {
        temp = "C - J";
      }
      else if (this.getRank() == 12) {
        temp = "C - Q";
      }
      else if (this.getRank() == 13) {
        temp = "C - K";
      }
      else { //everything else
        temp = "C - " + this.getRank();
      }
    }
    if (this.getSuit() == 3) { //returns Printed solution if Diamonds
      if (this.getRank() == 10) {
        temp = "D - T";
      }
      else if (this.getRank() == 11) {
        temp = "D - J";
      }
      else if (this.getRank() == 12) {
        temp = "D - Q";
      }
      else if (this.getRank() == 13) {
        temp = "D - K";
      }
      else { //everything else
        temp = "D - " + this.getRank();
      }
    }
    if (this.getSuit() == 4) { //returns Printed solution if Spades
      if (this.getRank() == 10) {
        temp = "S - T";
      }
      else if (this.getRank() == 11) {
        temp = "S - J";
      }
      else if (this.getRank() == 12) {
        temp = "S - Q";
      }
      else if (this.getRank() == 13) {
        temp = "S - K";
      }
      else if (this.getRank() == 1) {
        temp = "S - A";
      }
      else { //everything else
        temp = "S - " + this.getRank();
      }
    }
    return temp;
  }
  
  public int compareTo(Card c) {
    return this.getRank() - c.getRank();
  }
}


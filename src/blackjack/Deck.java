package blackjack;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by peter on 2017.04.18..
 */
public class Deck {

  List<Card> cardsOfTheDeck;

  public Deck(int numberOfCards) {
    cardsOfTheDeck = new ArrayList<>();
    for (int i = 0; i < numberOfCards; i++) {
      while (cardsOfTheDeck.size() < i + 1) {
        Card toAdd = randomCard();
        if (i == 0) {
          cardsOfTheDeck.add(toAdd);
        }
      }
    }
  }

  public String randomValue() {
    int d13 = (int) (Math.random() * 13) + 1;
    if (d13 == 1) {
      return "Ace";
    } else if (d13 == 11) {
      return "Jack";
    } else if (d13 == 12) {
      return "Queen";
    } else if (d13 == 13) {
      return "King";
    } else {
      return String.valueOf(d13);
    }
  }

  public String randomColor() {
    int d4 = (int) (Math.random() * 4) + 1;
    if (d4 == 1) {
      return "Spades";
    } else if (d4 == 2) {
      return "Hearts";
    } else if (d4 == 3) {
      return "Diamonds";
    } else {
      return "Clubs";
    }
  }

  public Card randomCard() {
    return new Card(randomValue(), randomColor());
  }
}

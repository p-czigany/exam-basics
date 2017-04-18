package blackjack;

/**
 * Created by peter on 2017.04.18..
 */
public class Card {

  private String value, color;

  public Card(String value, String color) {
    this.value = value;
    this.color = color;
  }

  public String printCard() {
    return value + " " + color;
  }
}

/*
Peter Anthony Senko
2352959
senko@chapman.edu
CPSC231
War Assignment
I Didn't cheat.
*/

public class Card
{
  private int value;
  private String suit;

  public Card(int value, String suit)
  {
    this.value = value;
    this.suit = suit;
  }

  public String getSuit()
  {
    return suit;
  }

  public int getValue()
  {
    return value;
  }

  public String toString()
  {
    return value + " of " + suit;
  }

}

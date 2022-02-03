/*
Peter Anthony Senko
2352959
senko@chapman.edu
CPSC231
War Assignment
I Didn't cheat.
*/

public class player
{
  private int number;
  private Cards cards;

  public player(int number, Cards cards)
  {
    this.number = number;
    Cards cards = new Cards();
  }

  public int getNumber()
  {
    return number;
  }

  public boolean hasNoMoreCards()
  {
    if(cards.size()==0)
    {
      return true;
    }
    else
    {
      return false;
    }
  }

  public void receiveCard(Card card)
  {
    Cards = Cards + card;
  }

  public Cards flip3()
  {
      cards.remove(3);
  }

  public Card flip1()
  {
    cards.remove();
  }

  public boolean hasWon()
  {
    if(cards.size()==52)
    {
      return true;
    }
    else
    {
      return false;
    }
  }

  public String toString()
  {
    player.getNumber();
    if (value == 1)
      value = "Ace";
    else if (value == 11)
      value = "Jack";
    else if (value == 12)
      value = "Queen";
    else if (value == 13)
      value = "King";
    else
      value += value;

    if (suit == 1)
      suit = "Hearts";
    else if (suit == 2)
      suit = "Diamonds";
    else if (suit == 3)
      suit = "Clubs";
    else
      suit = "Spades";
    return  value + " of " + suit;
  }

}

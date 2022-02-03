/*
Peter Anthony Senko
2352959
senko@chapman.edu
CPSC231
War Assignment
I Didn't cheat.
*/

import java.util.LinkedList;
import java.util.Comparator;

public class Cards
{
  LinkedList<Card>cards;
  Random random = new Random();

  public void add(Card card)
  {
    cards.add(card);
  }

  public int size()
  {
    return card.size();
  }

  public void add(Card cards)
  {
    return cards.addAll(cards);
  }

  public Card get(int Index)
  {
    return cards.get(Index);
  }

  public int getValue(int Index)
  {
    return cards.getValue(Index);
  }

  public Cards removeTopCards(int numberToRemove)
  {
    for(int i=0; i<= numberToRemove; i++)
    {
      Card removeCard = cards.remove(i);
    }
  }

  protected Card drawRandomCard()
  {
    int randomCardIndex = random.nextInt(cards.size());
    return cards.remove(randomCardIndex);
  }

  public void sort()
  {
    cards.sort(new Comparator<Card>()
    {
        @Override
        public int compare(Card card1, Card card2)
        {
          if (card1.getValue() < card2.getValue())
            return -1;
          if(card1.getValue() > card2.getValue())
            return 1;
          return 0;
        }
    });
  }

  public Card[] toArray()
  {
    Card[] cardArray = new Card[card.size()];
    for( int i = 0; i < cards.size(); i++)
    {
      cardArray[i] = cards.get(i);
    }

    return cardArray;
  }

  public String toString()
  {
    for ( int i = 0; i<cards.size(); i++)
    {
      return value + " of " + suit;
    }
  }

}

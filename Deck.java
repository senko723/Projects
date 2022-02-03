/*
Peter Anthony Senko
2352959
senko@chapman.edu
CPSC231
War Assignment
I Didn't cheat.
*/

public class Deck extends Cards
{
  public void createNew()
  {
    String[] suits = new String[] {"Heart","Spade","Club","Diamond"};
    for (String suit : suits)
    {
      for (int value = 2;value <= 14; value++)
      {
        add(new Card(value,suit));
      }
    }
  }

  public void dealCards(Player player1, Player player2)
  {
    while (cards.size() > 0)
    {
      player1.receiveCard(drawRandomCard());
      player2.receiveCard(drawRandomCard());
    }
  }

}

/*
Peter Anthony Senko
2352959
senko@chapman.edu
CPSC231
War Assignment
I Didn't cheat.
*/

public class CardsInPlay
{
  static Cards player1Cards;
  static Cards player2Cards;

  public static void reset()
  {
    plsyer1Cards = new Cards();
    player2Cards = new Cards();
  }

  public static void add(Cards newCards, Player player)
  {
    Player.getNumber();
    //add cards
  }

  public static void add(Card newCard, Player player)
  {

  }

  public static void giveToPlayer(Player player)
  {

  }

  public static void playerCards(Cards player)
  {

  }

  public static int computeValueOfCards(Cards cards)
  {
    switch (cards.size())
    {
        case 1:
            return valueForOneCardPlayed(cards);
        case 2:
            return valueForTwoCardsPlayed(cards);
        case 3:
            return valueForThreeCardsPlayed(cards);
        default:
            return 0;
    }
  }

  public static int valueForOneCardPlayed(Cards cards)
  {

  }

  public static int valueForTwoCardsPlayed(Cards cards)
  {

  }

  public static int valueForThreeCardsPlayed(Cards cards)
  {

  }

  public static int computeValueOfPlayerCards(Player player)
  {
    if (player.getNumber() == 1)
        return computeValueOfCards(player1Cards);
    else
        return computeValueOfCards(player2Cards);
  }

  public static String makeString()
  {

  }
}

/*
Peter Anthony Senko
2352959
senko@chapman.edu
CPSC231
War Assignment
I Didn't cheat.
*/

public class WarMain
{
  static Game game;
  public static void simulate(int numberOfGames)
  {
    public static void main(String[numberOfGames] args)
    {
      Card newCard = new Card(4, "Clubs");
      Cards cards = new Cards();
      Player player = new Player();
      Deck deck = new Deck();
      CardsInPlay cardsInPlay = new CardsInPlay();
      Game game = new Game();
      WarResolver warResolver = new WarResolver();
      StatTracker statTracker = new StatTracker();


      System.out.println(newCard.toString());
      System.out.println(newCard.getSuit());
    }
    WarLogger.getInstance().release();
  }
}

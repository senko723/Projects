/*
Peter Anthony Senko
2352959
senko@chapman.edu
CPSC231
War Assignment
I Didn't cheat.
*/

public class Game
{
  static Player player1;
  static Player player2;
  static Deck deck;
  static Boolean isWar;

  public Game()
  {
  }

  public static void play()
  {
    Player player1 = new Player();
    Player player2 = new PLayer();
    Deck deck = new Deck();

    if ( isWar == true)
    {
      deck.resolve();
    }
  }
}

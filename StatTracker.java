/*
Peter Anthony Senko
2352959
senko@chapman.edu
CPSC231
War Assignment
I Didn't cheat.
*/

public class StatTracker
{
  static int maxBattles;
  static int minBattles;
  static int maxWars;
  static int minWars;
  static int totalGames;
  static int totalBattles;
  static int totalWars;
  static int totalDoubleWars;
  static int battlesInCurrentGame;
  static int warsInCurrentGame;
  static int doubleWarsInCurrentGame;

  public static void endgame()
  {
    totalBattles =totalBattles + battlesInCurrentGame;
    totalWars = totalWars + warsInCurrentGame;
    totalDoubleWars = totalDoubleWars + doubleWarsInCurrentGame;
    //update min and max stats
    totalGames = totalGames + 1;
    //reset stats
    return totalBattles;
    return totalWars;
    return totalDoubleWars;
    return totalGames;
  }

  public static void addBattle()
  {
    battlesInCurrentGame = battlesInCurrentGame + 1;
    return warsInCurrentGame;
  }

  public static void addWar()
  {
    warsInCurrentGame = warsInCurrentGame + 1;
    return warsInCurrentGame;
  }

  public static void addDoubleWar()
  {
    doubleWarsInCurrentGame = doubleWarsInCurrentGame + 1;
    return doubleWarsInCurrentGame;
  }

  public static int getBattleNumber()
  {
    return battlesInCurrentGame;
  }

  public static int getWarNumber()
  {
    return warsInCurrentGame;
  }

  public static int getGameNumber()
  {
    return totalGames;
  }

  public static double getAvgBattlesPerGame()
  {
    return (totalbattles/totalGames);
  }

  public static double getAvgWarsPerGame()
  {
    return (totalWars/totalGames);
  }

  public static double getAvgDoubleWarsPerGame()
  {
    return (totalDoubleWars/totalGames);
  }

  public static void report()
  {
    System.out.println("Average number of battles: " + getAvgBattlesPerGame());
    System.out.println("Average number of wars: " + getAvgWarsPerGame());
    System.out.println("Average number of double wars: " + getAvgDoubleWarsPerGame());
    System.out.println("Max number of battles: " + maxBattles);
    System.out.println("Min number of battles: " + minBattles);
    System.out.println("Max number of wars: " + maxWars);
    System.out.println("Min number of wars: " + minWars);
  }
}

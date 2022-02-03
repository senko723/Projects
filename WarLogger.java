/*
Peter Anthony Senko
2352959
senko@chapman.edu
CPSC231
War Assignment
I Didn't cheat.
*/

public class WarLogger
{
  Cards player1cards = cardsInPlay.playerCards(player1);
  Cards player2cards = cardsInPlay.playerCards(player2);
  WarLogger.getInstance().logBattle(StatTracker.getBattleNumber(), WarLogger.P1,player1Cards.toArray());
  WarLogger.getInstance().logBattle(StatTracker.getBattleNumber(), WarLogger.P2,player2Cards.toArray());

  String winnerForWarLogger = WarLogger.P1;

  WarLogger.getInstance().logBattleOutcome(StatTracker.getBattleNumber(), winnerForWarLogger);
  WarLogger.getInstance().logWarOutcome(StatTracker.getWarNumber(), winnerForWarLogger);
  WarLogger.getInstance().logGameOutcome(StatTracker.getGameNumber(), winnerForWarLogger);
}

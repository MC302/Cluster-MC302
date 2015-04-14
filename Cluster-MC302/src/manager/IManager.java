package manager;

import game.IGame;
import player.IPlayer;
import table.ITable;
import deck.card.ICard;
import deck.IDeck;

public interface IManager {
	public void connect(IGame game, IDeck deck, IPlayer[] player, ITable table);
	
	public void initializeStandartComponents();
	public void drawCardForPlayer(IPlayer player);
	public void putCardOnTable(ICard card, boolean visibility);
	public IPlayer getPlayerInformation(IPlayer player);
	public void endGame();
	
}

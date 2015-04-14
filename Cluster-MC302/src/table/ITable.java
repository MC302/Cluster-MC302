package table;

import java.util.List;

import player.IPlayer;
import deck.card.ICard;

public interface ITable {
	public List<ICardStack> getStacks(IPlayer p);
	public List<ICardStack> getAllStacks();
	
	public void newStack(List<IPlayer> permissionGroup);
	
	public void addToStack(ICard card, Integer stackId);
	public void addToStack(ICard card, ICardStack stack);
	
	public void cleanTable();

}

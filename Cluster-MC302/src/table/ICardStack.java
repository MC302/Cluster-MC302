package table;

import java.util.List;

import player.IPlayer;
import deck.card.ICard;

public interface ICardStack {
	public String getName();
	public Integer getId();
	
	public boolean isPlayerAllowed(IPlayer player);
	public List<ICard> getCards();
}

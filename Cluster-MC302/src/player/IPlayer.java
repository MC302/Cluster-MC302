package player;

import java.util.Vector;

import deck.card.Card;
import deck.card.ICard;

public interface IPlayer {
	
	public void addCard(ICard card);
	public Vector<Card> showHand();
	public ICard showCard();
	public int howManyCards();

}

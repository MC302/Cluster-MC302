package player;

import java.util.Vector;

import deck.card.Card;

public interface IPlayer {
	
	public void addCard(Card card);
	public Vector<Card> showHand();
	public Card showCard();
	public int howManyCards();

}

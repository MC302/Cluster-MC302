package interfaces.deck;

import cards.CardNumber;
import cards.Suit;

public interface Card {
	/**
	 * Get the Number of the card
	 * @return
	 */
	public CardNumber getNumber();
	
	/**
	 * Get the suit of the card
	 * @return
	 */
	public Suit getSuit();
	
}

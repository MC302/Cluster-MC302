package interfaces.player;

import interfaces.deck.Card;

import java.util.List;

public interface CardHolder {
	/**
	 * Add a card to entity hand
	 * @param c
	 */
	public void addCard(Card c);
	
	/**
	 * Remove a specific card from entity hand
	 * @param c
	 */
	public void discardCard(Card c);
	
	/**
	 * Returns the whole hand of the entity
	 * @return
	 */
	public List<Card> getHand();
	
	/**
	 * Empty the entity entire hand
	 */
	public void cleanHand();
}

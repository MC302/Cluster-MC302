package interfaces.deck;


public interface Deck {
	/**
	 * Return the next card on the deck, and removes it from it.
	 * @return
	 * @throws Exception 
	 */
	public Card drawCard() throws Exception;
	
	/**
	 * Shuffles the deck
	 */
	public void shuffle();
}

package interfaces;

public interface Deck {
	/**
	 * Return the next card on the deck, and removes it from it.
	 * @return
	 */
	public Card drawCard();
	
	/**
	 * Shuffles the deck
	 */
	public void shuffle();
}

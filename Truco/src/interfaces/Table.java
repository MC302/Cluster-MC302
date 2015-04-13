package interfaces;

import interfaces.deck.Card;
import interfaces.player.Player;

import java.util.List;

public interface Table {
	/**
	 * Returns the card that's winning the game
	 * @return
	 */
	public Card getWinningCard();
	/**
	 * Returns the player that's winning the game
	 * @return
	 */
	public Player GetWinningTeam();
	
	/**
	 * Call to play an card
	 * @param playedCard
	 * @param player
	 */
	public void playCard(Card playedCard, Player player);
	
	/**
	 * Returns all cards played
	 * @return
	 */
	public List<Card> getAllCards();
	
	/**
	 * Clean Table
	 */
	public void cleanTable();
}

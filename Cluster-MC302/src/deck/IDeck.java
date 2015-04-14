package deck;

import deck.card.Card;

public interface IDeck {
	public Card draw();
	public int cardsLeft();
	public void shuffle();
	public void reshuffle();
	public void cut(int height);
	public void cut();
}

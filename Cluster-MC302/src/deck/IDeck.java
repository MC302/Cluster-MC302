package deck;

import deck.card.Card;
import deck.card.ICard;

public interface IDeck {
	public ICard draw();
	public int cardsLeft();
	public void shuffle();
	public void reshuffle();
	public void cut(int height);
	public void cut();
}

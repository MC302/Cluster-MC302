package deck.card;
import player.IPlayer;

public interface ICard extends Comparable<Card> {
	public int getValue();
	public int[] getValues();
	public boolean equals(ICard card);
	public void resetOwner(IPlayer owner);
	public void resetOwner();
}

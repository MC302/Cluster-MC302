package deck;

public interface ICard extends Comparable<Card> {
	public int getValue();
	public int[] getValues();
	public boolean equals(Card card);
}

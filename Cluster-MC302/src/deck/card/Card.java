package deck.card;

import player.IPlayer;

public class Card implements ICard{
	public enum Suit
	{
		ouro(1),
		espadas(2),
		copas(3),
		paus(4);
		
		private int value;
		
		Suit(int value)
		{
			this.value=value;
		}
		
		public int getValue()
		{
			return this.value;
		}
	}
	public enum Face
	{
		ais(1),
		dois(2),
		tres(3),
		quatro(4),
		cinco(5),
		seis(6),
		sete(7),
		oito(8),
		nove(9),
		dez(10),
		valete(11),
		dama(12),
		rei(13),
		king(rei);
		
		private int value;
		
		Face(Face face)
		{
			this.value=face.value;
		}
		
		Face(int value)
		{
			this.value=value;
		}
		
		public int getValue()
		{
			return this.value;
		}
		
	}

	private Suit suit;
	private Face face;

	public Card(Suit suit, Face face) {
		super();
		this.suit = suit;
		this.face = face;
	}
	 
	public static Card[] simpleDeck()
	{
		return null;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (super.equals(obj))
			return true;
		if (obj.getClass()==this.getClass())
		{
			return this.equals((Card)obj);
			//TODO
			
		}
		return false;
	}

	public Suit getSuit() {
		return suit;
	}
	
	public Face getFace() {
		return face;
	}

	@Override
	public int[] getValues() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int compareTo(Card card) {
		if (this.getValue()>card.getValue())
			return 1;
		else if (this.getValue()<card.getValue())
			return -1;
		return 0;
	}

	@Override
	public int getValue() {
		return this.face.value;
	}

	@Override
	public boolean equals(Card card) {
		// TODO Auto-generated method stub
		return false;
	}
	
	@Override
	public String toString()
	{
		return null;
	}

	@Override
	public void resetOwner(IPlayer owner) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void resetOwner() {
		// TODO Auto-generated method stub
		
	}

	
	
}

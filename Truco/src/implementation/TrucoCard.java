package implementation;

import cards.Face;
import cards.Suit;


public class TrucoCard implements interfaces.deck.Card{
	private Face number;
	private Suit suit;

	public Face getNumber() {
		return number;
	}

	public Suit getSuit() {
		return suit;
	}
	
	public TrucoCard(Face number, Suit suit){
		this.number = number;
		this.suit = suit;
	}

}

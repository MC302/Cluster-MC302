package implementation;

import cards.CardNumber;
import cards.Suit;


public class TrucoCard implements interfaces.deck.Card{
	private CardNumber number;
	private Suit suit;

	public CardNumber getNumber() {
		return number;
	}

	public Suit getSuit() {
		return suit;
	}
	
	public TrucoCard(CardNumber number, Suit suit){
		this.number = number;
		this.suit = suit;
	}

}

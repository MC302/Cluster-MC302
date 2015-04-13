package implementation;

import interfaces.deck.Card;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

import cards.CardNumber;
import cards.Suit;

public class TrucoDeck implements interfaces.deck.Deck{
	List<Card> cards;
	
	public Card drawCard() throws Exception {
		if(cards == null || cards.size() == 0)
			throw new Exception();
		Card c = cards.get(0);
		cards.remove(c);
		return c;
	}
	
	public void shuffle() {
		Comparator<Card> shuffleComparator = new Comparator<Card>(){
			public int compare(Card o1, Card o2) {
				return new Random().nextInt(1) == 0 ? -1 : 1;
			}
		};
		cards.sort(shuffleComparator);
		
	}
	
	public TrucoDeck(){
		cards = new LinkedList<Card>();
		for( Suit s : Suit.values())
			for(CardNumber n : CardNumber.values()){
				cards.add(new TrucoCard(n,s));
			}
		this.shuffle();
	}
	
}

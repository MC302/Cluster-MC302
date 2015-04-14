package player;

import java.util.Vector;

import deck.card.Card;

public class Player {
	
	Vector<Card> hand;
	//int coins;
	
	public void addCard(Card card){}
	public Vector<Card> showHand(){
		return hand;
	}
	public Card showCard(int index){
		return hand.get(index);
	}
	public int howManyCards(){
		return hand.size();
	}
	//public int bet(){}
	//public int highest(){}
	//public void call(){}
	//public void fold(){}
	//public Card discard(int index){}
	
	
}

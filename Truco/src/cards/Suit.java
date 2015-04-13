package cards;

import java.util.Comparator;

public enum Suit implements Comparator<Suit>{
	DIAMONDS(0) ,SPADES(1), HEARTS(2), CLUBS(3);
	
	private final int order;
	private Suit(int order){
		this.order = order;
	}
	
	public int compare(Suit o1, Suit o2){
		if(o1 == null || o2 == null)
			throw new NullPointerException();
		return o1.order - o2.order;
	}

}

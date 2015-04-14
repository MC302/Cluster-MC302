package cards;

import java.util.Comparator;

public enum Face implements Comparator<Face>{
	FOUR(0),FIVE(1),SIX(2),SEVEN(3),EIGHT(4),NINE(5),TEN(6),QUEEN(7),KNAVE(8),KING(9),ONE(10),TWO(11),THREE(12);
	
	private int value;
	private Face(int value){
		this.value = value;
	}
	
	public int compare(Face o1, Face o2){
		return o1.value - o2.value;
	}
}

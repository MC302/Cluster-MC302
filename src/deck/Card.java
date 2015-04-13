package deck;
import java.util.*;

public class Card implements Comparable{
	public enum Naipe
	{
		ouro(1),
		espadas(2),
		copas(3),
		paus(4);
		
		private int valor;
		
		Naipe(int valor)
		{
			this.valor=valor;
		}
		
		public int getValor()
		{
			return this.valor;
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
		reis(13);
		
		private int valor;
		
		Face(int valor)
		{
			this.valor=valor;
		}
		
		public int getValor()
		{
			return this.valor;
		}
		
	}

	private Naipe naipe;
	private Face face;

	public Card(Naipe naipe, Face face) {
		super();
		this.naipe = naipe;
		this.face = face;
	}
	 
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		this.equals(o);
		return 0;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (super.equals(obj))
			return true;
		if (obj.getClass()==this.getClass())
		{
			Card other=(Card) obj;
			
		}
		return false;
	}

	public Naipe getNaipe() {
		return naipe;
	}
	
	public Face getFace() {
		return face;
	}

	
	
}

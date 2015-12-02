package apdp1;

public class Literal {

	/* Atributos privados */
	private char l;
	private boolean n;
	
	public Literal(char L, boolean N){
		l = L;
		n = N;
	}
	
	public char getL(){
		return l;
	}
	
	public boolean getNegated(){
		return n;
	}
}

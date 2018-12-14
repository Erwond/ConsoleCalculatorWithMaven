package ch.bbw.ConsoleCalculator;

public class Calculator {
	
	public int summe(int summand1, int summand2) {
		return summand1 + summand2;
	}
	
	protected double differenz(int minuend, int subtrahend){
		return minuend - subtrahend;
	}
	
	double quotient(int dividend, int teiler){
		return dividend/teiler;
	}
}

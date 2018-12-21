package ch.bbw.ConsoleCalculator;

/**
 * Class: Calculator
 * 
 * @author Eric Walker
 * @version 21.12.2018
 */
public class Calculator {

	public int summe(int summand1, int summand2) throws ArithmeticException {
		long num1 = summand1;
		long num2 = summand2;
		long sum = num1 + num2;
		if (sum > Integer.MAX_VALUE) {
			throw new ArithmeticException("Sum to high");
		} else if (sum < Integer.MIN_VALUE) {
			throw new ArithmeticException("Sum to low");
		} else {
			return summand1 + summand2;
		}
	}

	protected double differenz(int minuend, int subtrahend) {
		long num1 = minuend;
		long num2 = subtrahend;
		long dif = num1 - num2;
		if (dif > Integer.MAX_VALUE) {
			throw new ArithmeticException("Difference to high");
		} else if (dif < Integer.MIN_VALUE) {
			throw new ArithmeticException("Difference to low");
		} else {
			return minuend - subtrahend;
		}
	}

	double quotient(int dividend, int teiler) {
		return dividend / teiler;
	}

	String binaryFrom(int decimal) throws ArithmeticException{
		if(decimal < 0){
			throw new ArithmeticException("Negative decimal cannot be converted to binary");
		}else {
			return Integer.toBinaryString(decimal);
		}	
	}

	private void privateCalculation() {
		// Diese Methode kann nicht getestet werden, da sie private ist
	}
}

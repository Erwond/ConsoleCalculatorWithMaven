package ch.bbw.ConsoleCalculator;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import ch.bbw.ConsoleCalculator.Calculator;

/**
 * Class: AppTest
 * 
 * @author Eric Walker
 * @version 21.12.2018
 */
public class AppTest {
	private Calculator testee;

	@Before
	public void setUp() {
		testee = new Calculator();
	}

	@Test
	public void addTwoPositiveNumTogether() {
		assertTrue(testee.summe(23, 82) == 105);
	}

	@Test
	public void addTwoNegativeNumTogether() {
		assertTrue(testee.summe(-54, -92) == -146);
	}

	@Test
	public void addNegativeToPositive() {
		assertTrue(testee.summe(57, -42) == 15);
	}
	
	@Test
	public void addPositiveToNegative() {
		assertTrue(testee.summe(-58, 18) == -40);
	}
	
	@Test
	public void addZeroAndZeroTogether() {
		assertTrue(testee.summe(0, 0) == 0);
	}
	
	@Test
	public void addPositiveToZero() {
		assertTrue(testee.summe(0, 394) == 394);
	}

	@Test
	public void addNegativeToZero() {
		assertTrue(testee.summe(0, -943) == -943);
	}
	
	@Test(expected = java.lang.ArithmeticException.class)
	public void addPositiveToMaxValue(){
		testee.summe(Integer.MAX_VALUE, 49);
	}
	
	@Test
	public void subtractPositiveFromPositive() {
		assertTrue(testee.differenz(38, 26) == 12);
	}
	
	@Test
	public void subtractNegativeFromPositive() {
		assertTrue(testee.differenz(94, -6) == 100);
	}
	
	@Test
	public void subtractPositiveFromNegative() {
		assertTrue(testee.differenz(-64, 6) == -70);
	}
	
	@Test
	public void subtractNegativeFromNegative() {
		assertTrue(testee.differenz(-16, -39) == 23);
	}
	
	@Test
	public void subtractFromZero() {
		assertTrue(testee.differenz(0, 48) == -48);
	}
	
	@Test
	public void subtractZeroFromPositive() {
		assertTrue(testee.differenz(74, 0) == 74);
	}
	
	@Test(expected = java.lang.ArithmeticException.class)
	public void subtractFromMinValue() {
		testee.differenz(Integer.MIN_VALUE, 59);
	}
	
	@Test
	public void subtractZeroFromZero() {
		assertTrue(testee.differenz(0, 0) == 0);
	}
	
	@Test
	public void dividePositiveThroughPositive() {
		assertTrue(testee.quotient(28, 7) == 4);
	}
	
	@Test
	public void dividePositiveThroughNegative() {
		assertTrue(testee.quotient(63, -7) == -9);
	}
	
	@Test
	public void divideNegativeThroughPositive() {
		assertTrue(testee.quotient(-72, 6) == -12);
	}
	
	@Test
	public void divideNegativeThroughNegative() {
		assertTrue(testee.quotient(-18, -9) == 2);
	}
	
	@Test
	public void divideZeroThroughPositive() {
		assertTrue(testee.quotient(0, 68) == 0);
	}
	
	@Test
	public void divideZeroThroughNegative() {
		assertTrue(testee.quotient(0, -37) == 0);
	}
	
	@Test(expected = java.lang.ArithmeticException.class)
	public void divideBy0ExceptionExpected() {
		testee.quotient(49, 0);
	}

	@Test
	public void divideBy0ExceptionUnexpected() throws ArithmeticException {
		testee.quotient(35, 1);
	}
	
	@Test
	public void convertPositiveToBinary() {
		assertEquals(testee.binaryFrom(39), "100111");
	}
	
	@Test(expected = java.lang.ArithmeticException.class)
	public void convertNegativeToBinaryException() {
		testee.binaryFrom(-48);
	}
}

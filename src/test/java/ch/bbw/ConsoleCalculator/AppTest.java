package ch.bbw.ConsoleCalculator;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import ch.bbw.ConsoleCalculator.Calculator;

/**
 * Unit test for simple App.
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
	
	public void addPositiveToMaxValue(){
		assertTrue(testee.summe(Integer.MAX_VALUE, 49) == 0);
	}
	
	@Test
	public void subtractNegativeFromPositive() {
		assertTrue(testee.differenz(94, -6) == 100);
	}
	
	@Test(expected = java.lang.ArithmeticException.class)
	public void divideBy0ExceptionExpected() {
		testee.quotient(49, 0);
	}

	@Test
	public void divideBy0ExceptionUnexpected() throws ArithmeticException {
		testee.quotient(35, 1);
	}
}

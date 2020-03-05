package Hughes_Ian_Chapter6_Java_Project;

import static org.junit.Assert.*;

import org.junit.Test;

public class SimpleMathTest {

	@Test
	public void testThatZeroNumeratorReturnsZero() {
		SimpleMath smController = new SimpleMath();
		int expected = 0;
		assertEquals(expected, smController.divide(0,7), 0);
	}

	@Test
	public void testThatSmallerNumeratorReturnsZero() {
		SimpleMath smController = new SimpleMath();
		double expected = 0.25;
		assertEquals(expected, smController.divide(1, 4), 0);
	}
	
	@Test(expected=ArithmeticException.class)
	public void testThatZeroDenominatorThrowsException() {
		SimpleMath smController = new SimpleMath();
		smController.divide(6, 0);
	}
	
}

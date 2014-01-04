package Euler;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class EP006Test {
	
	private EP006 ep006;

	@Before
	public void setUp() throws Exception {
		ep006 = new EP006();
	}

	// I am going to adjust the uniform testing
	// I need to change the return value of this method
	@Test
	public void testSumOfSquare() {
		assertEquals( "5", Long.toString(ep006.sumOfSquare(2)) );
		assertEquals( "14", Long.toString(ep006.sumOfSquare(3)) );
		assertEquals( "30", Long.toString(ep006.sumOfSquare(4)) );
	}

	// I am going to adjust the uniform testing
	// I need to change the return value of this method
	@Test
	public void testSquareOfSum() {
		assertEquals( "9", Long.toString(ep006.squareOfSum(2)) );
		assertEquals( "36", Long.toString(ep006.squareOfSum(3)) );
		assertEquals( "100", Long.toString(ep006.squareOfSum(4)) );
	}

	@Test
	public void testSolution() {
		assertEquals("Result EP006Test", "25164150", ep006.solution());
	}

}

package Euler;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class EP007Test {
	
	private EP007 ep007;

	@Before
	public void setUp() throws Exception {
		ep007 = new EP007();
	}

	@Test
	public void testIsPrime() {
		assertTrue("3", ep007.isPrime(3));
		assertFalse("4", ep007.isPrime(4));
		assertTrue("11", ep007.isPrime(11));
		assertFalse("20", ep007.isPrime(20));
	}

	@Test
	public void testSolution() {
		assertEquals("Result EP007: ", "104743", ep007.solution());
	}

}

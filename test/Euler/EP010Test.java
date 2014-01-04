package Euler;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class EP010Test {
	
	private EP010 ep010;

	@Before
	public void setUp() throws Exception {
		ep010 = new EP010();
	}

	@Test
	public void testIsPrime() {
		assertTrue("3", ep010.isPrime(3));
		assertFalse("4", ep010.isPrime(4));
		assertTrue("11", ep010.isPrime(11));
		assertFalse("20", ep010.isPrime(20));
	}

	@Test
	public void testSolution() {
		assertEquals("Result EP010: ", "142913828922", ep010.solution());
	}

}

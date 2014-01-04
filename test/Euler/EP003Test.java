package Euler;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class EP003Test {

	private EP003 ep003;
	
	@Before
	public void setUp() throws Exception {
		ep003 = new EP003();
	}

	@Test
	public void testIsPrime() {
		assertTrue("3", ep003.isPrime(3));
		assertFalse("4", ep003.isPrime(4));
		assertTrue("11", ep003.isPrime(11));
		assertFalse("20", ep003.isPrime(20));
		assertTrue("6857", ep003.isPrime(6857));
	}

	@Test
	public void testSolution() {
		assertEquals("Result EP003Test: ", "6857" , ep003.solution());
	}

}

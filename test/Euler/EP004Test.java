package Euler;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class EP004Test {

	private EP004 ep004;
	
	@Before
	public void setUp() throws Exception {
		ep004 = new EP004();
	}

	@Test
	public void testIsPalindromic() {
		assertTrue("11211", ep004.isPalindromic("11211"));
		assertTrue("888", ep004.isPalindromic("888"));
		assertTrue("abcba", ep004.isPalindromic("abcba"));
		assertFalse("123", ep004.isPalindromic("123"));
		assertFalse("11001", ep004.isPalindromic("11001"));
		assertFalse("xyz", ep004.isPalindromic("xyz"));
	}

	@Test
	public void testSolution() {
		assertEquals("Result EP004Test: ", "906609", ep004.solution());
	}

}

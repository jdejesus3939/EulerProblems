package Euler;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class EP011Test {

	private EP011 ep011;
	
	@Before
	public void setUp() throws Exception {
		ep011 = new EP011();
	}

	@Test
	public void testIsInBoundary() {
		assertTrue("1", ep011.isInBoundary(4, 16, 4));
		assertFalse("0", ep011.isInBoundary(1, 9, 4));
		assertTrue("1", ep011.isInBoundary(6, 9, 4));
		assertFalse("0", ep011.isInBoundary(5, 19, 4));
		assertTrue("1", ep011.isInBoundary(16, 12, 4));
		assertFalse("0", ep011.isInBoundary(3, 19, 4));
	}

	@Test
	public void testSolution() {
		assertEquals("Result EP011: ", "70600674", ep011.solution());
	}

}

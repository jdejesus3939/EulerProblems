package Euler;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class EP009Test {
	
	private EP009 ep009;

	@Before
	public void setUp() throws Exception {
		ep009 = new EP009();
	}

	@Test
	public void testSolution() {
		assertEquals("Result EP009: ", "31875000", ep009.solution());
	}

}

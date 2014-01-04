package Euler;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class EP008Test {

	private EP008 ep008;
	
	@Before
	public void setUp() throws Exception {
		ep008 = new EP008();
	}

	@Test
	public void testSolution() {
		assertEquals("Result EP008: ", "40824", ep008.solution());
	}

}

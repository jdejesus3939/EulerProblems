package Euler;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class EP013Test {
	
	private EP013 ep013;

	@Before
	public void setUp() throws Exception {
		ep013 = new EP013();
	}

	@Test
	public void testSolution() {
		assertEquals("Result EP013: ", "5537376230", ep013.solution());
	}

}

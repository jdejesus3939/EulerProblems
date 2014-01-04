package Euler;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class EP002Test {
	
	private EP002 ep002;

	@Before
	public void setUp() throws Exception {
		ep002 = new EP002();
	}

	@Test
	public void testSolution() {
		assertEquals("Result EP002Test: ", "4613732" , ep002.solution());
	}

}

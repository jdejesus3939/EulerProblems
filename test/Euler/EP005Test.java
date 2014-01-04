package Euler;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class EP005Test {
	
	private EP005 ep005;

	@Before
	public void setUp() throws Exception {
		ep005 = new EP005();
	}

	/* I am going to change the logic here
	 * so that the testing can be performed.
	@Test
	public void testCompute() {
		fail("Not yet implemented");
	}
	*/

	@Test
	public void testSolution() {
		assertEquals("Result EP005Test: ", "232792560", ep005.solution());
	}

}

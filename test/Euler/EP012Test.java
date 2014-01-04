package Euler;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class EP012Test {
	
	private EP012 ep012;

	@Before
	public void setUp() throws Exception {
		ep012 = new EP012();
	}

	@Test
	public void testFindFactor() {
		assertEquals("2", Integer.toString(ep012.findFactor(7)));
		assertEquals("3", Integer.toString(ep012.findFactor(9)));
		assertEquals("6", Integer.toString(ep012.findFactor(12)));
		assertEquals("4", Integer.toString(ep012.findFactor(14)));
		assertEquals("6", Integer.toString(ep012.findFactor(18)));
	}

	@Test
	public void testSolution() {
		assertEquals("Result EP012: ", "76576500", ep012.solution());
	}

}

package Euler;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class EP001Test {
	
	private EP001 ep001; 

	@Before
	public void setUp() throws Exception {
		ep001 = new EP001();
	}

	@Test
	public void testSolution() {
		assertEquals("Result EP001Test: ", "233168" , ep001.solution());
	}

}

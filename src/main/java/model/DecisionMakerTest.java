/**
 * @author Evan Bunnell - ebunnell
 * CIS175 12737 - Fall 2023
 * Sep 20, 2023
 */
package model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * 
 */
class DecisionMakerTest {
	public String yes = "Yes";
	public String no = "no";
	DecisionMaker dmy = new DecisionMaker(yes);
	DecisionMaker dmn = new DecisionMaker(no);

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void testTrue() {	
		assertEquals(dmy.saysYes(yes), true);
	}
	
	@Test
	void testFalse() {
		assertEquals(dmn.saysYes(no), false);
	}

}

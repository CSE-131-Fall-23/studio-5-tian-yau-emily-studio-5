package studio5.tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import studio5.Methods;

/**
 * @author Dennis Cosgrove (http://www.cse.wustl.edu/~cosgroved/)
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({ SubstituteAllTest.class })
public class SubstituteAllTestSuite {
	@Test
	public void test2Rounds() {
		String source = "b is t, t b,";

		String actual = Methods.substituteAll(source, 'b', "beauty");
		assertEquals("beauty is t, t beauty,", actual);

		String actualPrime = Methods.substituteAll(actual, 't', "truth");
		assertEquals("beautruthy is truth, truth beautruthy,", actualPrime);
	}
}

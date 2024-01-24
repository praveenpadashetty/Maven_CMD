package jar;

import static org.junit.Assert.assertTrue;

import org.testng.annotations.Test;


/**
 * Unit test for simple App.
 */
public class AppTest {
	/**
	 * Rigorous Test :-)
	 */
	@Test
	public void shouldAnswerWithTrue() {
		assertTrue(true);
	}

	@Test(groups = {"SMOKE","REGRESSION"})
	public void testAdd() {

	}
	@Test(groups = {"REGRESSION"})
	public void testSub() {

	}
	@Test(groups = {"SMOKE","REGRESSION"})
	public void testMul() {

	}
	@Test(groups = {"REGRESSION"})
	public void testDiv() {

	}

}

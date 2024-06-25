package Code25_11;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.Test;

//Assertion means Comparing the Value

//Assertion Test Demo

public class AssertTest {

	@Test
	public void testForAssertEquals()
	{
		int result = 1;
		int expected = 1;
		assertEquals(result,expected);
	}
	
	@Test
	public void testForAssertTrue()
	{
		assertTrue("Hello".contains("e"));
	}
	
	@Test
	public void testForAssertFalse()
	{
		assertFalse("Hello".contains("k"));
	}
	
	@Test
	public void testForNull()
	{
		String s = null;
		assertNull(s);
	}
	
	@Test
	public void testForAssertThrow()
	{
		assertThrows(IllegalArgumentException.class, () -> {
			throw new IllegalArgumentException("Invalid Argument");
		});
	}
	
	@Test
	public void testFail()
	{
		fail("It is Failed");
	}
	
}

package Code25_11;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;

//Demonstarte Disabled Test


public class DisabledTest {

	@Test
	
	void test1()
	{
		System.out.println("Test 1");
	}
	
	@Disabled
	
	@Test
	void test2()
	{
		System.out.println("Test 2");
	}
	
	@Test
	void test3()
	{
		System.out.println("Test 3");
	}
}

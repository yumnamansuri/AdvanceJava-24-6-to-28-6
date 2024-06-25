package Code25_11;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

// Parameterized --> Having and Argument

public class ParameterizedTestDemo {

	@ParameterizedTest
	@ValueSource(strings={"racecar","radar","string","madam"})
	void testPalindromes(String word)
	{
		assertTrue(word.equals(new StringBuffer(word).reverse().toString()));
	}
}

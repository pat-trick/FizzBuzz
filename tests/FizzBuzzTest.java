import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Tests the FizzBuzz class.
 */
public class FizzBuzzTest {

  /**
   * Tests the calculateFizzBuzz method.
   * @throws Exception any error messages thrown.
   */
  @Test
  public void testCalculateFizzBuzz() throws Exception {
    assertEquals("Neither divisible by 3 or 5", "4", FizzBuzz.calculateFizzBuzz(4));
    assertEquals("Divisible by 3", "Fizz", FizzBuzz.calculateFizzBuzz(6));
    assertEquals("Divisible by 5", "Buzz", FizzBuzz.calculateFizzBuzz(10));
    assertEquals("Divisible by 3 and 5", "FizzBuzz", FizzBuzz.calculateFizzBuzz(15));
  }
}
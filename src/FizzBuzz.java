/**
 * Solution to the FizzBuzz problem, which tests if values are divisible
 * by either 5, 3, or both.
 * Created by patrick on 2/4/15.
 */
public class FizzBuzz {

  /**
   * Calculates FizzBuzz up to 10.
   * @param args Ignored.
   */
  public static void main(String[] args) {

    calculateFizzBuzz(100);
  }

  /**
   * Calculates FizzBuzz up to and including the maxValue.
   * @param maxValue The maximum value to calculate up to.
   * @return The last value calculated.
   */
  static String calculateFizzBuzz(int maxValue) {

    String output = null;

    for (int i = 1; i <= maxValue; i++) {
      if (((i % 3) == 0) && ((i % 5) == 0)) {
        output  = "FizzBuzz";
      }
      else if ((i % 3) == 0) {
        output = "Fizz";
      }
      else if ((i % 5) == 0) {
        output = "Buzz";
      }
      else {
        output = Integer.toString(i);
      }
      System.out.println(output);
    }
    //System.out.println(output);
    return output;
  }
}

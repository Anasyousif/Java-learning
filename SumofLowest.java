    import java.util.Arrays;

public class SumofLowest {


  /**
   * Calculates the sum of the two lowest positive numbers in an array.
   *
   * @param numbers An array of positive long integers.
   * @return The sum of the two smallest numbers.
   */
  public static long sumTwoSmallestNumbers(long[] numbers) {
    // Sort the array in ascending order.
    Arrays.sort(numbers);

    // The two smallest numbers will now be at index 0 and 1.
    // Return their sum.
    return numbers[0] + numbers[1];
  }
}
    


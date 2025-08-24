
import java.util.Arrays;
public class SumofElH {
      /**
   * Sums all numbers in a given array, except the highest and the lowest element.
   *
   * @param numbers The input array of integers.
   * @return The sum of the numbers, excluding the highest and lowest, or 0 for invalid input.
   */
  public static int sum(int[] numbers) {
    // 1. Input validation: Check for null, empty, or single-element arrays.
    if (numbers == null || numbers.length <= 1) {
      return 0;
    }

    // 2. Sort the array to easily find the minimum and maximum values.
    // The lowest will be at index 0 and the highest at index numbers.length - 1.
    Arrays.sort(numbers);

    // 3. Sum the numbers, skipping the first (lowest) and last (highest) elements.
    int totalSum = 0;
    for (int i = 1; i < numbers.length - 1; i++) {
      totalSum += numbers[i];
    }

    return totalSum;
  }
}


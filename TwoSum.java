import java.util.HashMap;
import java.util.Map;

public class TwoSum {
  /**
   * Finds two numbers in an array that sum up to a target value and returns their indices.
   *
   * @param numbers The input array of integers.
   * @param target The target sum.
   * @return An array containing the indices of the two numbers.
   */
  public static int[] twoSum(int[] numbers, int target) {
    // A map to store numbers we have seen and their corresponding indices.
    Map<Integer, Integer> seenNumbers = new HashMap<>();

    // Iterate through the array with a standard for loop to get both index and value.
    for (int i = 0; i < numbers.length; i++) {
      int currentNumber = numbers[i];
      // Calculate the complement needed to reach the target.
      int complement = target - currentNumber;

      // Check if the complement exists as a key in our map.
      if (seenNumbers.containsKey(complement)) {
        // If it does, we've found the two numbers. Return their indices.
        // The first index is the one stored in the map, and the second is the current index.
        return new int[] {seenNumbers.get(complement), i};
      }

      // If the complement is not in the map, add the current number and its index.
      seenNumbers.put(currentNumber, i);
    }
    
    // According to the problem description, a valid solution will always be found.
    // This line is a fallback and should not be reached.
    return new int[] {};
  }
}

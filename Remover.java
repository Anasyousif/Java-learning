public class Remover {

  public static int[] removeSmallest(int[] numbers) {
    // Handle the edge case of an empty array.
    if (numbers.length == 0) {
      return new int[0];
    }

    // Find the minimum value and its index.
    int minVal = numbers[0];
    int minIndex = 0;
    for (int i = 1; i < numbers.length; i++) {
      if (numbers[i] < minVal) {
        minVal = numbers[i];
        minIndex = i;
      }
    }

    // Create a new array one size smaller than the original.
    int[] result = new int[numbers.length - 1];
    
    // Copy elements to the new array, skipping the smallest one.
    int resultIndex = 0;
    for (int i = 0; i < numbers.length; i++) {
      if (i != minIndex) {
        result[resultIndex] = numbers[i];
        resultIndex++;
      }
    }
    
    return result;
  }
}
public class Kata {
  public static int findEvenIndex(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      int leftSum = 0;
      int rightSum = 0;

      // Sum of elements to the left of index i
      for (int j = 0; j < i; j++) {
        leftSum += arr[j];
      }

      // Sum of elements to the right of index i
      for (int j = i + 1; j < arr.length; j++) {
        rightSum += arr[j];
      }

      if (leftSum == rightSum) {
        return i;
      }
    }
    return -1;
  }
}

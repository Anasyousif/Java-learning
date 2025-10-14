public class Max {
  public static int sequence(int[] arr) {
    if (arr == null || arr.length == 0) {
      return 0;
    }

    int maxSoFar = 0;
    int currentMax = 0;

    for (int num : arr) {
      currentMax += num;
      if (currentMax < 0) {
        currentMax = 0;
      }
      if (currentMax > maxSoFar) {
        maxSoFar = currentMax;
      }
    }
    return maxSoFar;
  }
}
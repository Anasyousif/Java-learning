public class range {
    public static int[] between(int a, int b) {
    int[] result = new int[b - a + 1];
    for (int i = 0; i <= b - a; i++) {
      result[i] = a + i;
    }
    return result;
  }
}

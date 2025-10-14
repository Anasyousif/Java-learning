import java.util.stream.IntStream;

class Positive {
  public static int sum(int[] arr) {
    return IntStream.of(arr)
        .filter(x -> x > 0)
        .sum();
  }
}
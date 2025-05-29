public class DRoot {
  public static int digital_root(int n) {
    // Keep summing the digits until a single-digit number is obtained
    while (n >= 10) {
      int sum = 0;
      while (n > 0) {
        sum += n % 10;  // Add the last digit
        n /= 10;        // Remove the last digit
      }
      n = sum;          // Set n to the sum and repeat if necessary
    }
    return n;
  }
}

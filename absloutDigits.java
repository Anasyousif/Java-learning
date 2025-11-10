public class absloutDigits {
     public static int sumDigits(int number) {
    // 1. Get the absolute value of the number. This converts -32 to 32,
    // ensuring we only deal with positive digits.
    int absNumber = Math.abs(number);

    int sum = 0;

    // 2. Iterate through the digits using modulo (%) and division (/).
    // The loop runs as long as there are digits left in the number.
    while (absNumber > 0) {
      // Get the last digit (e.g., 32 % 10 = 2)
      int digit = absNumber % 10;
      
      // Add the digit to the running sum
      sum += digit;
      
      // Remove the last digit (e.g., 32 / 10 = 3)
      absNumber /= 10;
    }

    return sum;
  }
}

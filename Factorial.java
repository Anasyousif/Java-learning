public class Factorial {
    public int factorial(int n) {
        // Validation: Throw an exception if the input is outside the allowed range [0, 12].
        // 12! is the largest factorial that fits into a standard signed 32-bit integer.
        if (n < 0 || n > 12) {
            throw new IllegalArgumentException(
                "Input n must be between 0 and 12, inclusive. Value " + n + 
                " is out of range for standard integer factorial calculation."
            );
        }

        // Base case: 0! = 1
        if (n == 0) {
            return 1;
        }

        // Iterative calculation of n! for n > 0
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }

        return result;
    }
}

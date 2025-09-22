public class postiveNegative {
    public static int[] countPositivesSumNegatives(int[] input) {
        // Handle edge cases: null or empty array
        if (input == null || input.length == 0) {
            return new int[0];
        }

        int positiveCount = 0;
        int negativeSum = 0;

        // Iterate through the array
        for (int number : input) {
            if (number > 0) {
                positiveCount++;
            } else if (number < 0) {
                negativeSum += number;
            }
        }

        // Return the new array with the results
        return new int[] {positiveCount, negativeSum};
    }
}

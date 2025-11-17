public class DigitReverser {
    public static int[] digitize(long n) {
        // 1. Convert to String and 2. Reverse the string
        String reversedString = new StringBuilder(String.valueOf(n))
                                    .reverse()
                                    .toString();

        // 3. Convert the reversed string back into an array of integers
        return reversedString.chars() // Gets an IntStream of character ASCII values
                             .map(c -> c - '0') // Convert character digit (ASCII) to its integer value
                             .toArray(); // Convert the stream back to an array
    }
}

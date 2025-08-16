public class FakeBinary {
    public static String fakeBin(String numberString) {
        // Create a StringBuilder to efficiently build the new string.
        StringBuilder result = new StringBuilder();

        // Loop through each character of the input string.
        for (int i = 0; i < numberString.length(); i++) {
            // Get the digit character at the current index.
            char digitChar = numberString.charAt(i);

            // Convert the character to an integer.
            // The value of a char digit is its ASCII value.
            // By subtracting '0', we get its integer value.
            int digit = digitChar - '0';

            // Check if the digit is less than 5.
            if (digit < 5) {
                // If it is, append '0' to our result.
                result.append('0');
            } else {
                // Otherwise, append '1'.
                result.append('1');
            }
        }

        // Return the final string.
        return result.toString();
    }
}
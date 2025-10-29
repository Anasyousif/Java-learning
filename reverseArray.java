public class reverseArray {
    public static int[] digitize(long n) {
        // Convert the long 'n' to its String representation.
        String s = String.valueOf(n);
        
        // Create an integer array to store the reversed digits.
        // The size of the array will be the number of digits (length of the string).
        int[] result = new int[s.length()];
        
        // Iterate through the string from the last character (which is the first digit 
        // in the reversed order) down to the first character.
        for (int i = s.length() - 1, j = 0; i >= 0; i--, j++) {
            // Get the character at index 'i'.
            char digitChar = s.charAt(i);
            
            // Convert the character digit to its integer value.
            // Subtracting the character '0' from a digit character is a standard 
            // way in Java/C/C++ to get its integer value (e.g., '5' - '0' = 5).
            result[j] = digitChar - '0';
        }
        
        return result;
    }
}

public class StringwithNumbers {
    public static String incrementString(String str) {
    int n = str.length();
    int i = n - 1;

    // 1. Find the split point (i will point to the last non-digit character index, or -1)
    // Loop backward until a non-digit character is found or the beginning of the string is reached.
    while (i >= 0 && Character.isDigit(str.charAt(i))) {
      i--;
    }

    // i + 1 is the starting index of the numeric suffix (or n if the string is fully numeric)
    String prefix = str.substring(0, i + 1);
    String numStr = str.substring(i + 1);

    if (numStr.isEmpty()) {
      // Case 1: The string does not end with a number (e.g., "foo")
      return str + "1";
    } else {
      // Case 2: The string ends with a number (e.g., "foobar23", "foo099")

      // Get the original length of the numeric part (including leading zeros)
      int numLength = numStr.length();

      // Convert the number string to a long to prevent potential overflow
      long number = Long.parseLong(numStr);
      number++; // Increment the number

      // Format the number back into a string, respecting the padding
      String newNumStr = String.valueOf(number);

      // Determine the required padding width: use the original length OR the new length (for overflow like 9 -> 10)
      int paddingWidth = Math.max(numLength, newNumStr.length());

      // Use String.format to format the new number with leading zeros
      // %0[width]d pads the number with zeros up to the specified width
      String resultNum = String.format("%0" + paddingWidth + "d", number);

      // Concatenate the prefix and the newly formatted number
      return prefix + resultNum;
    }
  }
}

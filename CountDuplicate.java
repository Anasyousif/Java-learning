import java.util.HashMap;
import java.util.Map;

public class CountingDuplicates {
  /**
   * Counts the number of distinct case-insensitive alphabetic characters and numeric digits that
   * occur more than once in the input string.
   *
   * @param text The input string.
   * @return The count of distinct characters that are duplicates.
   */
  public static int duplicateCount(String text) {
    // A map to store character frequencies. Keys are characters, values are their counts.
    Map<Character, Integer> charCounts = new HashMap<>();

    // Convert the entire string to lowercase to ensure case-insensitivity.
    String lowerCaseText = text.toLowerCase();

    // Iterate over each character in the lowercase string to populate the map.
    for (char c : lowerCaseText.toCharArray()) {
      // getOrDefault(key, defaultValue) returns the value for the key, or 0 if it's not present.
      // We then add 1 to the count and put it back into the map.
      charCounts.put(c, charCounts.getOrDefault(c, 0) + 1);
    }

    int duplicateCount = 0;
    // Iterate over the values (counts) in the map.
    for (int count : charCounts.values()) {
      // If a character's count is greater than 1, it's a duplicate.
      if (count > 1) {
        duplicateCount++;
      }
    }

    return duplicateCount;
  }
}
import java.util.HashMap;
import java.util.Map;

public class DuplicateEncoder {

    static String encode(String word) {
        // Convert the word to lowercase to handle case-insensitivity
        String lowerCaseWord = word.toLowerCase();
        
        // Use a HashMap to store character frequencies
        Map<Character, Integer> charCounts = new HashMap<>();
        for (char c : lowerCaseWord.toCharArray()) {
            charCounts.put(c, charCounts.getOrDefault(c, 0) + 1);
        }

        // Use a StringBuilder to efficiently build the new string
        StringBuilder result = new StringBuilder();
        for (char c : lowerCaseWord.toCharArray()) {
            if (charCounts.get(c) > 1) {
                result.append(")");
            } else {
                result.append("(");
            }
        }

        return result.toString();
    }
}
import java.util.HashSet;
import java.util.Set;

public class PangramChecker {
    private static final int ALPHABET_COUNT = 26;

    public static boolean isPangram(String sentence) {
        if (sentence == null) return false;
        
        Set<Character> uniqueLetters = new HashSet<>();
        
        for (char ch : sentence.toLowerCase().toCharArray()) {
            if (Character.isLetter(ch)) {
                uniqueLetters.add(ch);
            }
            if (uniqueLetters.size() == ALPHABET_COUNT) {
                return true; // No need to continue checking
            }
        }
        
        return uniqueLetters.size() == ALPHABET_COUNT;
    }

    public static void main(String[] args) {
        String testSentence = "The quick brown fox jumps over the lazy dog";
        System.out.println("Is pangram? " + isPangram(testSentence)); // Output: true
    }
}

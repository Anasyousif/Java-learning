import java.util.HashSet;

public class PangramChecker1 {
    public boolean checkWithHashSet(String sentence) {
        HashSet<Character> alphabet = new HashSet<>();
        for (char c : sentence.toLowerCase().toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                alphabet.add(c);
            }
        }
        return alphabet.size() == 26;
    }
}
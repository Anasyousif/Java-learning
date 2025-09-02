import java.util.HashSet;
import java.util.Set;

public class isIsogram {
     public static boolean isIsogram(String str) {
        if (str == null || str.isEmpty()) {
            return true;
        }

        Set<Character> seenLetters = new HashSet<>();
        String lowerCaseStr = str.toLowerCase();

        for (char ch : lowerCaseStr.toCharArray()) {
            if (!Character.isLetter(ch)) {
                // This part of the problem assumes the string only contains letters,
                // but this check makes the function more robust.
                continue;
            }
            if (!seenLetters.add(ch)) {
                return false;
            }
        }

        return true;
    }
    
}

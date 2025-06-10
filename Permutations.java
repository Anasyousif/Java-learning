import java.util.*;

class Permutations {
    
    public static List<String> singlePermutations(String s) {
        Set<String> result = new HashSet<>();
        permute(" ", s, result);
        return new ArrayList<>(result);
    }
    
    private static void permute(String prefix, String remaining, Set<String> result) {
        if (remaining.isEmpty()) {
            result.add(prefix);
        } else {
            for (int i = 0; i < remaining.length(); i++) {
                String newPrefix = prefix + remaining.charAt(i);
                String newRemaining = remaining.substring(0, i) + remaining.substring(i + 1);
                permute(newPrefix, newRemaining, result);
            }
        }
    }
}

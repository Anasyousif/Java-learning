import java.util.Arrays;

class LongestConsec {

    public static String longestConsec(String[] strarr, int k) {
        if (strarr == null || k <= 0 || k > strarr.length) {
            return "";
        }

        String longestString = "";
        for (int i = 0; i <= strarr.length - k; i++) {
            StringBuilder currentString = new StringBuilder();
            for (int j = 0; j < k; j++) {
                currentString.append(strarr[i + j]);
            }
            if (currentString.length() > longestString.length()) {
                longestString = currentString.toString();
            }
        }
        return longestString;
    }
}
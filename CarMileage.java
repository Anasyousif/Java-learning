import java.util.*;

public class CarMileage {

    public static int isInteresting(int number, int[] awesomePhrases) {
        for (int i = 0; i <= 2; i++) {
            int current = number + i;
            if (current >= 100 && isInterestingNumber(current, awesomePhrases)) {
                return (i == 0) ? 2 : 1;
            }
        }
        return 0;
    }

    private static boolean isInterestingNumber(int num, int[] awesomePhrases) {
        String s = Integer.toString(num);
        return isAllZeros(s) || isAllSameDigits(s) || isSequentialIncrementing(s) ||
               isSequentialDecrementing(s) || isPalindrome(s) || isAwesomePhrase(num, awesomePhrases);
    }

    private static boolean isAllZeros(String s) {
        return s.matches("^\\d0+$");
    }

    private static boolean isAllSameDigits(String s) {
        return s.matches("^(\\d)\\1+$");
    }

    private static boolean isSequentialIncrementing(String s) {
        String seq = "1234567890";
        return seq.contains(s);
    }

    private static boolean isSequentialDecrementing(String s) {
        String seq = "9876543210";
        return seq.contains(s);
    }

    private static boolean isPalindrome(String s) {
        return new StringBuilder(s).reverse().toString().equals(s);
    }

    private static boolean isAwesomePhrase(int num, int[] awesomePhrases) {
        for (int phrase : awesomePhrases) {
            if (num == phrase) return true;
        }
        return false;
    }

    // Optional main method for testing
    public static void main(String[] args) {
        System.out.println(isInteresting(3, new int[]{1337, 256})); // 0
        System.out.println(isInteresting(1336, new int[]{1337, 256})); // 1
        System.out.println(isInteresting(1337, new int[]{1337, 256})); // 2
        System.out.println(isInteresting(11208, new int[]{1337, 256})); // 0
        System.out.println(isInteresting(11209, new int[]{1337, 256})); // 1
        System.out.println(isInteresting(11211, new int[]{1337, 256})); // 2
    }
}

import java.util.*;

public class RemovedNumbers {

    public static List<long[]> removNb(long n) {
        List<long[]> result = new ArrayList<>();
        long total = n * (n + 1) / 2;

        for (long a = 1; a <= n; a++) {
            long b = (total - a) / (a + 1);

            if (b <= n && a * b == total - a - b) {
                result.add(new long[]{a, b});
            }
        }

        return result;
    }

    public static void main(String[] args) {
        List<long[]> output = removNb(26);
        for (long[] pair : output) {
            System.out.println(Arrays.toString(pair));
        }
    }
}

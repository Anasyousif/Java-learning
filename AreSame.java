import java.util.Arrays;

public class AreSame {
    public static boolean comp(int[] a, int[] b) {
        if (a == null || b == null) return false;

        int[] aSquared = Arrays.stream(a).map(x -> x * x).toArray();
        Arrays.sort(aSquared);
        Arrays.sort(b);

        return Arrays.equals(aSquared, b);
    }

    public static void main(String[] args) {
        int[] a = {121, 144, 19, 161, 19, 144, 19, 11};
        int[] b = {121, 14641, 20736, 361, 25921, 361, 20736, 361};

        System.out.println(comp(a, b)); // Output: true
    }
}

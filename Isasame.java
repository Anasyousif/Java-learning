import java.util.Arrays;
public class Isasame {
    
    /**
     * Checks if the elements in b are the squares of the elements in a, with the same
     * frequencies (multiplicities).
     *
     * @param a The first integer array.
     * @param b The second integer array.
     * @return true if b is the squared version of a (with the same multiplicities), false otherwise.
     */
    public static boolean comp(int[] a, int[] b) {
        // 1. Handle edge cases: null array, or different lengths
        if (a == null || b == null || a.length != b.length) {
            return false;
        }

        // If both arrays are empty (length 0), they are considered "the same".
        if (a.length == 0) {
            return true;
        }

        // 2. Square the elements in 'a' and store them in a new array.
        // We use 'long' for squaring to prevent potential integer overflow,
        // although the problem examples suggest 'int' might be sufficient.
        long[] aSquared = new long[a.length];
        for (int i = 0; i < a.length; i++) {
            // Squaring a[i]
            aSquared[i] = (long)a[i] * a[i];
        }

        // 3. Convert 'b' to a long array for comparison consistency and sort it.
        long[] bLong = new long[b.length];
        for (int i = 0; i < b.length; i++) {
            bLong[i] = b[i];
        }
        Arrays.sort(bLong);

        // 4. Sort the squared array of 'a'.
        Arrays.sort(aSquared);

        // 5. Compare the two sorted arrays element by element.
        // If they are identical, they must contain the same elements (squares) with the same multiplicities.
        for (int i = 0; i < a.length; i++) {
            if (aSquared[i] != bLong[i]) {
                return false;
            }
        }

        // If the loop completes, all elements match.
        return true;
    }
}

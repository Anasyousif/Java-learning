import java.util.ArrayList;
import java.util.List;

public class Multiples {
    /**
     * Finds all multiples of 'base' up to and including 'limit'.
     *
     * @param base The number whose multiples are to be found (n > 0).
     * @param limit The maximum value for the multiples (limit >= base).
     * @return An array of integers containing the multiples.
     */
    public static int[] find(int base, int limit) {
        // We use a List (ArrayList) first because we don't know the exact number of multiples
        // in advance. We will convert this list to an int[] later.
        List<Integer> multiplesList = new ArrayList<>();

        // Start checking from the first multiple, which is the base itself.
        int currentMultiple = base;

        // Loop as long as the current multiple does not exceed the limit.
        while (currentMultiple <= limit) {
            // Add the current multiple to the list.
            multiplesList.add(currentMultiple);

            // Calculate the next multiple by adding the base value.
            currentMultiple += base;
        }

        // Convert the List<Integer> (which holds wrapper objects)
        // into a primitive int[] array as required by the function signature.
        int[] result = new int[multiplesList.size()];
        for (int i = 0; i < multiplesList.size(); i++) {
            result[i] = multiplesList.get(i);
        }

        return result;
    }
}

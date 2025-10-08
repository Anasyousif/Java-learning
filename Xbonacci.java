public class Xbonacci {
    public double[] tribonacci(double[] s, int n) {
        // If n is 0, return an empty array as specified.
        if (n == 0) {
            return new double[0];
        }

        // Use a List to easily build the sequence dynamically.
        java.util.List<Double> sequence = new java.util.ArrayList<>();

        // Add the initial signature elements to the sequence.
        // We only add up to 'n' elements from the signature if n < 3.
        for (int i = 0; i < Math.min(3, n); i++) {
            sequence.add(s[i]);
        }

        // If n is less than or equal to 3, we only return the 
        // elements already added from the signature.
        if (n <= 3) {
            return sequence.stream().mapToDouble(Double::doubleValue).toArray();
        }

        // Generate the remaining elements
        for (int i = 3; i < n; i++) {
            // The next element is the sum of the last three.
            double next = sequence.get(i - 1) + sequence.get(i - 2) + sequence.get(i - 3);
            sequence.add(next);
        }

        // Convert the List<Double> to a double[] and return it.
        return sequence.stream().mapToDouble(Double::doubleValue).toArray();
    }
}

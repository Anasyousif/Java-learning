class Diamond {

    public static String print(int n) {
        // 1. Check for invalid input
        if (n <= 0 || n % 2 == 0) {
            return null;
        }

        StringBuilder diamond = new StringBuilder();
        int half = n / 2; // For n=5, half=2. For n=3, half=1.

        // --- Upper Half (including the widest row) ---
        // 'i' goes from 0 up to 'half'.
        for (int i = 0; i <= half; i++) {
            // Number of asterisks: 1, 3, 5, ...
            // This is (2 * i) + 1
            int asterisks = (2 * i) + 1;

            // Number of spaces before the asterisks: (n - asterisks) / 2
            // Since n = (2 * half) + 1, this simplifies to 'half - i'
            int spaces = half - i;

            // Append leading spaces
            diamond.append(" ".repeat(spaces));

            // Append asterisks
            diamond.append("*".repeat(asterisks));

            // Append a newline character
            diamond.append("\n");
        }

        // --- Lower Half (excluding the widest row) ---
        // 'i' goes from 'half - 1' down to 0, which mirrors the upper half.
        for (int i = half - 1; i >= 0; i--) {
            // The logic for spaces and asterisks is the same as the upper half.
            int asterisks = (2 * i) + 1;
            int spaces = half - i;

            // Append leading spaces
            diamond.append(" ".repeat(spaces));

            // Append asterisks
            diamond.append("*".repeat(asterisks));

            // Append a newline character
            diamond.append("\n");
        }

        // The problem statement says "Trailing spaces should be removed", but
        // since we only add leading spaces and then asterisks, there are no
        // trailing spaces to remove before the newline.

        return diamond.toString();
    }
}
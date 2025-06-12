public class Runes {

    public static int solveExpression(final String expression) {
        for (int digit = 0; digit <= 9; digit++) {
            char replacement = (char) ('0' + digit);

            if (expression.indexOf(replacement) != -1) {
                continue; // Skip if digit already exists in the expression
            }

            String replacedExpr = expression.replace('?', replacement);

            // Split into left and right of '='
            String[] parts = replacedExpr.split("=");

            if (parts.length != 2) continue;

            String left = parts[0];
            String right = parts[1];

            // Determine the operator position
            int opPos = Math.max(left.indexOf('+'), Math.max(left.indexOf('-'), left.indexOf('*')));
            if (opPos <= 0) continue; // Invalid operator position

            String part1 = left.substring(0, opPos);
            String part2 = left.substring(opPos + 1);
            char operator = left.charAt(opPos);

            // Skip any part that has leading zeros (e.g. "023", "-045")
            if (hasInvalidLeadingZero(part1) || hasInvalidLeadingZero(part2) || hasInvalidLeadingZero(right)) {
                continue;
            }

            try {
                int num1 = Integer.parseInt(part1);
                int num2 = Integer.parseInt(part2);
                int result = Integer.parseInt(right);
                boolean valid = false;

                switch (operator) {
                    case '+': valid = (num1 + num2 == result); break;
                    case '-': valid = (num1 - num2 == result); break;
                    case '*': valid = (num1 * num2 == result); break;
                }

                if (valid) {
                    return digit;
                }
            } catch (NumberFormatException e) {
                // Skip invalid parse
            }
        }

        return -1;
    }

    private static boolean hasInvalidLeadingZero(String s) {
        if (s.equals("0") || s.equals("-0")) return false;

        if (s.startsWith("-")) {
            s = s.substring(1);
        }

        return s.length() > 1 && s.startsWith("0");
    }
}

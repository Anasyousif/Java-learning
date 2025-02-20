class SqueakyClean {
    static String clean(String identifier) {
        StringBuilder cleaned = new StringBuilder();
        boolean capitalizeNext = false;

        for (int i = 0; i < identifier.length(); i++) {
            char currentChar = identifier.charAt(i);

            if (Character.isWhitespace(currentChar)) {
                cleaned.append('_'); // Replace spaces with underscore
            } else if (currentChar == '-') {
                capitalizeNext = true; // Convert next character to uppercase
            } else if (Character.isLetterOrDigit(currentChar)) { 
                // Convert leetspeak characters
                currentChar = convertLeetSpeak(currentChar);

                if (capitalizeNext) {
                    cleaned.append(Character.toUpperCase(currentChar));
                    capitalizeNext = false;
                } else {
                    cleaned.append(currentChar);
                }
            } 
            // Ignore non-alphanumeric characters
        }

        return cleaned.toString();
    }

    // Helper method to convert leetspeak characters
    private static char convertLeetSpeak(char ch) {
        return switch (ch) {
            case '4' -> 'a';
            case '3' -> 'e';
            case '0' -> 'o';
            case '1' -> 'l';
            case '7' -> 't';
            default -> ch;
        };
    }
}

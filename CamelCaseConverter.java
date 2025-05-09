public class CamelCaseConverter {
    public static String toCamelCase(String input) {
        if (input == null || input.isEmpty()) return input;

        // Split the string by dash or underscore using regex
        String[] parts = input.split("[-_]");
        StringBuilder camelCaseString = new StringBuilder();

        // Append the first word as-is
        camelCaseString.append(parts[0]);

        // Capitalize the first letter of each subsequent word
        for (int i = 1; i < parts.length; i++) {
            if (!parts[i].isEmpty()) {
                camelCaseString.append(parts[i].substring(0, 1).toUpperCase());
                camelCaseString.append(parts[i].substring(1));
            }
        }

        return camelCaseString.toString();
    }

    public static void main(String[] args) {
        System.out.println(toCamelCase("the-stealth-warrior")); // theStealthWarrior
        System.out.println(toCamelCase("The_Stealth_Warrior")); // TheStealthWarrior
        System.out.println(toCamelCase("The_Stealth-Warrior")); // TheStealthWarrior
    }
}

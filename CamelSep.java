public class CamelSep {
    public static String camelCase(String input) {
    if (input == null || input.isEmpty()) {
      return input;
    }
    return input.replaceAll("([A-Z])", " $0");
  }
}

public class StringChar {
    public static String camelCase(String input) {
    StringBuilder result = new StringBuilder();

    for (char c : input.toCharArray()) {
      if (Character.isUpperCase(c)) {
        result.append(" ");
      }
      result.append(c);
    }
    
    return result.toString();
  }
}

import java.util.Comparator;
import java.util.Arrays;

public class Order {
     public static String order(String words) {
    if (words == null || words.isEmpty()) {
      return "";
    }
    String[] wordsArray = words.split(" ");
    Arrays.sort(wordsArray, new Comparator<String>() {
      @Override
      public int compare(String a, String b) {
        int numA = Integer.parseInt(a.replaceAll("[^0-9]", ""));
        int numB = Integer.parseInt(b.replaceAll("[^0-9]", ""));
        return Integer.compare(numA, numB);
      }
    });
    return String.join(" ", wordsArray);
  }
}

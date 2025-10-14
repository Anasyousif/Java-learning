import java.util.List;

public class SmileFaces {
  public static int countSmileys(List<String> arr) {
    int count = 0;
    for (String face : arr) {
      if (face.matches("[:;][-~]?[)D]")) {
        count++;
      }
    }
    return count;
  }
}
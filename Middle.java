public class Middle {
    public static String getMiddle(String word) {
    int length = word.length();
    int middle = length / 2;
    if (length % 2 == 1) {
  
      return Character.toString(word.charAt(middle));
    } else {
     
      return word.substring(middle - 1, middle + 1);
    }
  }
}

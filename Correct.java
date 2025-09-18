public class Correct {
  public static String correct(String string) {
    // Replace '5' with 'S'
    string = string.replaceAll("5", "S");
    // Replace '0' with 'O'
    string = string.replaceAll("0", "O");
    // Replace '1' with 'I'
    string = string.replaceAll("1", "I");
    return string;
  }
}
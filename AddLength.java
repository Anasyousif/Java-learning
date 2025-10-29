public class AddLength {
    public static String[] addLength(String str) {
    // 1. Split the input string by spaces to get an array of words.
    String[] words = str.split(" ");
    
    // 2. Create a new String array to store the results.
    // Its size will be the same as the number of words.
    String[] result = new String[words.length];
    
    // 3. Iterate through the array of words.
    for (int i = 0; i < words.length; i++) {
      String word = words[i];
      // 4. Calculate the length of the current word.
      int length = word.length();
      
      // 5. Concatenate the word, a space, and its length, 
      // then store it in the result array.
      // String.valueOf(length) converts the integer length to a string.
      result[i] = word + " " + String.valueOf(length);
    }
    
    // 6. Return the final array.
    return result;
  }
}

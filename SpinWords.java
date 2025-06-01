public class SpinWords {

  public String spinWords(String sentence) {
    // Split the sentence into individual words
    String[] words = sentence.split(" ");
    
    // Use a StringBuilder to build the final result
    StringBuilder result = new StringBuilder();

    // Loop through each word
    for (int i = 0; i < words.length; i++) {
      String word = words[i];
      
      // Reverse the word if it's 5 or more letters long
      if (word.length() >= 5) {
        result.append(new StringBuilder(word).reverse());
      } else {
        result.append(word);
      }

      // Add a space if it's not the last word
      if (i < words.length - 1) {
        result.append(" ");
      }
    }

    return result.toString();
  }
}

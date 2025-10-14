public class Riot12 {
    public static String rot13(String str) {
    // A StringBuilder is used for efficient manipulation of the resulting string.
    StringBuilder result = new StringBuilder();

    // Iterate through each character in the input string.
    for (char character : str.toCharArray()) {
      // Check if the character is a letter (either uppercase or lowercase).
      if (character >= 'a' && character <= 'z') {
        // Lowercase letters: Shift by 13, wrap around using the modulo operation on the alphabet size (26).
        // (character - 'a') gives the 0-indexed position (0 for 'a', 25 for 'z').
        // We add 13, take modulo 26, and then add 'a' back to get the new character.
        char shifted = (char) (((character - 'a' + 13) % 26) + 'a');
        result.append(shifted);
      } else if (character >= 'A' && character <= 'Z') {
        // Uppercase letters: Apply the same logic as lowercase, but use 'A' as the base.
        char shifted = (char) (((character - 'A' + 13) % 26) + 'A');
        result.append(shifted);
      } else {
        // If the character is not a letter (e.g., number, space, symbol), append it unchanged.
        result.append(character);
      }
    }

    return result.toString();
  }
}

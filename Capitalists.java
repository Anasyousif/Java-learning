public class Capitalists {
    public static int[] capitals(String s) {
    // 1. Initialize a dynamic list to store the indices.
    List<Integer> capitalIndices = new ArrayList<>();

    // 2. Iterate over the string character by character.
    for (int i = 0; i < s.length(); i++) {
      char c = s.charAt(i);

      // 3. Check if the character is an uppercase letter.
      if (Character.isUpperCase(c)) {
        // 4. If it is uppercase, add its current index to the list.
        capitalIndices.add(i);
      }
    }

    // 5. Convert the List<Integer> to the required int[] array.
    // The size of the array is the total number of capital letters found.
    int[] result = new int[capitalIndices.size()];
    for (int i = 0; i < capitalIndices.size(); i++) {
      result[i] = capitalIndices.get(i);
    }

    return result;
  }
}

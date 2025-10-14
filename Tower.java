public class Tower {

  public static String[] towerBuilder(int nFloors)
  {
    // The bottom floor determines the maximum width.
    // Width = 1 + 2 * (nFloors - 1) = 2 * nFloors - 1
    final int maxWidth = 2 * nFloors - 1;

    String[] tower = new String[nFloors];

    // Iterate through each floor, from floor 0 (top) to nFloors - 1 (bottom)
    for (int i = 0; i < nFloors; i++) {
      
      // Calculate the number of stars for the current floor (always an odd number: 1, 3, 5, ...)
      // Formula: 2 * currentFloorIndex + 1
      int numStars = 2 * i + 1;
      
      // Calculate the number of spaces needed on *one side* to center the stars.
      // Total spaces = maxWidth - numStars
      // Spaces per side = (Total spaces) / 2
      int numSpaces = (maxWidth - numStars) / 2;
      

      String spaces = " ".repeat(numSpaces);
      String stars = "*".repeat(numStars);
      
   
      tower[i] = spaces + stars + spaces;
    }

    return tower;
  }
}

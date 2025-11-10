public class ArrayMultiplication {
    public static int [][] multiplicationTable(int n){
    // 1. Check for a valid size 'n'
    if (n <= 0) {
      // Return an empty array for non-positive input as a sensible default
      return new int[0][0]; 
    }
    
    // 2. Initialize the N x N 2D array
    int[][] table = new int[n][n];

    // 3. Populate the array using nested loops
    // Outer loop for the rows (i)
    for (int i = 0; i < n; i++) {
      // Inner loop for the columns (j)
      for (int j = 0; j < n; j++) {
        // The value at table[i][j] is the product of (i+1) and (j+1)
        // because the table indices are 0-based, but the multiplication 
        // factors start at 1.
        table[i][j] = (i + 1) * (j + 1);
      }
    }
    
    // 4. Return the completed table
    return table;
  }
}

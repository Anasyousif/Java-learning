public class Matrix {
    
    // Method to calculate the determinant of a matrix
    public static int determinant(int[][] matrix) {
        int n = matrix.length;

        // Base case: If the matrix is 1x1, return the only element
        if (n == 1) {
            return matrix[0][0];
        }

        // Base case: If the matrix is 2x2, return the determinant using the formula ad - bc
        if (n == 2) {
            return matrix[0][0] * matrix[1][1] - matrix[0][1] * matrix[1][0];
        }

        // Recursive case: Cofactor expansion
        int det = 0;
        for (int j = 0; j < n; j++) {
            // Get the cofactor matrix by removing the first row and column j
            int[][] minor = getMinor(matrix, 0, j);
            
            // Use cofactor expansion to calculate the determinant
            det += (int) Math.pow(-1, j) * matrix[0][j] * determinant(minor);
        }

        return det;
    }

    // Method to get the minor of a matrix after removing the specified row and column
    private static int[][] getMinor(int[][] matrix, int row, int col) {
        int n = matrix.length;
        int[][] minor = new int[n - 1][n - 1];
        int r = 0;
        
        // Loop through the matrix and create the minor
        for (int i = 0; i < n; i++) {
            if (i == row) continue; // Skip the row to remove
            int c = 0;
            for (int j = 0; j < n; j++) {
                if (j == col) continue; // Skip the column to remove
                minor[r][c++] = matrix[i][j];
            }
            r++;
        }
        
        return minor;
    }

    public static void main(String[] args) {
        // Example usage
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        System.out.println("Determinant: " + determinant(matrix));  // Output: 0
    }
}
public class Matrix {
    
    // Method to calculate the determinant of a matrix
    public static int determinant(int[][] matrix) {
        int n = matrix.length;

        // Base case: If the matrix is 1x1, return the only element
        if (n == 1) {
            return matrix[0][0];
        }

        // Base case: If the matrix is 2x2, return the determinant using the formula ad - bc
        if (n == 2) {
            return matrix[0][0] * matrix[1][1] - matrix[0][1] * matrix[1][0];
        }

        // Recursive case: Cofactor expansion
        int det = 0;
        for (int j = 0; j < n; j++) {
            // Get the cofactor matrix by removing the first row and column j
            int[][] minor = getMinor(matrix, 0, j);
            
            // Use cofactor expansion to calculate the determinant
            det += (int) Math.pow(-1, j) * matrix[0][j] * determinant(minor);
        }

        return det;
    }

    // Method to get the minor of a matrix after removing the specified row and column
    private static int[][] getMinor(int[][] matrix, int row, int col) {
        int n = matrix.length;
        int[][] minor = new int[n - 1][n - 1];
        int r = 0;
        
        // Loop through the matrix and create the minor
        for (int i = 0; i < n; i++) {
            if (i == row) continue; // Skip the row to remove
            int c = 0;
            for (int j = 0; j < n; j++) {
                if (j == col) continue; // Skip the column to remove
                minor[r][c++] = matrix[i][j];
            }
            r++;
        }
        
        return minor;
    }

    public static void main(String[] args) {
        // Example usage
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        System.out.println("Determinant: " + determinant(matrix));  // Output: 0
    }
}

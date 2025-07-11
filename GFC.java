// Java Program to Sorting a 2D Array 
// according to values in any given column 
import java.io.*;
import java.util.*;

class GFG {
    public static void sortbyColumn(int a[][], int c){      
      Arrays.sort(a, (x, y) -> Integer.compare(x[c],y[c]));  
    }
  
    public static void main(String args[])
    {
        int m[][] = { { 39, 27, 11, 42 },
                     { 10, 93, 91, 90 },
                     { 54, 78, 56, 89 },
                     { 24, 64, 20, 65 } };
       
      	// Sort this matrix by 3rd Column
      	int c = 3;
      
        sortbyColumn(m, c - 1);
  
        // Display the sorted Matrix
        for (int i = 0; i < m.length; i++) {
          
            for (int j = 0; j < m[i].length; j++)
                System.out.print(m[i][j] + " ");
          
            System.out.println();
            
        }
    }
}
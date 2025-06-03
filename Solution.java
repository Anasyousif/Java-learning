public class Solution {
    public static int zeros(int n) {
        int count = 0;
        
        // Divide n by powers of 5 (i.e., 5, 25, 125, ...)
        while (n >= 5) {
            n /= 5;  // integer division
            count += n;
        }
        
        return count;
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(zeros(6));   // Output: 1
        System.out.println(zeros(12));  // Output: 2
        System.out.println(zeros(100)); // Output: 24
    }
}

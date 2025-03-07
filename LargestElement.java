public class LargestElement {
    public static int findLargest(int[] arr) {
        int max = arr[0]; // Assume first element is the largest
        
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i]; // Update max if a larger value is found
            }
        }
        
        return max;
    }

    public static void main(String[] args) {
        int[] numbers = {10, 25, 56, 89, 12}; // Example array
        System.out.println("Largest element: " + findLargest(numbers));
    }
}


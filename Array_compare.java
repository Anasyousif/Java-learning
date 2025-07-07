public class Array_compare {
    public static void main(String[] args) {

        // Declare and initialize an integer array with the values 45, 22, 89, 16, 90, and 33
        int[] numbers = {45, 22, 89, 16, 90, 33};

        // Initialize min and max with the first element
        int smallest = numbers[0]; // Initialize with the first element of the array
        int largest = numbers[0];  // Initialize with the first element of the array

        // Use an enhanced for loop to find min and max
        for (int n : numbers) {
            if (n < smallest) { // If current number is smaller than current 'smallest'
                smallest = n;    // Update 'smallest'
            }
            if (n > largest) {  // If current number is larger than current 'largest'
                largest = n;     // Update 'largest'
            }
        }

        // Print the smallest and largest numbers
        System.out.println("Smallest: " + smallest);
        System.out.println("Largest: " + largest);
    }
}

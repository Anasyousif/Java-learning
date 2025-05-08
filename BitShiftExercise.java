public class BitShiftExercise {
    public static void main(String[] args) {
        int num = 8; // Binary: 1000
        System.out.println("Original number: " + num);

        // Left shift
        int leftShift = num << 1; // Should be 16
        System.out.println("After left shift: " + leftShift);

        // Right shift
        int rightShift = num >> 1; // Should be 4
        System.out.println("After right shift: " + rightShift);
    }
}


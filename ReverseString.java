public class ReverseString {
    public static String reverse(String input) {
        // Using StringBuilder for efficient reverse
        StringBuilder sb = new StringBuilder(input);
        return sb.reverse().toString();
    }
    
    public static void main(String[] args) {
        String input = "hello";
        System.out.println("Reversed: " + reverse(input)); // Output: "olleh"
    }
    
}

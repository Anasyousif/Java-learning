public class Message {
     public static String greet(String name, String owner) {
        // Use the .equals() method to compare the content of the two String objects.
        // The == operator checks if the two variables refer to the same object in memory,
        // which is not what we want here.
        if (name.equals(owner)) {
            return "Hello boss";
        } else {
            return "Hello guest";
        }
}

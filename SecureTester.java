public class SecureTester {

    public static boolean alphanumeric(String s) {
        // Check that the string is not empty and matches the allowed pattern
        return !s.isEmpty() && s.matches("[A-Za-z0-9]+");
    }

}

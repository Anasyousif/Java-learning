public class IsUpper {
    public static boolean isUpperCase(String s) {
        // The most straightforward way is to compare the original string 
        // to its uppercase version. If they are the same, it was all uppercase.
        return s.equals(s.toUpperCase());
    }
}

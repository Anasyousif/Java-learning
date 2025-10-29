public class element {
    public static boolean check(Object[] a, Object x) {
        // Iterate through each element in the array 'a'
        for (Object element : a) {
        
            if (element != null && element.equals(x)) {
                return true; // The value is found
            }
          
            if (x == element) { 
                return true;
            }
            if (x != null && x.equals(element)) { 
                return true;
            }
        }
        
        // If the loop completes without finding the value
        return false;
    }
}

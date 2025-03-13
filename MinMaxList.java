import java.util.*;

public class MinMaxList {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 2, 9, 1, 7, 6);
        
        int max = Collections.max(numbers);
        int min = Collections.min(numbers);
        
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
    }
}

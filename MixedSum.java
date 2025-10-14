import java.util.List;

public class MixedSum {
    
    /*
     * Assume input will be only of Integer or String type
     */
    public int sum(List<?> mixed) {
        int totalSum = 0;
        for (Object item : mixed) {
            if (item instanceof Integer) {
                // If the item is already an Integer, add its value
                totalSum += (Integer) item;
            } else if (item instanceof String) {
                try {
                    // If the item is a String, parse it as an Integer and add its value
                    totalSum += Integer.parseInt((String) item);
                } catch (NumberFormatException e) {
                    // Handle the case where the string might not be a valid integer,
                    // though the problem implies valid integer strings.
                    // For robustness, we could skip it or throw an error.
                    // Skipping it for this specific problem context.
                }
            }
        }
        return totalSum;
    }
    
}

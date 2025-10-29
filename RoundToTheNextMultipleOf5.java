public class RoundToTheNextMultipleOf5 {
    public static int roundToNext5(int number) {
    // This formula works for both positive and negative numbers by using the 
    // ceiling function to always go to the next *greater or equal* multiple of 5.
    return 5 * (int) Math.ceil((double) number / 5);
  }
    
}

/**
 * This class provides a function to calculate the total number of milliseconds
 * that have passed since midnight, given the current hours, minutes, and seconds.
 */
public class TimeCalculator {

    /**
     * Calculates the total time in milliseconds since midnight.
     *
     * @param h The hours (0-23)
     * @param m The minutes (0-59)
     * @param s The seconds (0-59)
     * @return The total time in milliseconds since midnight.
     */
    public static long timeSinceMidnight(int h, int m, int s) {
        // We use 'long' to ensure the result can hold large values without overflow,
        // although an 'int' would be sufficient for this specific case.

        // Convert hours to milliseconds
        long hoursInMs = (long) h * 60 * 60 * 1000;

        // Convert minutes to milliseconds
        long minutesInMs = (long) m * 60 * 1000;

        // Convert seconds to milliseconds
        long secondsInMs = (long) s * 1000;

        // Sum up all the milliseconds
        return hoursInMs + minutesInMs + secondsInMs;
    }

    /**
     * The main method to demonstrate the usage of the timeSinceMidnight function.
     * It also verifies the example provided in the prompt.
     */
    public static void main(String[] args) {
        // Example from the prompt
        int h = 0;
        int m = 1;
        int s = 1;
        long result = timeSinceMidnight(h, m, s);

        // Print the result to the console
        System.out.println("Hours: " + h + ", Minutes: " + m + ", Seconds: " + s);
        System.out.println("Time since midnight in milliseconds: " + result);

        // Another example for a full day
        int h2 = 23;
        int m2 = 59;
        int s2 = 59;
        long result2 = timeSinceMidnight(h2, m2, s2);
        System.out.println("\nHours: " + h2 + ", Minutes: " + m2 + ", Seconds: " + s2);
        System.out.println("Time since midnight in milliseconds: " + result2);
    }
}

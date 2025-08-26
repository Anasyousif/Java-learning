public class BouncingBall {
    public static int bouncingBall(double h, double bounce, double window) {
        if (h <= 0 || bounce <= 0 || bounce >= 1 || window >= h) {
            return -1;
        }

        int count = 1; // Initial drop
        h *= bounce;

        while (h > window) {
            count += 2; // Pass on the way up and on the way down
            h *= bounce;
        }

        return count;
    }
}
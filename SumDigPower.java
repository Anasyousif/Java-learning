import java.util.ArrayList;
import java.util.List;

class SumDigPower {
    public static List<Long> sumDigPow(long a, long b) {
        List<Long> eurekaNumbers = new ArrayList<>();
        for (long i = a; i <= b; i++) {
            if (isEureka(i)) {
                eurekaNumbers.add(i);
            }
        }
        return eurekaNumbers;
    }

    private static boolean isEureka(long n) {
        if (n < 10) {
            return true; // Single-digit numbers are Eureka numbers
        }

        long originalNumber = n;
        long sum = 0;
        int power = 1;
        String s = String.valueOf(n);

        for (char digitChar : s.toCharArray()) {
            int digit = Character.getNumericValue(digitChar);
            sum += Math.pow(digit, power);
            power++;
        }

        return sum == originalNumber;
    }
}
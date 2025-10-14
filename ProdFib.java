public class ProdFib {
    public static long[] productFib(long prod) {
        long a = 0;
        long b = 1;
        while (a * b < prod) {
            long temp = b;
            b = a + b;
            a = temp;
        }

        if (a * b == prod) {
            return new long[]{a, b, 1}; // 1 for true
        } else {
            return new long[]{a, b, 0}; // 0 for false
        }
    }
}
public class BuildAPileOfCubes {
    public static long findNb(long m) {
        long n = 0;
        long total = 0;
        
        while (total < m) {
            n++;
            total += n * n * n;
            if (total == m) {
                return n;
            }
        }
        
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(findNb(1071225));        // Output: 45
        System.out.println(findNb(91716553919377L)); // Output: -1
    }
}

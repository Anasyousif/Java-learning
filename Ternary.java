public class Main {
    public static void main(String[] args) {
        int x = 15, y = 25, z = 5;
        int smallest = (x < y) ? (x < z ? x : z) : (y < z ? y : z);
        System.out.println("Smallest value: " + smallest);
    }
}

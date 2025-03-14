import java.util.Random;

public class RandomExample {
    public static void main(String[] args) {
        Random random = new Random();

        // Generate a random integer
        int randomInt = random.nextInt(100); // Random number between 0-99
        System.out.println("Random Integer: " + randomInt);

        // Generate a random double
        double randomDouble = random.nextDouble(); // Random number between 0.0-1.0
        System.out.println("Random Double: " + randomDouble);

        // Generate a random boolean
        boolean randomBoolean = random.nextBoolean();
        System.out.println("Random Boolean: " + randomBoolean);
    }
}

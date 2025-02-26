import java.util.Optional;
import java.util.Objects;

public class User {
    private String name;
    private String email;

    // Constructor
    public User(String name, String email) {
        this.name = Objects.requireNonNull(name, "Name cannot be null");
        this.email = email; // Email can be null, handled via Optional
    }

    // Getter using Optional to avoid null issues
    public Optional<String> getEmail() {
        return Optional.ofNullable(email);
    }

    // Setter with validation
    public void setEmail(String email) {
        this.email = email;
    }

    // Method to send a welcome email safely
    public void sendWelcomeEmail() {
        getEmail().ifPresentOrElse(
            email -> System.out.println("Sending welcome email to: " + email.toLowerCase()),
            () -> System.out.println("No email provided, cannot send welcome email")
        );
    }

    public static void main(String[] args) {
        User user1 = new User("Alice", "alice@example.com");
        User user2 = new User("Bob", null); // No email

        user1.sendWelcomeEmail(); // Sends email
        user2.sendWelcomeEmail(); // Handles missing email gracefully
    }
}


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeExample {
    public static void main(String[] args) {
        String dateStr = "2025-06-23 15:30";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        
        // Parse string to LocalDateTime
        LocalDateTime dateTime = LocalDateTime.parse(dateStr, formatter);
        System.out.println("Parsed DateTime: " + dateTime);
        
        // Format LocalDateTime to string
        String formatted = dateTime.format(formatter);
        System.out.println("Formatted DateTime: " + formatted);
    }
}

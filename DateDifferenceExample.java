import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DateDifferenceExample {
    public static void main(String[] args) {
        LocalDate date1 = LocalDate.of(2024, 3, 1);
        LocalDate date2 = LocalDate.of(2025, 3, 1);

        long daysBetween = ChronoUnit.DAYS.between(date1, date2);
        System.out.println("Days between: " + daysBetween);
    }
}

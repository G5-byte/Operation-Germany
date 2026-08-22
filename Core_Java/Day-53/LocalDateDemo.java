import java.time.LocalDate;

public class LocalDateDemo {

    public static void main(String[] args) {

        LocalDate today = LocalDate.now();

        System.out.println("Today: " + today);

        System.out.println("Year: " + today.getYear());
        System.out.println("Month: " + today.getMonth());
        System.out.println("Day: " + today.getDayOfMonth());

        System.out.println("Tomorrow: " + today.plusDays(1));
        System.out.println("Next month: " + today.plusMonths(1));
    }
}
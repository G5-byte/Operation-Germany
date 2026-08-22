import java.time.LocalTime;

public class LocalTimeDemo {

    public static void main(String[] args) {

        LocalTime now = LocalTime.now();

        System.out.println("Current time: " + now);

        System.out.println("Hour: " + now.getHour());
        System.out.println("Minute: " + now.getMinute());
        System.out.println("Second: " + now.getSecond());
    }
}

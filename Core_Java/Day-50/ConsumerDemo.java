import java.util.function.Consumer;
import java.util.ArrayList;
public class ConsumerDemo {
    public static void main(String[] args) {
        
        Consumer<String> names = name -> System.out.println("Hello " + name);

        names.accept("Nikhil");
        names.accept("Praduem");

        System.out.println();

        ArrayList<String> list = new ArrayList<>();

        list.add("springboot");
        list.add("hibernate");
        list.add("quarkus");

        Consumer<String> printUpper = item -> System.out.println(item.toUpperCase());
        Consumer<String> printLength = item -> System.out.println(item.length());
        list.forEach(printUpper);
        System.out.println();
        list.forEach(printLength);

        System.out.println();

        Consumer<String> combinedConsumer = printUpper.andThen(printLength);
        list.forEach(combinedConsumer);
    }
    
}

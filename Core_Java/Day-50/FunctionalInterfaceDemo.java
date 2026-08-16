import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FunctionalInterfaceDemo {

    public static void main(String[] args) {

        Predicate<Integer> isEven =
                number -> number % 2 == 0;

        Consumer<Integer> print =
                number -> System.out.println("Number: " + number);

        Function<Integer, Integer> square =
                number -> number * number;

        Supplier<String> message =
                () -> "Java 8 Functional Programming";

        System.out.println("Is 20 even? " + isEven.test(20));

        print.accept(20);

        System.out.println("Square: " + square.apply(20));

        System.out.println(message.get());
    }
}
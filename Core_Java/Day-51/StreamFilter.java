import java.util.List;
import java.util.Arrays;
import java.util.stream.Stream;

public class StreamFilter {
    public static void main(String[] args) {
        
        List<Integer> numbers = Arrays.asList(10, 15, 20, 25, 30, 35);

        Stream<Integer> result = numbers.stream().filter(number -> number % 2 == 0);

        result.forEach(System.out::println);

    }
    
}

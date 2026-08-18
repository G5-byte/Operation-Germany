import java.util.List;
import java.util.Arrays;

public class StreamMap {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        numbers.stream()
                       .map(n -> n * n)
                       .forEach(System.out::println);

     System.out.println();   

       List<String> list = Arrays.asList("apple", "banana", "cherry");
       
       list.stream()
                   .map(String::toUpperCase)
                   .forEach(System.out::println);
                   
    }
    
}

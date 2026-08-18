import java.util.List;
import java.util.Arrays;

public class StreamSort {
    public static void main(String[] args) {

        List<Integer> IntList = Arrays.asList(5, 3, 8, 1, 9, 2);
        
        IntList.stream()
               .sorted()
               .limit(5)
               .map(n -> n * 2)
               .forEach(System.out::println);
    }
    
}

import java.util.List;
import java.util.Arrays;

public class StreamFilterMap {
    public static void main(String[] args) {
        
        List<Integer> numList = Arrays.asList(10, 15, 20, 25, 30, 35);

        numList.stream()
               .filter(n -> n > 20)
               .map(n -> n * 2)
               .forEach(System.out::println);
    }
    
}

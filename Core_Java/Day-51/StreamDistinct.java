import java.util.List;
import java.util.Arrays;


public class StreamDistinct {
    public static void main(String[] args) {
        
        List<Integer> numList = Arrays.asList(10, 20, 10, 30, 20, 40, 30);

        numList.stream()
               .distinct()
               .forEach(System.out::println);
    }
    
}

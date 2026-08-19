import java.util.List;
import java.util.Arrays;

public class StreamCount {
    public static void main(String[] args) {
        
        List<Integer> numbers = Arrays.asList(10, 20, 25, 30, 35, 40, 50);
        
        long count = numbers.stream()
                    .filter(n -> n > 25)
                    .count();
        System.out.println(count);
    }
    
}

import java.util.List;
import java.util.Arrays;

public class StreamReduce {
    public static void main(String[] args) {
        
        List<Integer> numList = Arrays.asList(10, 20, 30, 40);

        System.out.println(numList.stream()
               .reduce(0, Integer::sum));
    }
    
}

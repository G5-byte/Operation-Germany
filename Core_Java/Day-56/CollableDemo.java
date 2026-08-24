import java.util.concurrent.Callable;

public class CollableDemo {
    public static void main(String[] args) throws Exception {
        
        Callable<Integer> task = () -> {
            return 10 + 10;
        };

        int result = task.call();

        System.out.println("Result -> " + result);
    }
}

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;

public class FutureDemo {
    public static void main(String[] args)throws Exception {
        
        ExecutorService executor = Executors.newSingleThreadExecutor();

        Callable<Integer> task = () -> {

            Thread.sleep(1000);
            return 100;
        };

        Future<Integer> future = executor.submit(task);

        System.out.println("Task Submitted!");

        int result = future.get();

        System.out.println("Result -> " + result);

        executor.shutdown();

    }
}

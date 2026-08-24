import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadDemo {
    public static void main(String[] args) {
        
        ExecutorService executor = Executors.newFixedThreadPool(3);

        for(int i=0; i<=5; i++) {

            int taskNumber = i;

            executor.execute(() -> {
                System.out.println("Task " + taskNumber + " running on " + Thread.currentThread().getName());});
        }

        executor.shutdown();
    }
}

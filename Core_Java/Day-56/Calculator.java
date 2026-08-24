import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;

public class Calculator {
    public static void main(String[] args)throws Exception {

        ExecutorService executor = Executors.newSingleThreadExecutor();

        Callable<Integer> task1 = () -> {

            Thread.sleep(1000);
            return 10 + 20;
        };

        Callable<Integer> task2 = () -> {

            Thread.sleep(1000);
            return 50 * 2;
        };

        Callable<Integer> task3 = () -> {

            Thread.sleep(1000);
            return 100/4;
        };

        Future<Integer> future1 = executor.submit(task1);
        Future<Integer> future2 = executor.submit(task2);
        Future<Integer> future3 = executor.submit(task3);

        System.out.println("All tasks are Submitted!");

        System.out.println("Task1 result -> " + future1.get());
        System.out.println("Task2 result -> " + future2.get());
        System.out.println("Task3 result -> " + future3.get());

        executor.shutdown();
        
    }
}

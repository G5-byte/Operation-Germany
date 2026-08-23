public class ThreadNames {
    public static void main(String[] args) {
        
        Thread t1 = new Thread(() -> {

            System.out.println("Running Thread : " + Thread.currentThread().getName());
        });

        t1.setName("Worker-Thread");

        t1.start();

        System.out.println("Main Thread : " + Thread.currentThread().getName());
    }
    
}

class Mytask implements Runnable {

    @Override
    public void run() {
        System.out.println("Runnable task is running");
    }
}

class RunnableDemo {
    public static void main(String[] args) {
        
        Thread t1 = new Thread(new Mytask());
        t1.start();
    }
}

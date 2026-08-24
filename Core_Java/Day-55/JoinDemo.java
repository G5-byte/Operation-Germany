class Worker extends Thread {

    @Override
    public void run() {

        for(int i=0; i<=5; i++) {
            System.out.println("Worker : " + i);

            try {
                Thread.sleep(500);
            }catch(InterruptedException e) {
                System.out.println("Thread Interrupted");
            }
        }
    }
}

class JoinDemo {
    public static void main(String[] args)
                  throws InterruptedException {
        
        Worker worker = new Worker();

        worker.start();
        worker.join();

        System.out.println("Worker thread finished....");
        System.out.println("Main thread Continues....");
    }
}

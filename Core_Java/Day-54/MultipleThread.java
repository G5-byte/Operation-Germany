class TaskOne extends Thread {

    @Override 
    public void run() {
        for(int i=0; i<=5; i++) {
            System.out.println("Task One : " + i);

            try {
                Thread.sleep(500);
            }catch(InterruptedException e) {
                System.out.println("Thread1 Interrupted!");
            }
        }
    }
}

class TaskTwo extends Thread {

    @Override
    public void run() {
        for(int i=0; i<=5; i++) {
            System.out.println("Task Two : " + i);

            try {
                Thread.sleep(500);
            }catch(InterruptedException e) {
                System.out.println("Thread2 Interrupted!");
            }
        }
    }
}

class MultipleThread {
    public static void main(String[] args) {
        
        TaskOne t1 = new TaskOne();
        t1.start();

        TaskTwo t2 = new TaskTwo();
        t2.start();
    }
}
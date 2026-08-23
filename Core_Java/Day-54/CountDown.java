class MyThread extends Thread  {

    @Override
    public void run() {

        for(int i=5; i>=0; i--) {
            System.out.println(i);

            try {
                Thread.sleep(1000);
            }catch(InterruptedException e) {
                System.out.println("Thread Interrupted!");
            }
        }

        System.out.println("GO!");
    }

}

class CountDown {
    public static void main(String[] args) {
        
        MyThread t1 = new MyThread();
        t1.start();
    }
}


class Account {

    private double balance = 100000;

    public synchronized void withdraw(double amount) {

        if(amount <= balance) {

            System.out.println(Thread.currentThread().getName() + "Withdrawing" + amount);

            balance -= amount;

            System.out.println("Remaining Balance : " + balance);
             
        }else {

            System.out.println(Thread.currentThread().getName() + ": Insufficient Balance");
        }

    }

    public double getBalance() {
        return balance;
    }
}

class BankAccount {
    public static void main(String[] args) throws InterruptedException {
        
        Account account = new Account();

        Thread t1 = new Thread(() -> account.withdraw(7000), "User-1 : ");

        Thread t2 = new Thread(() -> account.withdraw(7000), "User-2 : ");

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Final Balance : " + account.getBalance());

    }
}

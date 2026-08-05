public class BankAccount {

    public void accountType() {
        System.out.println("This is a General bank account");
    }
    
}

class SavingsAccount extends BankAccount {

    public void accountType() {
        System.out.println("This is a Savings bank account");
    }

    public static void main(String[] args) {
        SavingsAccount savingsAccount = new SavingsAccount();
        savingsAccount.accountType();

        BankAccount bankAccount = new BankAccount();
        bankAccount.accountType();
    }
}

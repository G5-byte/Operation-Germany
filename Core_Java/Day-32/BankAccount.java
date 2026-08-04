public class BankAccount {

    private String accountHolderName;
    private int accountNumber;

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void displayAccountInfo(){
        System.out.println("Account Holder Name : " + getAccountHolderName());
        System.out.println("Account Number : " + getAccountNumber());
    }

    public static void main(String[] args){

        BankAccount account1 = new BankAccount();
        account1.setAccountHolderName("John Doe");
        account1.setAccountNumber(123456);
        

        BankAccount account2 = new BankAccount();
        account2.setAccountHolderName("Jane Smith");
        account2.setAccountNumber(654321);

        account1.displayAccountInfo();
        System.out.println();
        account2.displayAccountInfo();
    }

    
}

public abstract class Payment1 {

    public abstract void paymentMethod(); // Abstract method (does not have a body)

    public void paymentDetails() {
        System.out.println("Payment details are provided");
    }
    
}

class CreditCardPayment1 extends Payment1 {

    public void paymentMethod() {
        System.out.println("This is a credit card payment method");
    }

}

class UPIpayment1 extends Payment1 {

    public void paymentMethod() {
        System.out.println("This is a UPI payment method");
    }

}

class Main1 {

    public static void main(String[] args) {
        Payment1 creditCardPayment = new CreditCardPayment1();
        creditCardPayment.paymentMethod();
        creditCardPayment.paymentDetails();

        Payment1 upiPayment = new UPIpayment1();
        upiPayment.paymentMethod();
        upiPayment.paymentDetails();
    }
}

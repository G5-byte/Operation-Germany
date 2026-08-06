class Payment {

    public void paymentMethod() {
        System.out.println("This is a general payment method");
    }
    
}

class CreditCardPayment extends Payment {

    public void paymentMethod() {
        System.out.println("This is a credit card payment method");
    }

}

class Main {

    public static void main(String[] args) {
        CreditCardPayment creditCardPayment = new CreditCardPayment();
        creditCardPayment.paymentMethod();

        Payment payment = new Payment();
        payment.paymentMethod();
    }
}

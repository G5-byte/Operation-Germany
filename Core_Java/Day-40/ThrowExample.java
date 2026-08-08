public class ThrowExample {
    public static void main(String[] args) {
        try {
            throw new Exception("This is a custom exception");
        } catch (Exception e) {
            System.out.println("Caught an exception: " + e.getMessage());
        }
    }

    int divide(int a, int b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        return a / b;
    }
    
}

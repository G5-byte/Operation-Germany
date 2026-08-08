public class TryCatchExample {
    public static void main(String[] args){
        try{
            int result = 10/0; // This will throw ArithmeticException
            System.out.println("Result: " + result);
        } catch(ArithmeticException e){
            System.out.println("Division by zero is not allowed.");
        }

        System.out.println("Program continues after the try-catch block.");

    }
    
}

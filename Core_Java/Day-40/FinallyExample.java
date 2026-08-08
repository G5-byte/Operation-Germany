public class FinallyExample {

    public static void main(String[] args) {
        try {
            int result = 10 / 2; // This will throw an ArithmeticException
            System.out.println("Result: " + result);
            int[] arr = new int[5];
            arr[10] = 50;
            System.out.println("Array element at index 2: " + arr[2]);
        } catch (ArithmeticException e) {
            System.out.println("Caught an exception: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index error: " + e.getMessage());
        } finally {
            System.out.println("This block is always executed.");
        }
    }
    
}

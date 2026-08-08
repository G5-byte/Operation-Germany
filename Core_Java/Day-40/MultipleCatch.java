public class MultipleCatch{
    public static void main(String[] args){

        try{
            int[] arr = new int[5];
            arr[10] = 50; // This will throw ArrayIndexOutOfBoundsException
            int a = 30;
            int b = 0;
            int res = a / b; // will throw ArithmeticException at runtime
            System.out.println("Result: " + res);

        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index error: " + e.getMessage());
        }
        catch (ArithmeticException e) {
            System.out.println("Arithmetic error: " + e.getMessage());
        }
        catch (Exception e) {
            System.out.println("General error: " + e.getMessage());
        }
    }
}
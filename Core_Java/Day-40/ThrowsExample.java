public class ThrowsExample {

    public void checkAge(int age) throws Exception {
        if (age < 0) {
            throw new Exception("Age cannot be negative");
        }

        System.out.println("Age is valid: " + age);
    }

    public static void main(String[] args) {
        ThrowsExample example = new ThrowsExample();

        try {
            example.checkAge(20);
        } catch (Exception e) {
            System.out.println("Caught an exception: " + e.getMessage());
        }
    }
    
}

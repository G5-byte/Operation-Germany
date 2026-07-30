public class UnaryOperators {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        System.out.println("a++ : " + (a++)); // Post-increment
        System.out.println("++b : " + (++b)); // Pre-increment
        System.out.println("a-- : " + (a--)); // Post-decrement
        System.out.println("--b : " + (--b)); // Pre-decrement
        System.out.println("Final value of a: " + a);
        System.out.println("Final value of b: " + b);
    }
}

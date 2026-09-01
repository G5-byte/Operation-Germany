public class RecursionBasics {
    
    public static void printNumbers(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);
        printNumbers(n - 1);
    }

    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void printNUmbers(int n) {
        if(n == 0) {
            return;
        }
        printNUmbers(n - 1);
        System.out.println(n);

    }

    public static int sumOfDigits(int n) {
        if(n == 0) {
            return 0;
        }
        return n % 10 + sumOfDigits(n / 10);
    }

    public static int sum(int n) {
        if(n == 0) {
            return 0;
        }
        return n + sum(n - 1);
    }

    public static int power(int x, int n) {
        if(n == 0) {
            return 1;
        }
        return x * power(x, n - 1);
    }

    public static void main(String[] args) {
        // Test the recursive methods

        // Numbers from 5 to 1
        System.out.println("Numbers from 5 to 1:");
        printNumbers(5); // Call the printNumbers method with n = 5
        System.out.println();

        // Factorial of 5
        System.out.println("Factorial of 5:");
        System.out.println(factorial(5)); // Call the factorial method with n = 5
        System.out.println();

        // Fibonacci of 5
        System.out.println("Fibonacci of 5:");
        System.out.println(fibonacci(5)); // Call the fibonacci method with n = 5
        System.out.println();

        // Numbers from 1 to 5
        System.out.println("Numbers from 1 to 5:");
        printNUmbers(5); // Call the printNUmbers method with n = 5
        System.out.println();

        // Sum of digits of 123
        System.out.println("Sum of digits of 123:");
        System.out.println(sumOfDigits(123)); // Call the sumOfDigits method with n = 123
        System.out.println();

        // Sum of numbers from 1 to 5
        System.out.println("Sum of numbers from 1 to 5:");
        System.out.println(sum(5)); // Call the sum method with n = 5
        System.out.println();

        // Power of 2 raised to the 5th power
        System.out.println("Power of 2 raised to the 5th power:");
        System.out.println(power(2, 5)); // Call the power method with x = 2 and n = 5
    }
}



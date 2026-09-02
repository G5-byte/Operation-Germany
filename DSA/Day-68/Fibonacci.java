class Fibonacci {

    public static int fibonacci(int n) {
        if(n <= 0) {
            return 0; 
        } else if(n == 1) {
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
    
    // Method to print Fibonacci series up to n
    public static void printFibonacciSeries(int n) {
        if(n <= 0) {
            return;
        } else if(n == 1) {
            System.out.print("0 ");
        } else if(n == 2) {
            System.out.print("0 1 ");
        } else {
            int a = 0, b = 1;
            System.out.print(a + " " + b + " ");
            for(int i = 3; i <= n; i++) {
                int c = a + b;
                System.out.print(c + " ");
                a = b;
                b = c;
            }
        }
        System.out.println();
    }

    // Another method to print Fibonacci series up to n using recursion
    public static void printFibonacciSeriesRecursive(int n) {
        for(int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
        System.out.println();
    }

    public static int sumOfFibonacci(int n) {
        if(n <= 0) {
            return 0;
        } else if(n == 1) {
            return 0; // The first Fibonacci number is 0
        } else if(n == 2) {
            return 1; // The sum of the first two Fibonacci numbers (0 + 1)
        } else {
            return fibonacci(n - 1) + sumOfFibonacci(n - 1);
        }
    }

    

    public static void main(String[] args) {
        int n = 7; // Change this value to compute a different Fibonacci number
        System.out.println("Fibonacci of " + n + " is: " + fibonacci(n));
        System.out.println();

        // Print Fibonacci series up to n
        System.out.println("Fibonacci series up to " + n + ": ");
        printFibonacciSeries(n);
        printFibonacciSeriesRecursive(n);
        System.out.println();

        // Sum of Fibonacci numbers up to n
        System.out.println("Sum of Fibonacci numbers up to " + n + ": " + sumOfFibonacci(n));
    }
}

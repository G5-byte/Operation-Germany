public class RecursionPractice {

    // Method to calculate factorial of a number using recursion
    public static int factorial(int n) {
        if (n <= 1) {
            return 1; // Base case: factorial of 0 or 1 is 1
        } else {
            return n * factorial(n - 1); // Recursive case
        }
    }

    // Method to calculate the sum of first n natural numbers using recursion
    public static int sumOfNaturalNumbers(int n) {
        if (n <= 0) {
            return 0; // Base case: sum of first 0 natural numbers is 0
        } else {
            return n + sumOfNaturalNumbers(n - 1); // Recursive case
        }
    }

    public static int power(int base, int exponent) {
        if (exponent == 0) {
            return 1; // Base case: any number raised to the power of 0 is 1
        } else {
            return base * power(base, exponent - 1); // Recursive case
        }
    }

    public static int countDigits(int n) {
        if(n < 10) {
            return 1;
        } else {
            return 1 + countDigits(n / 10);
        }
    }

    public static void main(String[] args) {
        int num = 5; // Change this value to compute factorial or sum for a different number

        System.out.println("Factorial of " + num + " is: " + factorial(num));
        System.out.println();
        System.out.println("Sum of first " + num + " natural numbers is: " + sumOfNaturalNumbers(num));
        System.out.println();
        System.out.println("Power of " + num + " raised to the power of 2 is: " + power(num, 2));
        System.out.println();
        int digitCountNum = 12345; // Change this value to count digits of a different number
        System.out.println("Count of digits in " + digitCountNum + " is: " + countDigits(digitCountNum));
    }
}
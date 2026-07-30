import java.util.Scanner;
public class Calculator {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number : ");
        double num1 = sc.nextDouble();

        System.out.println("Enter second number : ");
        double num2 = sc.nextDouble();

        sc.nextLine();

        System.out.println("Select an operation (+, -, *, /, %) : ");
        char operator = sc.next().charAt(0);

        double result = 0;
        boolean validOperation = true;

        switch (operator){

            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                    validOperation = false;
                }
                break;
            case '%':
                if (num2 != 0) {
                    result = num1 % num2;
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                    validOperation = false;
                }
                break;
            default:
                System.out.println("Invalid operator. Please select a valid operation.");
                validOperation = false;
                break;
            }
                if(validOperation){
                    
                    System.out.printf("Result: %.2f %c %.2f = %.2f%n", num1, operator, num2, result);
                }

                sc.close();
        }


    }

    


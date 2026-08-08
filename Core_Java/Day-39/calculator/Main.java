package calculator;

public class Main {
    public static void main(String[] args){

        Calculator calc = new Calculator();

        int sum = calc.add(5,3);
        System.out.println("Sum of 5 and 3 is: " + sum);

        int difference = calc.subtract(10,4);
        System.out.println("Difference of 10 and 4 is: " + difference);

        int product = calc.multiply(6,7);
        System.out.println("Product of 6 and 7 is: " + product);

        try{
            double quotient = calc.divide(20, 4);
            System.out.println("Quotient of 20 and 4 is: " + quotient);
        } catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }
}
    


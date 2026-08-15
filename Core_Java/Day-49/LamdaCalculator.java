interface Calculator {

    double calculate(double a, double b);
    
}

class LamdaCalculator{
    public static void main(String[] args) {
        
        Calculator addition = (a, b) -> (a + b);
        Calculator subtraction = (a, b) -> (a - b);
        Calculator multiplication = (a, b) -> (a * b);
        Calculator division = (a, b) -> (a / b);
        Calculator modulus = (a, b) -> (a % b);

        System.out.println("Addition : " + addition.calculate(10, 20 ));
        System.out.println("Subtraction : " + subtraction.calculate(10, 20 ));
        System.out.println("Multiplication : " + multiplication.calculate(10, 20 ));
        System.out.println("Division : " + division.calculate(10, 20 ));
        System.out.println("Modulus : " + modulus.calculate(10, 20 ));
    }


}


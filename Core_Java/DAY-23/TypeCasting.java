public class TypeCasting {
    public static void main(String[] args) {
        // Implicit Type Casting (Widening)
        int intValue = 100;
        double doubleValue = intValue; // int to double
        System.out.println("Implicit Type Casting (Widening):");
        System.out.println("Integer Value: " + intValue);
        System.out.println("Double Value: " + doubleValue);

        // Explicit Type Casting (Narrowing)
        double doubleValue2 = 9.78;
        int intValue2 = (int) doubleValue2; // double to int
        System.out.println("\nExplicit Type Casting (Narrowing):");
        System.out.println("Double Value: " + doubleValue2);
        System.out.println("Integer Value: " + intValue2);
    }
    
}

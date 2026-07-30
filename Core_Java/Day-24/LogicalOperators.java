public class LogicalOperators {
    public static void main(String[] args){
        
        int a = 10;
        int b = 20;

        System.out.println("a > 5 && b > 15 : " + (a > 5 && b > 15)); // Logical AND operator
        System.out.println("a > 5 || b < 15 : " + (a > 5 || b < 15)); // Logical OR operator
        System.out.println("!(a > 5) : " + !(a > 5)); // Logical NOT operator

        // AND gives True if both statements are True, False otherwise.
        // OR gives True if either one of the statements is True, False otherwise.
        // NOT gives True if the statement is False, and False if the statement is True.

    }
    
}

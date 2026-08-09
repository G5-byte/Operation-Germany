public class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

class VotingEligibilityChecker {

    public void checkAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age must be at least 18 to be eligible to vote");
        }

        System.out.println("Age is valid: " + age);
    }

    public static void main(String[] args) {
        VotingEligibilityChecker checker = new VotingEligibilityChecker();

        try {
            checker.checkAge(20);
            checker.checkAge(-5); // This will throw an exception
        } catch (InvalidAgeException e) {
            System.out.println("Caught an exception: " + e.getMessage());
        }
    }
}
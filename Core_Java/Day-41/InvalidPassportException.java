public class InvalidPassportException extends Exception {
    public InvalidPassportException(String message) {
        super(message);
    }
}

class PassportValidator {

    public void validatePassport(String passportNumber) throws InvalidPassportException {
        if (passportNumber == null || passportNumber.isEmpty()) {
            throw new InvalidPassportException("Passport number cannot be null or empty");
        }

        if (!passportNumber.matches("[A-Z]{2}[0-9]{7}")) {
            throw new InvalidPassportException("Invalid passport number format. It should be in the format: AA1234567");
        }

        System.out.println("Passport number is valid: " + passportNumber);
    }

    public static void main(String[] args) {
        PassportValidator validator = new PassportValidator();

        try {
            validator.validatePassport("AB1234567");
            validator.validatePassport("12345678"); // This will throw an exception
        } catch (InvalidPassportException e) {
            System.out.println("Caught an exception: " + e.getMessage());
        }
    }
}

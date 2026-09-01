public class RecursionString {

    public static void printString(String str, int index) {
        if(index == str.length()) {
            return;
        }
        System.out.println(str.charAt(index));
        printString(str, index + 1);
    }

    public static void printStringReverse(String str, int index) {
        if(index < 0) {
            return;
        }
        System.out.println(str.charAt(index));
        printStringReverse(str, index - 1);
    }

    public static void palindromeCheck(String str, int left, int right) {
        if(left >= right) {
            System.out.println("The string is a palindrome.");
            return;
        }
        if(str.charAt(left) != str.charAt(right)) {
            System.out.println("The string is not a palindrome.");
            return;
        }
        palindromeCheck(str, left + 1, right - 1);
    }

    public static int countOccurrences(String str, int index, char target) {
        if(index == str.length()) {
            return 0;
        }
        if(str.charAt(index) == target) {
            System.out.println("The character '" + target + "' is found at index " + index);
        }
        int count = (str.charAt(index) == target) ? 1 : 0;
        return count + countOccurrences(str, index + 1, target);
    }

    public static int findIndex(String str, int index, char target) {
        if(index == str.length()) {
            return -1; // Target not found
        }
        if(str.charAt(index) == target) {
            return index; // Target found at current index
        }
        return findIndex(str, index + 1, target); // Search in the rest of the string
    }

    public static void main(String[] args) {
        // Test the recursive method for string operations
        String str = "Hello, World!";
        // Print the string in normal order
        System.out.println("String in normal order:");
        printString(str, 0); // Call the printString method with index = 0
        System.out.println();

        // Print the string in reverse order
        System.out.println("String in reverse order:");
        printStringReverse(str, str.length() - 1); // Call the printStringReverse method with the last index

        System.out.println();
        // Check if the string is a palindrome
        String palindromeStr = "racecar";
        System.out.println("Checking if the string \"" + palindromeStr + "\" is a palindrome:");
        palindromeCheck(palindromeStr, 0, palindromeStr.length() - 1);
        System.out.println();

        // Count occurrences of a character in the string
        char targetChar = 'l';
        System.out.println("Counting occurrences of '" + targetChar + "' in the string:");
        int count = countOccurrences(str, 0, targetChar);
        System.out.println("The character '" + targetChar + "' occurs " + count + " times in the string.");

        System.out.println();
        // Find the index of a character in the string
        int index = findIndex(str, 0, targetChar);
        if(index != -1) {
            System.out.println("The character '" + targetChar + "' is found at index " + index);
        } else {
            System.out.println("The character '" + targetChar + "' is not found in the string.");
        }
    }
    
}

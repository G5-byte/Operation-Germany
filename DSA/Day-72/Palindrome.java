public class Palindrome {

    public static boolean isPalindrome(String str, int left, int right) {
        if(left >= right) {
            return true; // Base case: if left index is greater than or equal to right index, it's a palindrome
        }
        if(str.charAt(left) != str.charAt(right)) {
            return false; // If characters at left and right indices don't match, it's not a palindrome
        }
        return isPalindrome(str, left + 1, right - 1); // Recursively check the substring
    }

    public static void main(String[] args) {
        String str = "racecar"; // Change this value to test with a different string
        System.out.println("Original String: " + str);

        boolean result = isPalindrome(str, 0, str.length() - 1);
        if(result) {
            System.out.println(str + " is a palindrome.");
        } else {
            System.out.println(str + " is not a palindrome.");
        }
    }
    
}

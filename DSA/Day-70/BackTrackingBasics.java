public class BackTrackingBasics { 

    public static int printSubsequences(int[] arr, String ans, int index) {
        if (index == arr.length) {
            System.out.println(ans);
            return 1;
        }

        int count = 0;
        count += printSubsequences(arr, ans + arr[index], index + 1); // Include the element
        count += printSubsequences(arr, ans, index + 1); // Exclude the element

        return count;
    }

    public static int printBinaryStrings(int n, String ans) {
        if (n == 0) {
            System.out.println(ans);
            return 1;
        }

        int count = 0;
        count += printBinaryStrings(n - 1, ans + "0"); // Add '0' to the string
        count += printBinaryStrings(n - 1, ans + "1"); // Add '1' to the string
        return count;
    }

    public static int printPermutations(String str, String ans) {
        if(str.length() == 0) {
            System.out.println(ans);
            return 1;
        }

        int count = 0;
        for(int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            String ros = str.substring(0, i) + str.substring(i + 1);
            count += printPermutations(ros, ans + ch);
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        int totalSubsequences = printSubsequences(arr, "", 0);
        System.out.println("Total Subsequences: " + totalSubsequences);
        System.out.println();

        int n = 3; // Length of binary strings
        int totalBinaryStrings = printBinaryStrings(n, "");
        System.out.println("Total Binary Strings: " + totalBinaryStrings);
        System.out.println();

        String str = "ABC";
        int totalPermutations = printPermutations(str, "");
        System.out.println("Total Permutations: " + totalPermutations);
    }
    
}

public class RecursionArray {

    public static void printArray(int[] arr, int index) {
        if(index == arr.length) {
            return;
        }
        System.out.println(arr[index]);
        printArray(arr, index + 1);
    }

    public static int sumArray(int[] arr, int index) {
        if(index == arr.length) {
            return 0;
        }
        return arr[index] + sumArray(arr, index + 1);
    }

    public static int maxArray(int[] arr, int index) {
        if(index == arr.length - 1) {
            return arr[index];
        }
        return Math.max(arr[index], maxArray(arr, index + 1));
    }

    public static int minArray(int[] arr, int index) {
        if(index == arr.length - 1) {
            return arr[index];
        }
        return Math.min(arr[index], minArray(arr, index + 1));
    }

    public static int countOccurrences(int[] arr, int index, int target) {
        if(index == arr.length) {
            return 0;
        }
        int count = (arr[index] == target) ? 1 : 0;
        return count + countOccurrences(arr, index + 1, target);
    }

    public static int findIndex(int[] arr, int index, int target1) {
        if(index == arr.length) {
            return -1; // Target not found
        }
        if(arr[index] == target1) {
            return index; // Target found at current index
        }
        return findIndex(arr, index + 1, target1); // Search in the rest of the array
    }

    public static void main(String[] args) {
        // Test the recursive methods for array operations
        // Create an array of integers
        int[] arr = {1, 2, 3, 3, 4, 5};
        printArray(arr, 0); // Call the printArray method with index = 0
        System.out.println(); // Print a new line for better readability

        // Calculate the sum of array elements
        System.out.println("Sum of array elements: " + sumArray(arr, 0));
        System.out.println();

        // Find the maximum element in the array
        System.out.println("Maximum element in the array: " + maxArray(arr, 0));
        System.out.println();

        // Find the minimum element in the array
        System.out.println("Minimum element in the array: " + minArray(arr, 0));
        System.out.println();

        // Count occurrences of a specific element in the array
        int target = 3;
        System.out.println("Occurrences of " + target + " in the array: " + countOccurrences(arr, 0, target));
        System.out.println();

        // Find the index of a specific element in the array
        int target1 = 4;
        System.out.println("Index of " + target1 + " in the array: " + findIndex(arr, 0, target1));
    }
    
}

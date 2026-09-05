public class TwoSumSorted {

    public static void twoSumSorted(int[] arr, int left, int right, int target) {
        if(left >= right) {
            return; // Base case: if left index is greater than or equal to right index, stop recursion
        }

        while(left < right) {
            int sum = arr[left] + arr[right];
            if(sum == target) {
                System.out.println("Pair found: (" + arr[left] + ", " + arr[right] + ")");
                System.out.println("Pair found at indexes: (" + left + ", " + right + ")");
                left++;
                right--;
            } else if(sum < target) {
                left++;
            } else {
                right--;
            }
        }

        twoSumSorted(arr, left + 1, right - 1, target); // Recursive call to find more pairs

        System.out.println("No more pairs found.");
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println("Original Array: ");
        for(int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Example usage of twoSumSorted
        int target = 7;
        System.out.println("Finding pairs with sum " + target + ":");
        twoSumSorted(arr, 0, arr.length - 1, target);
    
    }

}
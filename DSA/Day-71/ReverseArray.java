public class ReverseArray { 

    public static void reverseArray(int[] arr, int left, int right) {
        if(left >= right) {
            return; // Base case: if left index is greater than or equal to right index, stop recursion
        }

        // Swap the elements at left and right indices
        if(arr[left] < arr[right]) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
        }

        // Recursive call to reverse the remaining elements
        reverseArray(arr, left + 1, right - 1);
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println("Original Array: ");
        for(int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();

        reverseArray(arr, 0, arr.length - 1);

        System.out.println("Reversed Array: ");
        for(int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();

    }
    
}

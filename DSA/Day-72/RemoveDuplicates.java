public class RemoveDuplicates {

    public static int removeDuplicates(int[] arr) {
        if(arr.length == 0) {
            return 0; // If the array is empty, return 0
        }

        int uniqueCount = 1; // Start with the first element as unique
        for(int i = 1; i < arr.length; i++) {
            if(arr[i] != arr[uniqueCount - 1]) {
                arr[uniqueCount] = arr[i]; // Move the unique element to the front
                uniqueCount++; // Increment the count of unique elements
            }

            System.out.println("\nCurrent unique elements: ");
            for(int j = 0; j < uniqueCount; j++) {
                System.out.print(arr[j] + " ");
            }
            System.out.println();
        }

        System.out.println("\nTotal unique elements: " + uniqueCount);

        return uniqueCount; // Return the count of unique elements
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 3, 4, 4, 5};
        System.out.println("\nOriginal Array: ");
        for(int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();

        int uniqueCount = removeDuplicates(arr);

        System.out.println("\nArray after removing duplicates: ");
        for(int i = 0; i < uniqueCount; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    
}

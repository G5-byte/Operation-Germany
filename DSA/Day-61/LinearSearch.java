public class LinearSearch {
    public static void main(String[] args) {

        int[] arr = {10, 25, 7, 43, 18, 5, 30};
        int target = 42;
        boolean found = false;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                System.out.println("Element found at index " + i);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Element not found!");
        }

        int[] array = {10, 20, 10, 30, 10, 40};
        int target1 = 10;
        boolean foundTarget1 = false;

        for (int j = 0; j < array.length; j++) {
            if (array[j] == target1) {
                System.out.println("Element found at index " + j);
                foundTarget1 = true;
            }
        }

        if (!foundTarget1) {
            System.out.println("Element not found!");
        }
    }
}

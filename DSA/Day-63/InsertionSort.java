public class InsertionSort {
    public static void main(String[] args) {
        
        int[] arr = {12, 11, 13, 5, 6};

        // Array in Ascending Order

        for(int i=1; i < arr.length; i++) {

            int key = arr[i];
            int j = i-1;
            while(j >= 0 && arr[j] > key) {
                arr[j+1] = arr[j];
                j--;
            }

            arr[j+1] = key;
        }

        System.out.println("Array in Ascending Order :");

        for(int i=0; i < arr.length; i++) {
            System.out.println("Array" + "[" + i + "]" + " -> " + arr[i]);
        }

        // Same array in Descending Order
        // int[] arr = {12, 11, 13, 5, 6};

        for(int k=1; k < arr.length; k++) {

            int key1 = arr[k];
            int z = k-1;

            while(z >= 0 && arr[z] < key1) {
                arr[z+1] = arr[z];
                z--;
            }

            arr[z+1] = key1;
        }

        System.out.println("Array in Descending Order :");

        for(int k=0; k < arr.length; k++) {
            System.out.println("Array" + "[" + k + "]" + " -> " + arr[k]);
        }

    }
}
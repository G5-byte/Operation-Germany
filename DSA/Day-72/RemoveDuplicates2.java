public class RemoveDuplicates2 {

    public static int removeDuplicates(int[] arr) {
        int k = 2;
        for(int i = 2; i < arr.length; i++) {
            if(arr[i] != arr[k-2]) {
                arr[k] = arr[i];
                k++;
            }
        }

        System.out.print("Array : ");
        for(int i = 0; i < k; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
        return k;
    }

    public static void main(String[] args) {

        int[] arr = {1, 1, 1, 2, 2, 2, 3};
        System.out.println("Len " + removeDuplicates(arr));
        
    }
}
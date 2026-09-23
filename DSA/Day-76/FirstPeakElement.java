public class FirstPeakElement {
    public static void main(String[] args) {

        int[] arr = {1, 5, 2, 1, 5, 6, 8, 2, 3};
        for(int i = 1; i < arr.length-1; i++) {
            if(arr[i] > arr[i-1] && arr[i] > arr[i+1]) {
                System.out.println("First Peak : " + arr[i] + " at position " + i);
                break;
            }
        }
        
    }
    
}

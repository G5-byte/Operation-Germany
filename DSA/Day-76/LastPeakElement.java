public class LastPeakElement {
    public static void main(String[] args) {

        int[] arr = {1, 5, 2, 1, 5, 6, 8, 2, 3};

        for(int i = arr.length-2; i > 0; i--) {
            if(arr[i] > arr[i-1] && arr[i] > arr[i+1]) {
                System.out.println("Last Peak : " + arr[i]);
                break;
            }
        }
    }
    
}

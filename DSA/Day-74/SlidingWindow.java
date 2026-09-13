public class SlidingWindow {
    
    public static int minSubArrSum(int[] arr, int target) {

        int left = 0;
        int sum = 0;
        int minLength = Integer.MAX_VALUE;
        int start = 0;
        int end = 0;
        for(int right = 0; right < arr.length; right++) {

            sum += arr[right];

            while (sum >= target) {
                if(right - left + 1 < minLength) {
                    minLength = right - left + 1;
                    start = left;
                    end = right;
                }
                sum -= arr[left];
                left++;
            }
        }

        System.out.print("Minimum Subarray : ");

        for(int i = start; i <= end; i++) {
            System.out.print("[" + arr[i] + "]" + " ");
        }

        System.out.println();

        return minLength == Integer.MAX_VALUE ? 0 : minLength;
    }

    public static void main(String[] args) {

        int[] arr = {2, 3, 1, 2, 4, 3};
        int target = 7;

        System.out.println("Minimum Length : " + minSubArrSum(arr, target));
    }
}
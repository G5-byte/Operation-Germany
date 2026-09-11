// Sliding Window
public class MaxSum {
    
    public static int maximumSum(int[] arr, int k) {

        int windowSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for(int i = 0; i < arr.length; i++) {
            windowSum += arr[i];

            if(i >= k-1) {

                System.out.print("\nCurrent Window : ");

                for(int j = i-k+1; j <= i; j++) {
                    System.out.print(arr[j] + " ");
                }

                System.out.print(" -> Sum = " + windowSum);

                maxSum = Math.max(maxSum, windowSum);
                windowSum -= arr[i-k+1];
            }


        }

        System.out.println();
        return maxSum;
    }

    public static int minimumSum(int[] arr, int k) {

        int windowSum = 0;
        int minSum = Integer.MAX_VALUE;

        for(int i = 0; i < arr.length; i++) {
            windowSum += arr[i];

            if(i >= k-1) {
                minSum = Math.min(minSum, windowSum);
                windowSum -= arr[i-k+1];
            }
        }

        return minSum;
    }
    public static void main(String[] args) {
        
        int [] arr = {2, 1, 5, 1, 3 };
        int k = 3;
        System.out.println("Maximum Sum -> " + maximumSum(arr, k));
        System.out.println("Minimum Sum -> " + minimumSum(arr, k));

    }
}

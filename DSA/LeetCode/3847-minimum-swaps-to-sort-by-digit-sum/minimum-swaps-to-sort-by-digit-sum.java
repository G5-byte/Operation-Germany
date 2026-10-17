class Solution {
    public int minSwaps(int[] nums) {
        
        int n = nums.length;
        
        // Step 1: Create a 2D array to store each number and its original index
        // arr[i][0] = number, arr[i][1] = original index
        int[][] arr = new int[n][2];
        for (int i = 0; i < n; i++) {
            arr[i][0] = nums[i];
            arr[i][1] = i;
        }
        
        // Step 2: Sort based on digit sum first, then by numerical value as a tie-breaker
        Arrays.sort(arr, (a, b) -> {
            int sumA = getDigitSum(a[0]);
            int sumB = getDigitSum(b[0]);
            if (sumA != sumB) {
                return Integer.compare(sumA, sumB);
            }
            return Integer.compare(a[0], b[0]);
        });
        
        // Step 3: Find the minimum swaps required using cycle detection
        boolean[] visited = new boolean[n];
        int swaps = 0;
        
        for (int i = 0; i < n; i++) {
            // If the element is already visited or already in the correct position
            if (visited[i] || arr[i][1] == i) {
                continue;
            }
            
            // Traverse the cycle
            int cycleSize = 0;
            int curr = i;
            while (!visited[curr]) {
                visited[curr] = true;
                curr = arr[curr][1];
                cycleSize++;
            }
            
            // Add (cycleSize - 1) to the total swaps
            if (cycleSize > 1) {
                swaps += (cycleSize - 1);
            }
        }
        
        return swaps;
    }
    
    // Helper method to compute the sum of digits of a number
    private int getDigitSum(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}
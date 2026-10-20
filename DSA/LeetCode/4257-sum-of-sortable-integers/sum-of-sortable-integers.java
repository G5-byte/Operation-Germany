import java.util.Arrays;

class Solution {
    public int sortableIntegers(int[] nums) {
        int n = nums.length;
        int[] sortedNums = nums.clone();
        Arrays.sort(sortedNums);
        
        int totalSum = 0;
        
        for (int k = 1; k <= n; k++) {
            if (n % k != 0) continue;
            
            boolean possible = true;
            for (int i = 0; i < n; i += k) {
                if (!canRotate(nums, sortedNums, i, k)) {
                    possible = false;
                    break;
                }
            }
            if (possible) {
                totalSum += k;
            }
        }
        
        return totalSum;
    }
    
    private boolean canRotate(int[] nums, int[] sortedNums, int start, int k) {
        // Quick check: if the block is already equal to the sorted counterpart
        boolean identical = true;
        for (int i = 0; i < k; i++) {
            if (nums[start + i] != sortedNums[start + i]) {
                identical = false;
                break;
            }
        }
        if (identical) return true;
        
        // Find the first occurrence of the target's first element
        int targetVal = sortedNums[start];
        for (int j = 0; j < k; j++) {
            if (nums[start + j] == targetVal) {
                // Verify if this rotation shift works
                boolean match = true;
                for (int m = 0; m < k; m++) {
                    if (nums[start + (j + m) % k] != sortedNums[start + m]) {
                        match = false;
                        break;
                    }
                }
                if (match) return true;
                
                // Skip ahead if subsequent elements are the same to avoid redundant checks
                while (j + 1 < k && nums[start + j + 1] == targetVal) {
                    j++;
                }
            }
        }
        return false;
    }
}
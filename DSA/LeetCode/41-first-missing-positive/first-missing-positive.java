class Solution {
    public int firstMissingPositive(int[] nums) {
        int n = nums.length;
        int[] frq = new int[n+1];

        for(int i = 0; i < n; i++) {
            if(nums[i] > 0 && nums[i] <= n) {
                frq[nums[i]] = nums[i];
            }
        }

        for(int i = 1; i <= n; i++) {
            if(frq[i] == 0) {
                return i;
            }
        }

        return n+1;
    }
}
import java.util.Stack;
class Solution {
    public int[] nextGreaterElements(int[] nums) {
        
        int n = nums.length;
        int[] answer = new int[n];
        Arrays.fill(answer, -1);
        Stack<Integer> stk = new Stack<>();

        for(int j = 0; j < 2*n; j++) {
            int cIndex = j%n;

            while(!stk.isEmpty() && nums[cIndex] > nums[stk.peek()]) {
                int top = stk.pop();
                answer[top] = nums[cIndex];
            }

            if(j<n) {
                stk.push(cIndex);
            }
        }

        return answer;
    }
}
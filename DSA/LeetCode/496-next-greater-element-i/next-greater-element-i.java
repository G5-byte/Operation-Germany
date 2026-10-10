import java.util.Stack;
import java.util.HashMap;
class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {

        int n = nums1.length;
        int[] answer = new int[n];

        HashMap<Integer, Integer> map =  new HashMap<>();
        Stack<Integer> stk = new Stack<>();

        for(int i = 0; i < nums2.length; i++) {
            while(!stk.isEmpty() && nums2[i] > nums2[stk.peek()]) {
                int top = stk.pop();
                map.put(nums2[top], nums2[i]);
            }
            stk.push(i);
        }

        for(int j = 0; j < nums1.length; j++) {
            answer[j] = map.getOrDefault(nums1[j], -1);
        }

        return answer;
    }
}
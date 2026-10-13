import java.util.Stack;
class Solution {
    public int largestRectangleArea(int[] heights) {
        
        Stack<Integer> stk = new Stack<>();

        int n = heights.length;
        int maxArea = 0;
        for(int i = 0; i < n; i++) {

            while(!stk.isEmpty() && heights[i] < heights[stk.peek()]) {
                int top = stk.pop();
                int width;
                if(stk.isEmpty()) {
                    width = i;
                }
                else {
                    width = i - stk.peek() - 1;
                }
                

                int area = heights[top]*width;
                maxArea = Math.max(maxArea, area);
            }

            stk.push(i);
        }

        while (!stk.isEmpty()) {
            int top = stk.pop();
            int width;

            if (stk.isEmpty()) {
                width = n;
            } else {
                width = n - stk.peek() - 1;
            }

            int area = heights[top] * width;
            maxArea = Math.max(maxArea, area);
        }
        return maxArea;
    }
}
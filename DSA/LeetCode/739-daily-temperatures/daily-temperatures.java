import java.util.Stack;
class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        
        Stack<Integer> stk = new Stack<>();
        int n = temperatures.length;
        int[] answer = new int[n];

        for(int i = 0; i < n; i++) {
            
            while (!stk.isEmpty() && temperatures[i] > temperatures[stk.peek()]) {
                int top = stk.pop();
                answer[top] = i - top;
            }
           
           stk.push(i);
        }
        return answer;
    }
}
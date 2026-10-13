class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        
        int left = 1;
        int right = 0;
        
        for(int pile : piles) {
            right = Math.max(right, pile);
        }

        int answer = right;
        while(left <= right) {

            int mid = left + (right-left)/2;
            long totalHours = 0;

            for(int pile : piles) {
                int hours = pile/mid;
                
                if(pile % mid != 0) {
                    hours++;
                }

                totalHours+= hours;
            }
            
            if(totalHours <= h) {
                answer = mid;
                right = mid-1;
            }
            else {
                left = mid+1;
            }   
        }

        return answer;
    }
}
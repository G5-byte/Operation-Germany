class Solution {
    public int minOperations(String s) {
        boolean isSorted = true;
        for(int i = 1; i < s.length(); i++) {
            if(s.charAt(i) < s.charAt(i-1)) {
                isSorted = false;
                break;
            }
        }
        if(isSorted) {
            return 0;
        }
        if(!isSorted && s.length() == 2) {
            return -1;
        }

        char mn = s.charAt(0);
        char mx = s.charAt(0);

        for(int i = 1; i < s.length(); i++) {
            if(mn > s.charAt(i)) {
                mn = s.charAt(i);
            }
            if(mx < s.charAt(i)) {
                mx = s.charAt(i);
            }
        }
        if(s.charAt(0) == mn || s.charAt(s.length()-1) == mx) {
            return 1;
        }
        else {
            for(int i = 1; i < s.length()-1; i++) {
                if(s.charAt(i) == mn || s.charAt(i) == mx) {
                    return 2;
                }
            }
        }
        return 3;
    }
}

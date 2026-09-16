import java.util.HashSet;

public class SWstring {

    public static int lenOfLongestSubstring(String s) {

        HashSet<Character> set = new HashSet<>();

        int left = 0;
        int maxLength = 0;
        int start = 0;
        int end = 0;

        for(int right = 0; right <= s.length() - 1; right++) {

            while(set.contains(s.charAt(right))) {
            set.remove(s.charAt(left));
            left++;
        }
            set.add(s.charAt(right));

            if(right-left+1 > maxLength) {
                maxLength = right-left+1;
                start = left;
                end = right;
            }
        }

        System.out.println("\nLongest Substring : ");

        for(int i = start; i <= end; i++) {
            System.out.print(s.charAt(i));
        }

        System.out.println();
        return maxLength;
    }

    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println("Length of Substring : " + lenOfLongestSubstring(s));
    }
}

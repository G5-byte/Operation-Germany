import java.util.HashMap;

public class LongestSubarray {
    
    public static int longestSubarray(int[] arr, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();

        int left = 0;
        int maxLength = 0;

        for (int right = 0; right < arr.length; right++) {

            map.put(arr[right], map.getOrDefault(arr[right], 0) + 1);

            while (map.size() > k) {

                map.put(arr[left], map.get(arr[left]) - 1);

                if (map.get(arr[left]) == 0) {
                    map.remove(arr[left]);
                }

                left++;
            }

            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }

    public static void main(String[] args) {
        
        int[] arr = {1, 2, 1, 2, 3};

        System.out.println(longestSubarray(arr, 2));
    }
}
import java.util.HashMap;

public class FrqOfElement {
    
    public static int freqOfElement(int[] arr, int x) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == x) {
                map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
            }
        }

        if(map.containsKey(x)) {
            return map.get(x);
        }

        return 0;
    }

    public static void main(String[] args) {
        
        int[] arr = {1, 2, 3, 3, 2, 1};
        System.out.println(freqOfElement(arr, 2));
    }
}

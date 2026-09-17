import java.util.HashMap;

public class CheckEqlArrays {
    
    public static boolean checkEqual(int[] arr1, int[] arr2) {

        HashMap<Integer, Integer> map = new HashMap<>();

        if(arr1.length != arr2.length) {
            return false;
        }

        for(int i = 0; i < arr1.length; i++) {
            map.put(arr1[i], map.getOrDefault(arr1[i], 0) + 1);
        }

        for(int i = 0; i < arr2.length; i++) {
            if(!map.containsKey(arr2[i])) {
                return false;
            }

            map.put(arr2[i], map.get(arr2[i]) - 1);
            if(map.get(arr2[i]) == 0) {
            map.remove(arr2[i]);
            }
        }

        if(map.isEmpty()) {
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        
        int[] arr1 = {1, 2, 5, 4, 0};
        int[] arr2 = {2, 4, 5, 0, 1};

        System.out.println(checkEqual(arr1, arr2));
    }
}

import java.util.ArrayList;
public class NumberOfPeak {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        int[] arr = {1, 5, 2, 1, 5, 6, 8, 2, 3};
        for(int i = 1; i < arr.length-1; i++) {
            if(arr[i] > arr[i-1] && arr[i] > arr[i+1]) {
                list.add(arr[i]);
            }
        }

        System.out.println(list);
        System.out.println(list.size());
    }
    
}

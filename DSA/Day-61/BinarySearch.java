public class BinarySearch {
    public static void main(String[] args) {
        
        int[] arr = {5, 10, 18, 25, 30, 42, 50};
        int target = 42;

        int left = 0;
        int right = arr.length-1;

        boolean found = false;
        
        while(left <= right) {

            int mid = (left + right)/2;

            if(arr[mid] == target) {
                System.out.println("Element found at index :" + mid);
                System.out.println("Element is : " + arr[mid]);
                found = true;
                break;
            }
            else if (arr[mid] < target) {
                     left = mid++;
            }
            else {
            right = mid-1;
            } 
        }

        if (!found) {
            System.out.println("Element not found!");
        }
    
    }

}
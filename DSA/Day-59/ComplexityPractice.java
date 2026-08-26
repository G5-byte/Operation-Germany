public class ComplexityPractice {
    public static void main(String[] args) {
        
        // Time Complexity : O(1)
        int[] arr = {0};
        System.out.println(arr[0]);

        // Time Complexity : O(n)
        int n = 10;
        for (int i = 0; i < n; i++) {
            System.out.println(i);
        }

        // Time Complexity : O(n^2)
        for (int i = 0; i < n; i++) {
           for (int j = 0; j < n; j++) {
               System.out.println(i + " " + j);
            }
        }

        // Time Complexity : O(n)
        for (int i = 0; i < n; i++) {
            System.out.println(i);
        }

        for (int j = 0; j < n; j++) {
            System.out.println(j);
        }
    }
    
}

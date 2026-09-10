public class HollowTriangle {
    public static void main(String[] args) {
        int n = 6;
        for(int row = 1; row <= n; row++) {
            for(int col = 1; col <= n-row; col++) {
                System.out.print(" ");
            }

            for(int col = 1; col <= (2*row-1); col++) {
                if(col == 1||col == (2*row-1)||row == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
                
            }
            System.out.println();
        }
    }
}
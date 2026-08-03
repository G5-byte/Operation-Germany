public class MaxNum {

    public static int max(int a, int b){
        return (a > b) ? a : b;
    }

    public static int max(int a, int b, int c){
        return max(max(a, b), c);
    }

    public static double max(double a, double b){
        return (a > b) ? a : b;
    }

    public static void main(String[] args){
        int maxInt = max(10, 20);
        System.out.println("The maximum integer is: " + maxInt);

        int maxIntThree = max(10, 20, 15);
        System.out.println("The maximum integer among three numbers is: " + maxIntThree);

        double maxDouble = max(10.5, 20.3);
        System.out.println("The maximum double is: " + maxDouble);
    }
    
}

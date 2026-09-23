import java.util.Scanner;
public class StreamOfInput {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        System.out.println("Enter the Element : ");
        while(true){
            int n = sc.nextInt();
            if(n != -1){
                sum += n;
            }
            else {
                break;
            }
        }
        sc.close();

        System.out.println("Sum : " + sum);
    }
    
}

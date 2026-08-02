import java.util.Scanner;
public class SumOfNumbers {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number to calculate the sum of numbers from 1 to that number : ");
        int num = sc.nextInt();

        int sum = 0;

        for(int i=1; i<=num; i++){
            sum += i;
        }

        System.out.println("The sum of numbers from 1 to " + num + " is : " + sum);

        sc.close();
    }
    
}

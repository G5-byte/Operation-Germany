import java.util.Scanner;
public class StudentInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your name : ");
        String name = sc.nextLine();

        System.out.println("Enter your age : ");
        int age = sc.nextInt();

        sc.nextLine(); // Consume the newline character left by nextInt()

        System.out.println("Enter your college name : ");
        String college = sc.nextLine();

        System.out.println("Enter your branch : ");
        String branch = sc.nextLine();

        System.out.println("Enter your CGPA : ");
        double cgpa = sc.nextDouble();

        sc.nextLine(); // Consume the newline character left by nextDouble()

        System.out.println();

        System.out.println("Student Details:");
        System.out.println("----------------");
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
        System.out.println("CGPA : " + cgpa);
        System.out.println("College : " + college);
        System.out.println("Branch : " + branch);

        sc.close();
        
    }
    
}

public class Person {

    public void displayName() {
        System.out.println("Person's name is John");
    }

}

    class Student extends Person {

        public void displayRollNumber() {
            System.out.println("Roll Number is 12345");
        }

        public static void main(String[] args) {
            Student student = new Student();
            student.displayName();
            student.displayRollNumber();
        }
    }
    


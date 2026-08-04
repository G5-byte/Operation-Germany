public class Student {

    String name;
    int rollNumber;

    Student(String name, int rollNumber){
        this.name = name;
        this.rollNumber = rollNumber;
    }

    public void displayInfo(){
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
    }

    public static void main(String[] args){

        Student student1 = new Student("Alice", 101);
        Student student2 = new Student("Bob", 102);

        student1.displayInfo();
        student2.displayInfo();
    }


    
}

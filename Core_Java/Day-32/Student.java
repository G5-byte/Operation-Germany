public class Student {

    private String name;
    private int rollNumber;
    private int age;

    public void setName(String name){
        this.name = name;
    }

    public void setRollNumber(int rollNumber){
        this.rollNumber = rollNumber;
    }

    public void setAge(int age){
        this.age = age;
    }

    public String getName(){
        return name;
    }

    public int getRollNumber(){
        return rollNumber;
    }

    public int getAge(){
        return age;
    }

    public void displayInfo(){
        System.out.println("Name: " + getName());
        System.out.println("Roll Number: " + getRollNumber());
        System.out.println("Age: " + getAge());
    }

    public static void main(String[] args){

        Student s1 = new Student();
        s1.setName("Alice");
        s1.setRollNumber(101);
        s1.setAge(20);
        
        Student s2 = new Student();
        s2.setName("Bob");
        s2.setRollNumber(102);
        s2.setAge(22);

        s1.displayInfo();
        System.out.println();
        s2.displayInfo();

    }

}

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import javax.swing.GroupLayout.Group;

class Student {

    private int id;
    private String name;
    private double marks;

    public Student(int id, String name, double marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    public int getID() { return id; }
    public String getName() { return name; }
    public double getMarks() { return marks; }

    @Override
    public String toString() {
        return id + "-" + name + "-" + marks;
    }
}

class StudentManagement {
    public static void main(String[] args) {
        
        // ArrayList
        List<Student> students = new ArrayList<>();

        students.add(new Student(101, "Nikhil", 85));
        students.add(new Student(102, "Aman", 72));
        students.add(new Student(103, "Rahul", 91));
        students.add(new Student(104, "Priya", 65));
        students.add(new Student(105, "Rohit", 78));

        System.out.println();

        // Print all students
        System.out.println("All Students : ");
        System.out.println();
        students.forEach(System.out::println);

        // Students scoring >= 75

        System.out.println("\nStudents scoring >= 75:");

        students.stream().filter(student -> student.getMarks() >= 75)
                         .forEach(System.out::println);

        // Sort by marks descending
        System.out.println("\nStudents sort by marks:");
        
        students.stream().sorted((s1,s2) -> Double.compare(s2.getMarks(), s1.getMarks()))
                         .forEach(System.out::println);
        
        // Find highest scorer

        Optional<Student> topper = students.stream().max(Comparator.comparingDouble(Student::getMarks));

        System.out.println("\nTopper");
        topper.ifPresent(System.out::println);

        //HashSet

        HashSet<String> names = new HashSet<>();

        students.forEach(student -> names.add(student.getName()));

        System.out.println("\nUnique names:");
        names.forEach(System.out::println);

        //HashMap

        HashMap<Integer, Student> studentMap = new HashMap<>();

        students.forEach(student -> studentMap.put(student.getID(), student));

        System.out.println("\nStudent with ID 103 : ");

        System.out.println(studentMap.get(103));

        //Average Marks
        System.out.println("\nAverage Marks:");

        students.stream().mapToDouble(Student::getMarks).average()
                         .ifPresent(System.out::println);

        //Get Student by Id
        System.out.println("\nStudent by Id:");
        
        students.stream().filter(student -> student.getID() == 101).findFirst()
                         .ifPresent(System.out::println);

        //Student who passed by scoring minimum 40 marks
        System.out.println("\nStudents who passed:");
        
        students.stream().filter(student -> student.getMarks() >= 40)
                         .forEach(System.out::println);

        //Grouping Students by Pass/fail
        System.out.println("\nGrouping Students by Pass/Fail");  
        
        Map<Boolean, List<Student>> result = students.stream()
            .collect(Collectors.partitioningBy(student -> student.getMarks() >= 40));

        System.out.println("\nPassed:");
        result.get(true).forEach(System.out::println);
        
        System.out.println("\nFailed:");
        result.get(false).forEach(System.out::println);
                 
    }
}
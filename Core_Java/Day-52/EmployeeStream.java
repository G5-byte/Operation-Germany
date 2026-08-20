import java.util.List;
import java.util.Arrays;

public class EmployeeStream {
    public static void main(String[] args) {

        List<Employee> employees = Arrays.asList(
                       new Employee(101, "Nikhil", 100000),
                       new Employee(102, "Rahul", 60000),
                       new Employee(103, "Arpita", 50000),
                       new Employee(104, "Priya", 40000));

                       employees.stream()
                           .forEach(System.out::println);
    }
    
}

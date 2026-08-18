import java.util.List;
import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

class Employees {

     String name;
     String department;

    public Employees(String name, String department) {
        this.name = name;
        this.department = department;
    }

    public String getdepartment() { return department; } 

    public String toString() { return name ;}

}

class AdvanceGrouping {
    public static void main(String[] args) {
        
        List<Employees> employees = Arrays.asList(
            new Employees("Alicee", "IT"),
            new Employees("Bob", "HR"),
            new Employees("Charlie", "IT"));

        Map<String, List<Employees>> employeesByDept = employees.stream()
                .collect(Collectors.groupingBy(Employees::getdepartment));

        employeesByDept.forEach((dept, deptEmployees) ->
            System.out.println(dept + " -> " + deptEmployees));
    }
}

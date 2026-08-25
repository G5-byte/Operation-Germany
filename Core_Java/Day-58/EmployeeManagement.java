import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Comparator;
import java.util.Optional;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ExecutionException;

class Employee {

    private int id;
    private String name;
    private String department;
    private double salary;

    public Employee(int id, String name, String department, double salary) {

        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;

    }

    public int getId() { return id; }
    public String getName() { return name; }
    public String getDepartment() {return department; }
    public double  getSalary() { return salary; }

    @Override
    public String toString() {
        return id + "-" + name + "-" + department + "-" + salary;
    }
}

class EmployeeManagement {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        
        List<Employee> employees = new ArrayList<>();

        employees.add(new Employee(101, "Nikhil", "Coding", 100000));
        employees.add(new Employee(102, "Aman", "UI", 60000));
        employees.add(new Employee(103, "Rahul", "Development", 98000));
        employees.add(new Employee(104, "Priya", "Coding", 95000));
        employees.add(new Employee(105, "Rohit", "Management", 45000));

        System.out.println();

        //Display all Employees
        System.out.println("\nAll Employees:");

        employees.forEach(System.out::println);

        //Employees with salary >= 50000
        System.out.println("\nEmployees with salary >= 50000:");
        employees.stream().filter(employee -> employee.getSalary() >= 50000)
                          .forEach(System.out::println);

        //Sort employees by Salary
        System.out.println("\nSorting Employees by Salary:");
        employees.stream().sorted((e1, e2) -> Double.compare(e1.getSalary(), e2.getSalary()))
                          .forEach(System.out::println);
                          
        //Highest paid employee
        System.out.println("\nHighest paid Employee:");
        
        Optional<Employee> highestPaidEmployee = employees.stream()
                                                          .max(Comparator.comparingDouble(Employee::getSalary));

        highestPaidEmployee.ifPresent(System.out::println);  
        
        //Average Salary
        System.out.println("\nAverage Salary:");

        employees.stream().mapToDouble(Employee::getSalary).average()
                          .ifPresent(System.out::println);

        //Get Employee by Id
        System.out.println("\nGet Employee by Id:");
        
        Optional<Employee> findEmployee = employees.stream().filter(employee -> employee.getId() == 101).findFirst();
        findEmployee.ifPresent(System.out::println);

        //HashMap
        System.out.println("\nStoring Employees in HashMap:");

        HashMap<Integer, Employee> employeeMap = new HashMap<>();
        
        employees.forEach(employee -> employeeMap.put(employee.getId(), employee));

        System.out.println("\nEmployee with Id 103");

        System.out.println(employeeMap.get(103));

        //HashSet
        System.out.println("\nStoring Departments in HashSet:");

        HashSet<String> departments = new HashSet<>();

        employees.forEach(employee -> departments.add(employee.getDepartment()));

        departments.forEach(System.out::println);

        //ExecutorService and Executors with Callable and Future
        ExecutorService executor = Executors.newSingleThreadExecutor();

        Callable<Double> task1 = () -> {

            Thread.sleep(1000);
            return employees.stream().mapToDouble(Employee::getSalary).average().orElse(0.0);

        };

        Callable<Double> task2 = () -> {

            Thread.sleep(1000);
            return highestPaidEmployee.map(Employee::getSalary).orElse(0.0);
        };

        Future<Double> future1 = executor.submit(task1);
        Future<Double> future2 = executor.submit(task2);

        System.out.println("\nTasks Submitted:");

        System.out.println("Task 1 -> " + future1.get());
        System.out.println("Task 2 -> " + future2.get());

        executor.shutdown();
    }
}
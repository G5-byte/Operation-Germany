public class Employee {

    private String name;
    private double salary;

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public void displayInfo() {
        System.out.println("Name: " + getName());
        System.out.println("Salary: " + getSalary());
    }

    public static void main(String[] args) {

        Employee emp1 = new Employee();
        emp1.setName("John Doe");
        emp1.setSalary(50000.0);

        Employee emp2 = new Employee();
        emp2.setName("Jane Smith");
        emp2.setSalary(60000.0);

        emp1.displayInfo();
        System.out.println();
        emp2.displayInfo();
    }


    
}

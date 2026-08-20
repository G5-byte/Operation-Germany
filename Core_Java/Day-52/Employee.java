public class Employee {

    private int id;
    private String name;
    private double salary;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getid() {
        return id;
    }

    public String getname() {
        return name;
    }

    public double getsalary() {
        return salary;
    }

    @Override
    public String toString() {
        return id + "-" + name + "-" + salary;
    }
}
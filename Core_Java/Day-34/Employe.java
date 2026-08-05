public class Employe {

    public void work() {
        System.out.println("Employee is working");
    }
    
}

class Manager extends Employe {

    public void work() {
        System.out.println("Manager is working with the team");
    }

    public static void main(String[] args) {
        Manager manager = new Manager();
        manager.work();
        Employe employee = new Employe();
        employee.work();
    }
}

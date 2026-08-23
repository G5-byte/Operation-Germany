import java.util.List;
import java.util.Arrays;
import java.time.LocalDate;

class Task {
    
    private String name;
    private LocalDate deadline;

    Task(String name, LocalDate deadline) {
        this.name = name;
        this.deadline = deadline;
    }

    public String getname() { return name; }
    public LocalDate getdeadline() { return deadline;}

    public String toString() {
        return name + "-" + deadline;
    }
}

class TaskManager {
    public static void main(String[] args) {

        List<Task> tasks = Arrays.asList(new Task(
                        "Learn Java",
                        LocalDate.of(2026, 8, 20)
                ),
                new Task(
                        "Practice DSA",
                        LocalDate.of(2026, 8, 25)
                ),
                new Task(
                        "Learn Spring Boot",
                        LocalDate.of(2026, 9, 5)
                ),
                new Task(
                        "Build Project",
                        LocalDate.of(2026, 9, 10)
                ),
                new Task("Deploy Projects",
                        LocalDate.of(2026, 10, 15)
                    ));
    
    LocalDate today = LocalDate.now();   
    System.out.println("All tasks : ");
    tasks.forEach(System.out::println);

    System.out.println();

    System.out.println("Future tasks : ");
    tasks.stream().filter(task -> task.getdeadline().isAfter(today))
                  .forEach(System.out::println);

    
    System.out.println();

    System.out.println("Sort tasks by their deadline : ");
    tasks.stream()
         .sorted((t1, t2) -> t1.getdeadline().compareTo(t2.getdeadline()))
         .forEach(System.out::println);


    System.out.println();

    System.out.println("Task of the earliest deadline : ");
    tasks.stream()
         .min((t1, t2) -> t1.getdeadline().compareTo(t2.getdeadline()))
         .ifPresent(System.out::println);   
         
         
    System.out.println();

    System.out.println("Task of the final deadline : ");
    tasks.stream()
         .max((t1, t2) -> t1.getdeadline().compareTo(t2.getdeadline()))
         .ifPresent(System.out::println);
    }

}

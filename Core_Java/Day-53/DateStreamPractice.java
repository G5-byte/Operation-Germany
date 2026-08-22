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
    public LocalDate getLocalDate() { return deadline; }

    public String toString() {
        return name + "-" + deadline;
    }
    
}

class DateStreamPractice {
    public static void main(String[] args) {

        List<Task> tasks = Arrays.asList( new Task(
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
                ));


    LocalDate today = LocalDate.now();
    
    tasks.stream().filter(task -> task.getLocalDate().isAfter(today))
         .forEach(System.out::println);    

    }
}

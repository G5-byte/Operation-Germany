import java.util.Optional;

public class OptionalDemo {
    public static void main(String[] args) {
        
        Optional<String> name = Optional.of("Nikhil");

        if(name.isPresent()) {
            System.out.println("Name : " + name.get());
        }

        Optional<Integer> id = Optional.of(101);

        if(id.isPresent()) {
            System.out.println("Id : " + id.get());
        }

        Optional<String> name1 = Optional.empty();

        System.out.println(name1.orElse("Name not found"));
        
    }
    
}

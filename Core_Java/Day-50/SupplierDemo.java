import java.util.function.Supplier;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.UUID;
public class SupplierDemo {
    public static void main(String[] args){

        Supplier<String> stringSupplier = () -> "Working on supplier";
        System.out.println(stringSupplier.get());

        Supplier<LocalDateTime> timeSupplier = () -> LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formattedDateTime = formatter.format(timeSupplier.get());
        System.out.println(formattedDateTime);

        Supplier<UUID> uuidSupplier = () -> UUID.randomUUID();
        System.out.println(uuidSupplier.get());

        // Lazy Initializatin(Deferres Execution)

        boolean cacheHit = true;
        // The expensive operation is defined but NOT executed yet
        Supplier<String> expensiveDataFetcher = () -> {
            System.out.println("Fetching heavy data from DB....");
            return "Database record data";
        };
            // If data is in cache, the supplier's get() method is never called
            if(cacheHit){
                System.out.println("Data retrieved from cache");

            }else{
                System.out.println("Cache miss! " + expensiveDataFetcher.get());
            }
        
    }
    
}

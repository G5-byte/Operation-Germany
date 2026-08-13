import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;

public class BufferedReaderExample {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader("Test.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            System.out.println("Successfully read from 'Test.txt' file");
        } catch (IOException e) {
            System.out.println("An error occurs");
            e.printStackTrace();
        }
    }
}

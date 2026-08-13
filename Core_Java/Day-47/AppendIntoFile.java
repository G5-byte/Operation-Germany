import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedWriter;

public class AppendIntoFile {
    public static void main(String[] args){

        try(BufferedWriter bw = new BufferedWriter(new FileWriter("Test.txt", true))){
            bw.newLine();
            bw.write("Testing Appending the line into file!");
            System.out.println("Successfully append a line into file");

        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
            e.printStackTrace();
        }

    
    
    }
}

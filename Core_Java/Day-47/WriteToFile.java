import java.io.FileWriter;
import java.io.IOException;
public class WriteToFile {
    public static void main(String[] args) {
        
        try(FileWriter myWriter = new FileWriter("Test.txt")){

            myWriter.write("Hello from Nikhil!");
            myWriter.write("\nWorking on File Handliing!");;
            System.out.println("Successfully write into /'Test.txt'/ file");

        }catch(IOException e){
            System.out.println("An exception occurs");
            e.printStackTrace();
        }
    }
    
}

import java.io.FileReader;
import java.io.IOException;
public class ReadFromFile {
    public static void main(String[] args) {
        
        try(FileReader myReader = new FileReader("Test.txt")){

            int character;
            while((character = myReader.read()) != -1){
                System.out.println((char)character);
            }

            System.out.println("Successfully read from 'Test.txt' file");

        }catch(IOException e){
            System.out.println("An error occurs");
            e.printStackTrace();
        }
    }
    
}

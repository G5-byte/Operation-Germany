import java.util.ArrayList;
public class LamdaCollection {
    public static void main(String[] args) {
        
        ArrayList<String> list = new ArrayList<>();

        list.add("Nikhil");
        list.add("Praduem");
        list.add("Rahul");
        list.add("Priya");

        list.forEach(name -> System.out.println(name));
    }
    
}

import java.util.ArrayList;
public class StudentFilter {
    public static void main(String[] args) {
        
        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(40);
        list.add(50);
        list.add(60);
        list.add(70);

        list.forEach((number) -> {
            if(number > 40){
                System.out.println(number);
            }
        });
    }

}
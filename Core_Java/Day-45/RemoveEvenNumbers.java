import java.util.ArrayList;
import java.util.Iterator;
public class RemoveEvenNumbers {
    public static void main(String[] args){

        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(13);
        list.add(15);
        list.add(16);
        list.add(18);
        list.add(20);
        list.add(21);

        System.out.println("The list is as Follows : ");
        System.out.println(list);

        System.out.println();

        Iterator<Integer> Iterator = list.iterator();

        System.out.println("Loop through the list");
        while(Iterator.hasNext()){
            System.out.println(Iterator.next());
        }

        System.out.println();

        System.out.println("Removing Even items from list");
        Iterator<Integer> removIterator = list.iterator();
        while(removIterator.hasNext()){
            int i = removIterator.next();
            if(i%2==0){
                System.out.println("The number " + i + " is Even and removed");
                removIterator.remove();
            }
        }

        System.out.println();

        System.out.println("The list is as follows after removing Even numbers");
        System.out.println(list);

    }
    
}

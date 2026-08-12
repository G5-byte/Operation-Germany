import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
public class IteratorExample {
    public static void main(String[] args){

        ArrayList<String> list = new ArrayList<>();

        list.add("Volvo");
        list.add("BMW");
        list.add("Ford");
        list.add("Mazda");
        list.add("Audi");

        // Get the Iterator
        System.out.println("Getting an Iterator");
        Iterator<String> firstItemIterator = list.iterator();

        // Print the first item
        System.out.println("The first item is : " + firstItemIterator.next());

        System.out.println();

        // Loop through a Collection
        System.out.println("Loop through a collection");
        Iterator<String> it = list.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        System.out.println();

        // Removing items from a collection
        System.out.println("Removing items from a collection");
        Iterator<String> removeIt = list.iterator();
        while(removeIt.hasNext()){
            String i = removeIt.next();
            if(i.length() == 3){
                removeIt.remove();
            }
        }

        System.out.println(list);

        System.out.println();

        // Getting a ListIterator
        System.out.println("Getting a ListIterator");
        ListIterator<String> it2 = list.listIterator();

        // Accessing list items in Forward and backward
        System.out.println("Printing list in Forward");
        while(it2.hasNext()){
            System.out.println(it2.next());
        }

        System.out.println();

        System.out.println("Printing list in Backward");
        while(it2.hasPrevious()){
            System.out.println(it2.previous());
        }


    }
    
}

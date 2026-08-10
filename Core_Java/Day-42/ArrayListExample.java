import java.util.ArrayList;
public class ArrayListExample {
    public static void main(String[] args){
        ArrayList<String> list = new ArrayList<>();

        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        list.add("Date");
        list.add("Elderberry");

        System.out.println("ArrayList: " + list);

        System.out.println();

        // Accessing elements
        System.out.println("Accessing elements:");
        System.out.println("First element: " + list.get(0));
        System.out.println("Second element: " + list.get(1));
        System.out.println("Third element: " + list.get(2));
        System.out.println("Fourth element: " + list.get(3));
        System.out.println("Fifth element: " + list.get(4));

        System.out.println();

        // Iterating through the ArrayList
        System.out.println("Iterating through the ArrayList:");
        for(String fruit : list){
            System.out.println(fruit);
        }

        System.out.println();

        // Removing an element
        System.out.println("Removing an element:");
        list.remove("Date");
        System.out.println("Element removed.");

        // list after removing an element
        System.out.println("ArrayList after removing 'Date': ");
        System.out.println("ArrayList after removing 'Date': " + list);

        System.out.println();

        // Checking if an element exists
        System.out.println("Checking if an element exists:");
        if(list.contains("Banana")){
            System.out.println("Banana is in the list.");
        } else {
            System.out.println("Banana is not in the list.");
        }

        System.out.println();

        // Getting the size of the ArrayList
        System.out.println("Getting the size of the ArrayList:");
        System.out.println("Size of the ArrayList: " + list.size());

        System.out.println();

        // updating an element
        System.out.println("Updating an element:");
        list.set(1, "Blueberry");
        System.out.println("ArrayList after updating the second element: " + list);

        System.out.println();

        // Clearing the ArrayList
        System.out.println("Clearing the ArrayList:");
        list.clear();
        System.out.println("ArrayList after clearing: " + list);





    }
    
}

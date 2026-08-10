import java.util.LinkedList;
public class LinkedListExample {
    public static void main(String[] args){
        LinkedList<String> list = new LinkedList<>();

        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        list.add("Date");
        list.add("Elderberry");

        System.out.println("LinkedList: " + list);
        System.out.println();

        list.addFirst("Fig");
        list.addLast("Grape");
        list.getFirst();
        list.getLast();

        System.out.println();

        // Accessing elements
        System.out.println("Accessing elements:");
        System.out.println("First element: " + list.get(0));
        System.out.println("Second element: " + list.get(1));
        System.out.println("Third element: " + list.get(2));
        System.out.println("Fourth element: " + list.get(3));
        System.out.println("Fifth element: " + list.get(4));
        System.out.println("Sixth element: " + list.get(5));
        System.out.println("Seventh element: " + list.get(6));

        System.out.println();

        // Iterating through the LinkedList
        System.out.println("Iterating through the LinkedList:");
        for(String fruit : list){
            System.out.println(fruit);
        }

        System.out.println();

        // Removing an element
        System.out.println("Removing an element:");
        list.removeFirst();
        list.removeLast();
        list.remove("Date");
        System.out.println("Element removed.");

        // list after removing an element
        System.out.println("LinkedList after removing 'Few Elements': ");
        System.out.println("LinkedList after removing 'Few Elements': " + list);

        System.out.println();

        // Checking if an element exists
        System.out.println("Checking if an element exists:");
        if(list.contains("Banana")){
            System.out.println("Banana is in the list.");
        } else {
            System.out.println("Banana is not in the list.");
        }

        System.out.println();

        // Getting the size of the LinkedList
        System.out.println("Getting the size of the LinkedList:");
        System.out.println("Size of the LinkedList: " + list.size());

        System.out.println();

       // updating an element
        System.out.println("Updating an element:");
        list.set(1, "Blueberry");
        System.out.println("LinkedList after updating the second element: " + list);

        System.out.println();

        // Clearing the LinkedList
        System.out.println("Clearing the LinkedList:");
        list.clear();
        System.out.println("LinkedList after clearing: " + list);

    }    
    
}

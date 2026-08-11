import java.util.LinkedHashSet;
public class LinkedHashSetExample{
    public static void main(String[] args){

        LinkedHashSet<String> set = new LinkedHashSet<>();

        set.add("Apple");
        set.add("Banana");
        set.add("Cherry");
        set.add("Date");
        set.add("Elderberry");

        System.out.println("LinkedHashSet:" + set);

        // Accessing elements
        System.out.println("Accessing elements:");
        for(String fruit : set){
            System.out.println(fruit);
        }

        System.out.println();

        // Removing an element
        System.out.println("Removing an element:");
        set.remove("Date");
        System.out.println("Element removed.");

        // set after removing an element
        System.out.println("LinkedHashSet after removing 'Date': " + set);

        System.out.println();

        // Checking if an element exists
        System.out.println("Checking if an element exists:");
        if(set.contains("Banana")){
            System.out.println("Banana is in the set.");
        } else {
            System.out.println("Banana is not in the set.");
        }

        System.out.println();

        // Iterating through the LinkedHashSet
        System.out.println("Iterating through the LinkedHashSet:");
        for(String fruit : set){
            System.out.println(fruit);
        }

        System.out.println();

        //Updating an element
        System.out.println("Updating an element:");
        if(set.contains("Cherry")){
            set.remove("Cherry");
            set.add("Coconut");
            System.out.println("Element updated.");
        } else {
            System.out.println("Element not found.");
        }

        System.out.println();

        // set after updating an element
        System.out.println("LinkedHashSet after updating 'Cherry' to 'Coconut': " +set);

        System.out.println();

        // Getting the size of the LinkedHashSet
        System.out.println("Getting the size of the LinkedHashSet:");
        System.out.println("Size of the LinkedHashSet: " + set.size());

        System.out.println();

        // Clearing the LinkedHashSet
        System.out.println("Clearing the LinkedHashSet:");
        set.clear();
        System.out.println("LinkedHashSet cleared. Size of the LinkedHashSet: " + set.size());

    }
}
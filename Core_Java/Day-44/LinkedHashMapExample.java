import java.util.LinkedHashMap;
public class LinkedHashMapExample {
    public static void main(String[] args) {
        LinkedHashMap<String, String> map = new LinkedHashMap<>();

        map.put("England", "London");
        map.put("India", "New Delhi");
        map.put("Austria", "Wien");
        map.put("Norway", "Oslo");
        map.put("Norway", "Oslo"); // Duplicate
        map.put("USA", "Washington DC");

        System.out.println(map);

        System.out.println();

        //Accessing items from LinkedHashMap
        System.out.println("Accessing items from LinkedHashMap");
        System.out.println("Value of England : " + map.get("England"));
        System.out.println("Value of India : " + map.get("India"));
        System.out.println("Value of Austria : " + map.get("Austria"));
        System.out.println("Value of Norway : " + map.get("Norway"));
        System.out.println("Value of USA : " + map.get("USA"));

        System.out.println();

        //Removing an item from LinkedHashMap
        System.out.println("Removing an item from LinkedHashMap");
        map.remove("India");
        System.out.println("Item removed");
        System.out.println("LinkedHashMap after removing India:" + map);

        System.out.println();

        //Loop through the LinkedHashMap to access Keys and Value both
        System.out.println("Iterating through the map");
        for(String i : map.keySet()){
            System.out.println("Keys : " + (i) + " Values : " + map.get(i));
        }

        System.out.println();

        //Checking if LinkedHashMap contains a particular key, value or not
        System.out.println("Chacking if a Key, value Exists or not");
        if(map.containsKey("England")){
            if(map.containsValue("London")){
                System.out.println("London as value is in the map");
            }else{
                System.out.println("London is not in the map");
            }
            System.out.println("England is in the map as Key");
        }else{
            System.out.println("Key England is not in the map");
        }

        System.out.println();

        //Getting the Size of the LinkedHashMap
        System.out.println("The Size of the LinkedHashMap : " + map.size());

        System.out.println();

        //Clearing the map
        map.clear();
        System.out.println("Clearing the map : " + map);
    }

}

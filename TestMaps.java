import java.util.*;

/**
 *
 * @author Gyuseok
 */
public class TestMaps {
    public static void main(String[] args) {
        // Create a HashMap
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Gyu", 28);
        hashMap.put("Sam", 25);
        hashMap.put("Alice", 30);
        hashMap.put("Robert", 29);
        hashMap.put("Jack", 28);

        System.out.println("Display entries in HashMap");
        System.out.println(hashMap + "\n");

        // Create a TreeMap
        Map<String, Integer> treeMap = new TreeMap<>(hashMap);
        System.out.println("Display entries in ascending order of key (TreeMap)");
        System.out.println(treeMap);

        // Create a LinkedHashMap
        Map<String, Integer> linkedHashMap = new LinkedHashMap<>(16, 0.75f, true);
        linkedHashMap.put("Gyu", 28);
        linkedHashMap.put("Sam", 25);
        linkedHashMap.put("Alice", 30);
        linkedHashMap.put("Robert", 29);
        linkedHashMap.put("Jack", 28);

        // Display the age for Lewis
        System.out.println("\nThe age for " + "Gyu is " + linkedHashMap.get("Gyu"));
        System.out.println("Display entries in LinkedHashMap");
        System.out.println(linkedHashMap);
    }
}

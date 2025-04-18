import java.util.HashMap;
public class HashMapEg {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();

        // Adding key-value pairs
        map.put(1, "Apple");
        map.put(2, "Banana");
        map.put(3, "Cherry");
        map.put(1, "Mango"); // Overwrites the value for key 1

        System.out.println(map.containsKey("Apple"));
        System.out.println("HashMap: " + map); // Order is unpredictable
        System.out.println("Value for key 2: " + map.get(2)); // Retrieves "Banana"
        for (String i : map.values()) {
            System.out.println(i);
        }
        for (var i : map.entrySet()) {
            System.out.println(i.getValue());
        }
        for (var i : map.entrySet()) {
            System.out.println(i.getKey());
        }
    }
}

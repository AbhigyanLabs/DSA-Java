import java.util.*;
class hashmap {
    public static void main(String[] args) {

        HashMap<Integer, String> map = new HashMap<>();

        map.put(1, "A");
        map.put(2, "B");
        map.put(3, "C");

        System.out.println(map.get(1));
        System.out.println(map.containsKey(2));
        System.out.println(map.containsValue("C"));
        System.out.println(map.size());

        map.put(2, "BB");
        map.remove(3);
        map.remove(1, "A");

        for (Integer key : map.keySet()) {
            System.out.println(key);
        }

        for (String value : map.values()) {
            System.out.println(value);
        }

        for (Map.Entry<Integer, String> e : map.entrySet()) {
            System.out.println(e.getKey() + " -> " + e.getValue());
        }

        map.clear();

        System.out.println(map.isEmpty());
    }
}

import java.util.*;
class DATADisplay
{
    public static void main(String[] args) {
        Map<String, Integer> map=new HashMap<>();
        //Adding values
        map.put("Akash", 21);
        map.put("Yash", 16);
        map.put("Lav", 17);
        map.put("Rishika", 19);
        map.put("Harry", 18);
        //Getting value of key from hashmap
        System.out.println(map.get("Yash"));
        System.out.println(map.get("Rahul"));
        //changing or updating the values in a hash map
        map.put("Akash",25);
        System.out.println(map.get("Akash"));
        System.out.println(map.remove("Akash"));
        System.out.println(map.remove("Abhigyan"));
        System.out.println(map.containsKey("Akash"));
        System.out.println(map.containsKey("Yash"));
        if(!map.containsKey("Yash")) map.put("Yash", 30);
        map.putIfAbsent("Yash", 30);
        map.putIfAbsent("Yashika", 30);
        System.out.println(map.keySet());
        System.out.println(map.values());
        System.out.println(map.entrySet());

        for(String key : map.keySet()){
            System.out.printf("Age of %s is %d\n", key, map.get(key));
        }
        System.out.println();
        for(Map.Entry<String,Integer> e: map.entrySet()) {
            System.out.printf("Age of %s is %d\n", e.getKey(), e.getValue());
        }
    }
}
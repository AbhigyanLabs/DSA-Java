import java.util.HashSet;
public class HashSetEg {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();

        set.add("Apple");
        set.add("Banana");
        set.add("Cherry");
        set.add("Apple"); // Duplicate, ignored

        System.out.println("HashSet: " + set);
        set.remove(set);
        System.out.println(set.contains(2));
        System.out.println(set.size());
    }
}
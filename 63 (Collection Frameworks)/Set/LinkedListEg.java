import java.util.*;
public class LinkedListEg {
    public static void main(String[] args) {
        LinkedHashSet<Integer> set = new LinkedHashSet<>();

        // Adding elements
        set.add(30);
        set.add(10);
        set.add(20);
        set.add(40);

        System.out.println("LinkedHashSet: " + set); // Maintains insertion order

        // Finding and removing the smallest element
        Integer min = findMin(set);
        if (min != null) {
            set.remove(min);
            System.out.println("Removed: " + min);
        }

        System.out.println("Remaining Set: " + set);
    }

    // Function to find the minimum element in LinkedHashSet
    private static Integer findMin(LinkedHashSet<Integer> set) {
        if (set.isEmpty()) return null;
        Iterator<Integer> it = set.iterator();
        Integer min = it.next();
        while (it.hasNext()) {
            Integer current = it.next();
            if (current < min) {
                min = current;
            }
        }
        return min;
    }
}
package List;
import java.util.ArrayList;
import java.util.Collections;

public class ArrayListEg {
    public static void main(String[] args) {
        // 1. Creating an ArrayList
        ArrayList<String> list = new ArrayList<>();
        System.out.println("ArrayList Created: " + list);

        // 2. Adding elements
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        System.out.println("After adding elements: " + list);

        // 3. Adding at a specific index
        list.add(1, "Blueberry");
        System.out.println("After adding at index 1: " + list);

        // 4. Accessing elements
        System.out.println("Element at index 2: " + list.get(2));

        // 5. Updating an element
        list.set(1, "Blackberry");
        System.out.println("After updating index 1: " + list);

        // 6. Removing by index
        list.remove(2);
        System.out.println("After removing index 2: " + list);

        // 7. Removing by value
        list.remove("Apple");
        System.out.println("After removing 'Apple': " + list);

        // 8. Getting size
        System.out.println("Size of ArrayList: " + list.size());

        // 9. Checking if an element exists
        System.out.println("Contains 'Cherry': " + list.contains("Cherry"));

        // 10. Checking if the list is empty
        System.out.println("Is empty: " + list.isEmpty());

        // 11. Clearing all elements
        list.clear();
        System.out.println("After clearing: " + list);

        // 12. Re-adding elements for further operations
        list.add("Dog");
        list.add("Cat");
        list.add("Elephant");
        list.add("Cat");
        System.out.println("Re-added elements: " + list);

        // 13. Iterating using forEach
        System.out.println("Using forEach loop:");
        list.forEach(System.out::println);

        // 14. Finding index of an element
        System.out.println("Index of 'Cat': " + list.indexOf("Cat"));

        // 15. Finding last occurrence
        System.out.println("Last index of 'Cat': " + list.lastIndexOf("Cat"));

        // 16. Sorting the list
        Collections.sort(list);
        System.out.println("After sorting: " + list);

        // 17. Getting a sublist
        ArrayList<String> subList = new ArrayList<>(list.subList(1, 3));
        System.out.println("Sublist (1 to 3): " + subList);

        // 18. Converting to an array
        String[] arr = list.toArray(new String[0]);
        System.out.println("Array elements:");
        for (String s : arr) {
            System.out.println(s);
        }

        // 19. Cloning the ArrayList
        ArrayList<String> clonedList = (ArrayList<String>) list.clone();
        System.out.println("Cloned list: " + clonedList);

        // 20. Retaining only specific elements
        ArrayList<String> otherList = new ArrayList<>();
        otherList.add("Cat");
        otherList.add("Dog");
        list.retainAll(otherList);
        System.out.println("After retainAll with {Cat, Dog}: " + list);

        // 21. Removing all occurrences of another list
        list.removeAll(otherList);
        System.out.println("After removeAll with {Cat, Dog}: " + list);
    }
}
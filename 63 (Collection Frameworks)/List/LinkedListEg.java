import java.util.LinkedList;
import java.util.Collections;

public class LinkedListEg {
    public static void main(String[] args) {
        // 1. Creating a LinkedList
        LinkedList<String> list = new LinkedList<>();
        System.out.println("LinkedList Created: " + list);

        // 2. Adding elements
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        System.out.println("After adding elements: " + list);

        // 3. Adding at a specific index
        list.add(1, "Blueberry");
        System.out.println("After adding at index 1: " + list);

        // 4. Adding first and last elements
        list.addFirst("Mango");
        list.addLast("Pineapple");
        System.out.println("After addFirst and addLast: " + list);

        // 5. Accessing elements
        System.out.println("First element: " + list.getFirst());
        System.out.println("Last element: " + list.getLast());
        System.out.println("Element at index 2: " + list.get(2));

        // 6. Updating an element
        list.set(1, "Blackberry");
        System.out.println("After updating index 1: " + list);

        // 7. Removing by index
        list.remove(2);
        System.out.println("After removing index 2: " + list);

        // 8. Removing by value
        list.remove("Apple");
        System.out.println("After removing 'Apple': " + list);

        // 9. Removing first and last elements
        list.removeFirst();
        list.removeLast();
        System.out.println("After removeFirst and removeLast: " + list);

        // 10. Getting size
        System.out.println("Size of LinkedList: " + list.size());

        // 11. Checking if an element exists
        System.out.println("Contains 'Cherry': " + list.contains("Cherry"));

        // 12. Checking if the list is empty
        System.out.println("Is empty: " + list.isEmpty());

        // 13. Clearing all elements
        list.clear();
        System.out.println("After clearing: " + list);

        // 14. Re-adding elements for further operations
        list.add("Dog");
        list.add("Cat");
        list.add("Elephant");
        list.add("Cat");
        System.out.println("Re-added elements: " + list);

        // 15. Iterating using forEach
        System.out.println("Using forEach loop:");
        list.forEach(System.out::println);

        // 16. Finding index of an element
        System.out.println("Index of 'Cat': " + list.indexOf("Cat"));

        // 17. Finding last occurrence
        System.out.println("Last index of 'Cat': " + list.lastIndexOf("Cat"));

        // 18. Sorting the list
        Collections.sort(list);
        System.out.println("After sorting: " + list);

        // 19. Getting a sublist
        LinkedList<String> subList = new LinkedList<>(list.subList(1, 3));
        System.out.println("Sublist (1 to 3): " + subList);

        // 20. Converting to an array
        String[] arr = list.toArray(new String[0]);
        System.out.println("Array elements:");
        for (String s : arr) {
            System.out.println(s);
        }

        // 21. Cloning the LinkedList
        LinkedList<String> clonedList = (LinkedList<String>) list.clone();
        System.out.println("Cloned list: " + clonedList);

        // 22. Retaining only specific elements
        LinkedList<String> otherList = new LinkedList<>();
        otherList.add("Cat");
        otherList.add("Dog");
        list.retainAll(otherList);
        System.out.println("After retainAll with {Cat, Dog}: " + list);

        // 23. Removing all occurrences of another list
        list.removeAll(otherList);
        System.out.println("After removeAll with {Cat, Dog}: " + list);
    }
}

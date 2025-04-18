import java.util.*;

public class DequeExample {
    public static void main(String[] args) {
        Deque<Integer> dq = new ArrayDeque<>();  // Using ArrayDeque (Fast and efficient)

        // Insert elements at the back
        dq.addLast(10);
        dq.addLast(20);
        dq.addLast(30);
        System.out.println("Deque after addLast: " + dq); // Output: [10, 20, 30]

        // Insert elements at the front
        dq.addFirst(5);
        dq.addFirst(1);
        System.out.println("Deque after addFirst: " + dq); // Output: [1, 5, 10, 20, 30]

        // Access front and back
        System.out.println("Front element: " + dq.getFirst()); // Output: 1
        System.out.println("Back element: " + dq.getLast()); // Output: 30

        // Remove elements from front and back
        dq.removeFirst();
        System.out.println("Deque after removeFirst: " + dq); // Output: [5, 10, 20, 30]

        dq.removeLast();
        System.out.println("Deque after removeLast: " + dq); // Output: [5, 10, 20]

        // Check if deque contains an element
        System.out.println("Deque contains 10? " + dq.contains(10)); // Output: true

        // Get size of deque
        System.out.println("Size of deque: " + dq.size()); // Output: 3

        // Remove all elements
        dq.clear();
        System.out.println("Deque after clear(): " + dq.isEmpty()); // Output: true
    }
}

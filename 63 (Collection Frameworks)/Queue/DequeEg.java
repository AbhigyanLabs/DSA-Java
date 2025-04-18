import java.util.Deque;
import java.util.ArrayDeque;

public class DequeEg {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();

        // Adding elements at both ends
        deque.addFirst(10);
        deque.addLast(20);
        deque.addFirst(5);

        System.out.println("Deque: " + deque); // [5, 10, 20]

        // Removing elements
        System.out.println("Removed First: " + deque.removeFirst()); // 5
        System.out.println("Removed Last: " + deque.removeLast()); // 20

        System.out.println("Final Deque: " + deque); // [10]
    }
}
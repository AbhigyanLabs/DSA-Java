import java.util.LinkedList;

public class LinkedListEg {
    public static void main(String[] args) {
        LinkedList<String> queue = new LinkedList<>();

        // Adding elements to the queue
        queue.offer("Apple");
        queue.add("Banana");
        queue.add("Cherry");

        // Printing queue
        System.out.println("Queue: " + queue);
        System.out.println(queue.poll());
        System.out.println(queue.peek());
        // Removing elements
        System.out.println("Removed: " + queue.poll()); // Removes "Apple"
        System.out.println("Front element: " + queue.peek()); // "Banana"

        System.out.println("Queue after poll: " + queue);
    }
}
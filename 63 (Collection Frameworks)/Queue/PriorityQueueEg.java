import java.util.Comparator;
import java.util.PriorityQueue;
public class PriorityQueueEg {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder()); // Min-Heap (default)

        pq.add(30);
        pq.add(10);
        pq.add(20);
        pq.add(40);

        System.out.println("PriorityQueue: " + pq); // Order in queue may not be sorted
        //Min ele has the highest priority.
        // Removing elements (smallest first)
        System.out.println("Removed: " + pq.poll()); // 10
        System.out.println("Removed: " + pq.poll()); // 20
        System.out.println("Remaining Queue: " + pq);
    }
}
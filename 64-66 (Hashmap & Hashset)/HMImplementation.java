// Node class representing each entry in the HashMap (linked list node)
class Node {
    int key;
    String value;
    Node next;

    // Constructor to initialize a key-value pair
    public Node(int key, String value) {
        this.key = key;
        this.value = value;
        this.next = null;
    }
}

// Custom implementation of a HashMap using separate chaining
class MyHashMap {
    private Node[] buckets;    // Array of linked lists (buckets)
    private int capacity;      // Size of the hash table
    private int size;          // Total number of key-value pairs
    private final double LOAD_FACTOR = 0.75; // Max load factor before rehashing

    // Constructor to initialize the hash table with a given capacity
    public MyHashMap(int capacity) {
        this.capacity = capacity;
        buckets = new Node[capacity];
        size = 0;
    }

    // Hash function to calculate index from key
    private int hash(int key) {
        return key % capacity;
    }

    // Insert or update a key-value pair
    public void put(int key, String value) {
        int index = hash(key); // Get index using hash function
        Node head = buckets[index];

        // Check if key already exists — update value if found
        while (head != null) {
            if (head.key == key) {
                head.value = value; // Update existing key
                return;
            }
            head = head.next;
        }

        // Insert new node at the beginning of the linked list
        Node newNode = new Node(key, value);
        newNode.next = buckets[index];
        buckets[index] = newNode;
        size++;

        // If load factor exceeded, double the size and rehash
        if ((1.0 * size) / capacity > LOAD_FACTOR) {
            rehash();
        }
    }

    // Retrieve value by key
    public String get(int key) {
        int index = hash(key);
        Node head = buckets[index];

        // Traverse the linked list to find the key
        while (head != null) {
            if (head.key == key) {
                return head.value; // Key found
            }
            head = head.next;
        }

        return null; // Key not found
    }

    // Remove a key-value pair
    public void remove(int key) {
        int index = hash(key);
        Node head = buckets[index];
        Node prev = null;

        // Traverse and unlink the node with the given key
        while (head != null) {
            if (head.key == key) {
                if (prev == null) {
                    // Removing head node
                    buckets[index] = head.next;
                } else {
                    prev.next = head.next;
                }
                size--;
                return;
            }
            prev = head;
            head = head.next;
        }
    }

    // Rehash: Double the capacity and reinsert all key-value pairs
    private void rehash() {
        Node[] oldBuckets = buckets;
        capacity *= 2; // Double the table size
        buckets = new Node[capacity];
        size = 0;

        // Reinsert all existing keys into the new table
        for (Node headNode : oldBuckets) {
            while (headNode != null) {
                put(headNode.key, headNode.value); // Re-insert using put()
                headNode = headNode.next;
            }
        }
    }

    // Display the entire hash map contents
    public void display() {
        System.out.println("Current HashMap:");
        for (int i = 0; i < capacity; i++) {
            System.out.print("Bucket " + i + ": ");
            Node head = buckets[i];
            while (head != null) {
                System.out.print("[" + head.key + " = " + head.value + "] → ");
                head = head.next;
            }
            System.out.println("null");
        }
        System.out.println();
    }
}

// Main class to run and test the custom HashMap
public class HMImplementation {
    public static void main(String[] args) {
        // Create a custom HashMap with initial capacity of 5
        MyHashMap map = new MyHashMap(5);

        // Insert key-value pairs
        map.put(1, "Apple");
        map.put(6, "Banana");
        map.put(11, "Cherry");
        map.put(2, "Date");
        map.put(3, "Elderberry");

        // Display all key-value pairs
        map.display();

        // Retrieve a value
        System.out.println("Value at key 6: " + map.get(6));

        // Remove a key
        System.out.println("Removing key 6...");
        map.remove(6);
        map.display();

        // Trigger rehash by adding more items
        map.put(7, "Fig");
        map.put(12, "Grapes");
        map.display();
    }
}
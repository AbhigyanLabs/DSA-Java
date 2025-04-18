class Basic 
{
    
    // Function to display the Linked List
    public static void display(Node head) {
        if (head == null) return;
        System.out.print(head.data + " ");
        display(head.next);
    }

    // Function to display the Linked List in reverse order
    public static void displayrev(Node head) {
        if (head == null) return;
        displayrev(head.next);
        System.out.print(head.data + " ");
    }

    // Function to insert a node at the end of the Linked List
    public static Node insertAtEnd(Node head, int val) {
        Node temp = new Node(val);

        // If the list is empty, return the new node as the head
        if (head == null) {
            return temp;
        }

        Node t = head;
        while (t.next != null) {
            t = t.next;
        }

        t.next = temp;
        return head; // Return updated head
    }

    // Function to delete a node at a given index
    public static Node delete(Node head, int idx) {
        if (head == null) {
            System.out.println("Empty list.");
            return null;
        }

        // Deleting head node
        if (idx == 0) {
            return head.next; // Return the new head
        }

        Node temp = head;
        for (int i = 0; i < idx - 1; i++) {
            if (temp == null || temp.next == null) { // Prevents NullPointerException
                System.out.println("Index out of bounds.");
                return head;
            }
            temp = temp.next;
        }

        if (temp.next == null) {
            System.out.println("Index out of bounds.");
            return head;
        }

        temp.next = temp.next.next; // Deletes the node
        return head; // Return updated head
    }

    // Node class representing each element of the linked list
    public static class Node {
        int data;  // Data stored in the node
        Node next; // Pointer to the next node

        // Constructor to initialize a node with data
        Node(int data) {
            this.data = data;
        }
    }

    public static void main(String[] args) {
        // Creating nodes with values
        Node a = new Node(5);
        Node b = new Node(3);
        Node c = new Node(6);
        Node d = new Node(8);
        Node e = new Node(9);

        // Linking nodes to form the linked list
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;

        // Display the linked list
        System.out.print("Original List: ");
        display(a);
        System.out.println();

        // Display the linked list in reverse order
        System.out.print("Reversed List: ");
        displayrev(a);
        System.out.println();

        // Inserting a new node at the end
        a = insertAtEnd(a, 10);
        System.out.print("List after inserting 10 at the end: ");
        display(a);
        System.out.println();

        // Deleting the head node
        a = delete(a, 0);
        System.out.print("List after deleting head node: ");
        display(a);
        System.out.println();

        // Deleting a node at index 2
        a = delete(a, 2);
        System.out.print("List after deleting node at index 2: ");
        display(a);
        System.out.println();
    }
}
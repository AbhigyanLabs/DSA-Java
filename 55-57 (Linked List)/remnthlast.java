class remnthlast {

    public static void display(Node head)  // Method to display the linked list
    {
        Node temp = head;
        while(temp != null)
        {
            System.out.print(temp.data + " "); // Print current node data
            temp = temp.next; // Move to the next node
        }
    }

    // Node class to represent each element in the linked list
    public static class Node
    {
        Node next; // Pointer to the next node
        int data;  // Data stored in the node

        // Constructor to initialize node with data
        Node(int data) 
        {
            this.data = data;
        }
    }

    // Method to remove the nth node from the end of the linked list
    public static Node lastrem(int n, Node head)
    {
        Node slow = head; // Slow pointer
        Node fast = head; // Fast pointer

        // Move fast pointer n steps ahead
        for(int i = 0; i < n; i++)
        {
            if(fast == null) return head; // If n is greater than the length, return unchanged list
            fast = fast.next;
        }

        // If fast becomes null, it means we need to remove the head
        if(fast == null) return head.next;

        // Move both pointers until fast reaches the last node
        while(fast.next != null)
        {
            slow = slow.next;
            fast = fast.next;
        }

        // Remove the nth node from the end
        slow.next = slow.next.next;

        return head; // Return the updated head of the list
    }

    public static void main(String[] args) 
    {
        // Creating a linked list: 1 -> 2 -> 3 -> 4 -> 5
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;

        // Display the original list
        display(a);

        // Remove the 5th node from the end (which is the head node in this case)
        a = lastrem(5, a);
        
        System.out.println();

        // Display the updated list after removal
        display(a);
    }
}
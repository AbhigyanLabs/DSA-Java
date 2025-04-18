    class SinglyLinkedList 
    {
        // Node class represents a single element in the linked list
        public static class Node 
        {
            int data;  // Data stored in the node
            Node next; // Pointer to the next node
    
            // Constructor to initialize a node with data
            Node(int data) 
            {
                this.data = data;
            }
        }
    
        // Linked list class to manage the linked list operations
        public static class linkedlist 
        {
            Node head = null; // Head pointer to the first node
            Node tail = null; // Tail pointer to the last node
            int size=0;

            // Method to display all elements of the linked list
            void display()
            {
                Node temp = head; // Start from the head node
                while(temp != null) // Traverse through the list
                {
                    System.out.print(temp.data + " "); // Print the data of each node
                    temp = temp.next; // Move to the next node
                }
                System.out.println(); // Print a new line after displaying all elements
            }
      
            // Method to calculate the length of the linked list
            int length()
            {
                int count = 0;
                Node temp = head; // Start from the head node
                while(temp != null) // Traverse until the end
                {
                    count++; // Increment counter for each node
                    temp = temp.next; // Move to the next node
                }
                return count; // Return the total count of nodes
            }
    
            // Method to insert a node at the end of the linked list
            void insertAtEnd(int data)
            {
                Node temp = new Node(data); // Create a new node
    
                if(head == null) // If the list is empty
                {
                    head = temp; // Set both head and tail to the new node
                    tail = temp;
                }
                else
                {
                    tail.next = temp; // Link the last node to the new node
                    tail = temp; // Update tail to the newly inserted node
                }
                size++;
            }

            // Method to insert a new node at the beginning (head) of the linked list
            void insertAtHead(int data) 
            {
                Node temp = new Node(data); // Create a new node with the given data

                if (head == null) // If the list is empty
                {
                    head = temp; // Set head to the new node
                    tail = temp; // Since it's the only node, tail also points to it
                } 
                else 
                {
                    temp.next = head; // Link the new node to the current head
                    head = temp; // Update head to point to the new node
                }
                size++;
            }
            
            void insert(int idx, int val)
            {
                 Node t = new Node(val);
                 Node temp = head;

                if(idx == 0)
                {
                    insertAtHead(val);
                    return;
                }
                
                if(idx == length())
                {
                    insertAtEnd(val);
                    return;
                }

                 for(int i=0; i<idx-1 ;i++)
                 {
                    temp = temp.next;
                 }
                 t.next=temp.next;
                 temp.next=t;
                 size++;
            }
            
            int getAt(int idx)
            {
                Node temp = head;
                for(int i=0; i<idx; i++)
                {
                    temp = temp.next;
                }
                return temp.data;
            }
        }
        // Main method to test the linked list implementation
        public static void main(String[] args)
        {
            linkedlist ll = new linkedlist(); // Create a linked list object
            
            ll.insertAtEnd(4); // Insert element 4
            ll.insertAtEnd(5); // Insert element 5
            ll.display();  // Expected Output: 4 5 
    
            System.out.println(ll.length()); // Print the length of the linked list (Expected: 2)
    
            ll.insertAtEnd(85); // Insert element 85
            ll.display();  // Expected Output: 4 5 85

            ll.insertAtHead(4); // Insert element 4
            ll.insertAtHead(8); // Insert element 8
            ll.display(); 

            ll.insert(0,7);
            ll.display();
            System.out.println(ll.tail.data);

            System.out.println(ll.getAt(5));

            System.out.println(ll.size);

            System.out.println(ll.length());
        }
    }
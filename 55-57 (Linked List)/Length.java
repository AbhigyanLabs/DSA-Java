class length
    {
        public static void displayr(Node head)
        {
            if(head == null) return;
            System.out.print(head.data+" ");
            displayr(head.next);
        }

        static int length(Node head)
        {
            Node temp=head;
            int count =0;
            while(temp!=null)
            {
                count++;
                temp=temp.next;
            }
            return count;
        }

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
        public static void main(String[] args) 
        {
            // Creating nodes with values
            Node a = new Node(5);
            Node b = new Node(3);
            Node c = new Node(6);
            Node d = new Node(8);
            Node e = new Node(9);


            a.next = b;
            b.next = c;
            c.next = d;
            d.next = e;

            System.out.println(length(a));
        }
    }
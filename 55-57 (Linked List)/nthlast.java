class nthlast 
{
    public static Node nthNode1(Node head, int n)
    {
        int size=0;
        Node temp=head;
        while(temp!=null)
        {
            size++;
            temp=temp.next;
        }
        int a=size-n+1;
        temp=head;
        for(int i=0; i<a-1; i++)
        {
            temp=temp.next;
        }
        return temp;
    }
    
    public static Node nthNode2(Node head, int n)
    {
        Node slow=head;
        Node fast=head;

        for(int i=0; i<n; i++)
        {
            fast=fast.next;
        }

        while(fast!=null)
        {
            slow=slow.next;
            fast=fast.next;
        }
        return slow;

    }
        
    public static void display(Node head) {
        if (head == null) return;
        System.out.print(head.data + " ");
        display(head.next);
    }

    public static class Node 
    {
        int data;  // Data stored in the node
        Node next; // Pointer to the next node
    
        // Constructor to initialize a node with data
        Node(int data) {
            this.data = data;
        }
    }
    public static void main(String[] args) 
        {
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

        display(a);
        System.out.println();
        Node q=nthNode2(a,1);
        System.out.println(q.data);
        }
    }
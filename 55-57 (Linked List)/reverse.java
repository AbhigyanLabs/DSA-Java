class reverse
{
    static Node Reverse(Node head)
    {
        if (head == null || head.next==null) return head;
        Node NewHead=Reverse(head.next);
        head.next.next=head;
        head.next=null; 
        return NewHead;
    }

    static Node Reverse2(Node head)
    {
        Node agla=null;
        Node curr=head;
        Node prev=null;
        while(curr!=null)
        {
        agla=curr.next;
        curr.next=prev;
        prev=curr;
        curr=agla;
        }
        return prev;
    }

    static void Display(Node head)
    {
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.val+" ");
            temp=temp.next;
        }
    }
    public static class Node
    {
        Node next;
        int val;

        Node(int val)
        {
            this.val=val;
        }
    }
    public static void main(String [] args)
    {
        Node a=new Node(0);
        Node b=new Node(1);
        Node c=new Node(2);
        Node d=new Node(4);
        Node e=new Node(5);
        Node f=new Node(6);

        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;

        System.out.println("The Linked list is:- ");
        Display(a);
        System.out.println();
        System.out.println("Reversed Linked list by Reverse is:");
        Node q=Reverse(a);
        Display(q);
        System.out.println();
        
        // System.out.println("Reversed Linked list by Reverse2 is:");
        // Node w=Reverse(a);
        // Display(w);
    }   
} 
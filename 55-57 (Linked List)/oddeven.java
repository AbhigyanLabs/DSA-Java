class oddeven 
{
    static void Display(Node head)
    {
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.val + " ");
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
    static void Group(Node head)
    {
        if(head==null) return;

        Node eDummy=new Node(0);
        Node oDummy=new Node(0);

        Node odd=oDummy;
        Node even=eDummy;

        Node temp=head;

        while(temp!=null)
        {
            if(temp.val%2==0)
            {
                even.next=temp;
                even=even.next;
            }
            else
            {
                odd.next=temp;
                odd=odd.next;
            }
            temp=temp.next;
        }

        even.next=null;
        odd.next=null;

        System.out.println("Odd List: ");
        Display(oDummy.next);

        System.out.println();
        
        System.out.println("Even List: ");
        Display(eDummy.next);
    }
    public static void main(String[] args)
    {
        Node a=new Node(3);
        Node b=new Node(5);
        Node c=new Node(4);
        Node d=new Node(1);
        Node e=new Node(2);
        Node f=new Node(8);
        Node g=new Node(10);
        Node h=new Node(13);


        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;
        f.next=g;
        g.next=h;

        System.out.println("Original Linked List:");
        Display(a);
        System.out.println();
        Group(a);
    }
}
import java.util.*;
class Insert 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the elements ");
        Stack<Integer> st=new Stack<>();
        int n=sc.nextInt();
        for(int i=0; i<n; i++)
        {
            int x=sc.nextInt();
            st.push(x);
        }
        System.out.println("Enter the element to be inserted at bottom ");
        int e=sc.nextInt();
        System.out.println("Press 1 for bottom insertion ");
        System.out.println("Press 2 for inserting at a particular index ");
        int b=sc.nextInt();

        if(b==1)
        {
        //At bottom
        Stack<Integer> d=new Stack<>();
        for(int i=0; i<n; i++)
        {
            d.push(st.pop());
        }
        st.push(e);
        for(int i=0; i<n; i++)
        {
            st.push(d.pop());
        }
        System.out.println(st);
    }
    else if(b==2)
    {
        //At any point
        Stack<Integer> d=new Stack<>();
        System.out.println("Enter the index ");
        int idx=sc.nextInt();

        for(int i=0; i<idx; i++)
        {
            d.push(st.pop());
        }
        st.push(e);
        for(int i=0; i<idx; i++)
        {
            st.push(d.pop());
        }
        System.out.println(st);
    }
    }
}
import java.util.*;
class Copy 
{
    static Stack Reverse(Stack<Integer> a)
    {
        Stack<Integer> st=new Stack<>();
        while(a.size()>0)
        {
            st.push(a.pop());
        }
        return st;
    }
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        Stack<Integer> st=new Stack<>();
        int n;
        System.out.println("Enter the total stack ele: ");
        n=sc.nextInt();
        System.out.println("Enter the elements ");
        for (int i = 1; i <= n; i++)
        {
            int x=sc.nextInt();
            st.push(x);
        }
        System.out.println("The original elements are "+ st);

        Stack<Integer> copy = new Stack<>();
        for(int i=0; i<n; i++)
        {
            copy.push(st.pop());
        }
        System.out.println("The copied Stack is "+ Reverse(copy));
    }
}
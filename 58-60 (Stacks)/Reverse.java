import java.util.*;
class Reverse 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        Stack<Integer> st=new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        st.push(6);
        System.out.println("The original elements are: ");
        System.out.println(st);
        //Reverse order
        Stack<Integer> rev=new Stack<>();
        while(st.size()>0)
        {
            // int p=st.peek();
            // rev.push(p);
            // st.pop();

            rev.push(st.pop());
        }
        System.out.println("The reversed elements are: ");
        System.out.println(rev);
    }
}

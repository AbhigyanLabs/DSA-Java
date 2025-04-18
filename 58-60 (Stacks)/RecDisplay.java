import java.util.*;
class RecDisplay 
{
    static void PushAtBottom(Stack<Integer> a, int item) {
        if (a.isEmpty()) {
            a.push(item);
            return;
        }
        int top = a.pop();
        PushAtBottom(a, item);
        a.push(top);
    }

    static void RDisplay(Stack<Integer> a)
    {
        if (a.isEmpty()) return;
        {
        int top=a.pop();
        RDisplay(a);
        a.push(top);
        }
    }

    static void Reverse(Stack<Integer> a)
    {
        if (a.isEmpty()) return;
        int top=a.pop();
        Reverse(a);
        PushAtBottom(a,top);
    }
    public static void main(String[] args) 
    {
        Stack<Integer> st=new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println(st);
        Reverse(st);
        System.out.println(st);
    }    
}
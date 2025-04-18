//  Stack underflow occurs when you attempt to pop (remove) an element from an empty stack.
//  Since a stack follows the LIFO (Last In, First Out) principle, removing an element from an
//  empty stack is an invalid operation, leading to an error.
import java.util.*;
class Underflow
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
        st.pop();
        System.out.println(st);
        st.pop();
        System.out.println(st);
        st.pop();
        System.out.println(st);
        st.pop();
        System.out.println(st);
        st.pop();
        System.out.println(st);
        st.pop();
        System.out.println(st);
        //Stack Overflow now
        st.pop();
        System.out.println(st);
    } 
}
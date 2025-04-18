import java.util.*;
class Reorder
{
    public static void main(String[] args) {
        Queue<Integer> q=new LinkedList<>(); 
        {
            q.add(1);
            q.add(2);
            q.add(3);
            q.add(4);
            q.add(5);
            q.add(6);
            q.add(7);
            q.add(8);
            Stack<Integer> st =new Stack<>();
            int half=q.size()/2;

            for(int i=0; i<half; i++){
                st.push(q.remove());
            }

            while(!st.isEmpty()){
                q.add(st.pop());
            }
            for(int i=0; i<half; i++){
                st.push(q.remove());
            }
            while(!st.isEmpty()) {
                q.add(st.pop());
                q.add(q.remove());
            }
            while(!q.isEmpty()) {
                st.push(q.remove());
            }
            while(!st.isEmpty()) {
                q.add(st.pop());
            }
            System.out.println(q);
        }
    }
}
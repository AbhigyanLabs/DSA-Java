import java.util.*;
class Basics
{
    public static void main(String[] args) {
        Queue<Integer> q=new LinkedList<>(); 
        {
            q.add(1);
            q.add(1);
            q.add(1);
            q.add(1);
            q.add(1);
            q.add(1);
            Queue<Integer> helper =new ArrayDeque<>();
            while(q.size()>0) {
                System.out.print(q.peek()+" ");
                helper.add(q.poll());
            }
            while(helper.size()>0) {
                q.add(helper.poll());
            }
        }
    }
}
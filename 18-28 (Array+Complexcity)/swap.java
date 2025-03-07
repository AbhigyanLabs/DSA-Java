import java.util.*;
public class swap 
{
    //using a temporary variable.
    static void swap(int x,int y)
    {
        System.out.println("value before swap");
        System.out.println("a = "+ x);
        System.out.println("b = "+ y);
        int temp=x;
        x=y;
        y=temp;
        System.out.println("value after swap");
        System.out.println("a = "+ x);
        System.out.println("b = "+ y);
    }
    //without using a temporary variable.
    static void swap2(int a,int b)
    {
        System.out.println("value before swap");
        System.out.println("a = "+ a);
        System.out.println("b = "+ b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("value After swap");
        System.out.println("a = "+ a);
        System.out.println("b = "+ b);
    }
    //function calling
    public static void main(String[] args)
    {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first element");
        int a=sc.nextInt();
        System.out.println("Enter the second element");
        int b = sc.nextInt();
        swap(a,b);
        swap2(a, b);
    }        
}
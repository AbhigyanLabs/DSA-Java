import java.util.*;
class swap {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("A = "+a);
        System.out.println("B = "+b);

        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("After swap: A= "+ a);
        System.out.println("After swap: B= "+ b);
    }
}
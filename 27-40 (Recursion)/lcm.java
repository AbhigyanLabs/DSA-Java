import java.util.*;
class lcm
{
    static int GCD(int x,int y)
    {
        if(y==0) return x;
        return GCD(y ,x%y);
    }

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the numbers");
        int x=sc.nextInt();
        int y=sc.nextInt();
        int lcm=(x*y)/GCD(x,y);
        System.out.println(lcm);
    }
}
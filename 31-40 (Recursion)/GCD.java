import java.util.*;
class GCD
{
    static int IGCD(int x,int y)
    {
        while(x%y!=0)
        {
            int rem = x%y;
            x=y;
            y=rem;
        }
        return y;
    }

    static int GCD(int x,int y)
    {
        if(y==0) return x;
        return GCD(y ,x%y);
    }

    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number");
        int x=sc.nextInt();
        int y=sc.nextInt();
        System.out.println(IGCD(x,y));
        System.out.println(GCD(x,y));
    }
}
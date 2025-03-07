import java.util.*;
class ptopowerq
{
    static int power(int p,int q)
    {
        if(q==0) return 1;
        return (power(p,q-1)*p);
    }

    //optimised version
    static int pow(int p, int q)
    {
        if(q==0) return 1;
        int rec=pow(p,q/2);

        if(q%2==0)
        return (rec*rec);
        return (rec*rec*p);
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two numbers ");
        int p=sc.nextInt();
        int q=sc.nextInt();
        System.out.println(power(p,q));
        System.out.println(pow(p,q));
    }
}
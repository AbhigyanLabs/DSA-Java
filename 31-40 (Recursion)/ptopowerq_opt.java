import java.util.*;
class ptopowerq_opt
{
    static int pow(int p, int q)
    {
        if(q==0) return 1;
        int rec=pow(p,q/2);

        if(q%2==0)
        {
            return (rec*rec);
        }
        return (rec*rec*p);
    }

    public static void main(String[] args)
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter the digit and the power");
        int p=sc.nextInt();
        int q=sc.nextInt();
        System.out.println(pow(p,q));
    }
}
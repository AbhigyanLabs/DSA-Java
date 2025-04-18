import java.util.*;
class sum_of_series
{
    static int nsos(int n)
    {
        if(n==0) return 0;
        int temp = nsos(n-1);
        return (n+temp);
    }
    static int sos(int n)
    {
        if(n==0) return 0;
        if(n%2==0)
        return sos(n-1)-n;
        return sos(n-1)+n;
    }
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the limit ");
        int n=sc.nextInt();
        System.out.println(sos(n));
        System.out.println(nsos(n));
    }
}
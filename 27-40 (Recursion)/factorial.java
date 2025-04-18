import java.util.*;
class factorial
{
    static int fact(int n)
    {
        if(n==0) return 1;

    //     int smallans = fact(n-1);
    //     int ans=n*smallans;
    //     return ans;
    //     Better approach
        return n*fact(n-1);
    }

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        int a=fact(n);
        System.out.print("Factorial is "+fact(n));
    }
}
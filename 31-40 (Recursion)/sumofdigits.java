import java.util.*;
class sumofdigits
{
    static int sumofdigits(int n)
    {
        if(n<10 && n>=0) return n;
        return sumofdigits(n/10)+n%10;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number ");
        int n=sc.nextInt();
        System.out.println(sumofdigits(n));
    }
}
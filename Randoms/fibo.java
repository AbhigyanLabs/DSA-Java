import java.util.*;
class fibo
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=0;
        int b=1;
        int count=1;

        while(count<n)
        {
            int temp=a+b;
            a=b;
            b=temp;
            count++;
        }
        System.out.println("The "+n+"th Fibo no is "+b);
    }
}
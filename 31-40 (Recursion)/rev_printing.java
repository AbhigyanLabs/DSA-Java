import java.util.*;
public class rev_printing
{
    static void rev(int n)
    {
        if(n==1)
        {
            System.out.print(n);
            return;
        }
        System.out.print(n+" ");
        rev(n-1);5
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the limit");
        int n=sc.nextInt();
        rev(n);
    }
}
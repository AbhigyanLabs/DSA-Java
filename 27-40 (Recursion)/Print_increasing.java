import java.util.*;
public class Print_increasing
{
    static void printinc(int n)
        {
            if(n==1)
            {
                System.out.print(n+" ");
                return;
            }
            printinc(n-1);
            System.out.print(n+" ");
        }
    static void print decreasing(int n)
    {
        // homework
    }

    public static void main(String[] args)
        {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the number");
            int n=sc.nextInt();
            printinc(n);
        }
}
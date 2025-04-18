import java.util.*;
public class queries
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n=sc.nextInt();
        System.out.println("Enter the elements of the array");
        int[] arr=new int[n];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the number of queries");
        int q=sc.nextInt();
        int count=0;
        for(int i=0;i<q;i++)
        {
            System.out.println("Enter the number to be searched");
            int num=sc.nextInt();
            for(int j=0;j<arr.length;j++)
            {
                if(arr[j] == num)
                {
                    count=count++;
                }
            }
            if(count>0)
            {
                System.out.println("YES");
            }
            else
            {
                System.out.println("NO");
            }
        }
    }
}fixloop
import java.util.*;
public class equalpartition 
{
    static int tsum(int[] arr)
    {
        int n=arr.length;
        int sum=0;
        for(int i=0;i<n;i++)
        {
            sum=arr[i]+sum;
        }
        return sum;
    }

    static boolean prefixsum(int arr[])
    {
        int n=arr.length;
        int totalsum=tsum(arr);
        int prefixsum=0;
        for(int i=0;i<n;i++)
        {
            prefixsum+=arr[i];
            int sufixsum=totalsum-prefixsum;

            if(prefixsum==sufixsum)
            {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n=sc.nextInt();
        System.out.println("Enter the elements of the array");
        int [] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Equal partition possible- "+prefixsum(arr));
    }
}
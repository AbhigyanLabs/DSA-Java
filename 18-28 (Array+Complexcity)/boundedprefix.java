import java.util.*;
public class boundedprefix
{
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n=sc.nextInt();
        System.out.println("Enter the elements of the array");
        int arr[]=new int[n+1];
        for(int i=1;i<=n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the number of queries");
        int q=sc.nextInt();

        //Prefix sum array
        for(int i=2;i<=n;i++)
        {
            arr[i]=arr[i-1]+arr[i];
        }
        int ans=0;
        // System.out.println("The prefix array is ");
        // for(int i=0;i<=n;i++)
        // {
        //     System.out.print(arr[i]+" ");
        // }
        System.out.println();
        while(q>0)
        {
            System.out.println("Enter the range ");
            int a=sc.nextInt();
            int b=sc.nextInt();
            ans=arr[b]-arr[a-1];
            System.out.println("The answer is "+ans);
            q--;
        }
    }   
}
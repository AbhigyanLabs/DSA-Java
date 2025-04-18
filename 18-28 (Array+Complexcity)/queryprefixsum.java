import java.util.*;
class queryprefixsum
{
    static int[] prefixsum(int arr[])
    {
        for(int i=1;i<arr.length;i++)
        {
            arr[i] += arr[i-1];
        }
        return arr;
    }


    public static void main(String[] args)
        {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the size of the array");
            int n=sc.nextInt();
            System.out.println("Enter the elements of the array");
            int [] arr=new int[n+1];
            for(int i=1;i<arr.length;i++)
            {
                arr[i]=sc.nextInt();
            }
            
            int prefsum[]= prefixsum(arr);
            
            System.out.println("Enter the number of queries ");
            int q=sc.nextInt();
            
            while(q>0)
            {
                System.out.println("Enter the range ");
                int s=sc.nextInt();
                int e=sc.nextInt();

                int ans=prefsum[e] - prefsum[s-1];
                System.out.println("sum is 1 "+ans);
        
                q--;
            }
        }
    }
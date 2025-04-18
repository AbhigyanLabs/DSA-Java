import java.util.*;
class subsetsum
{
    static void subsetsum(int[] arr,int n,int idx,int sum)
    {
        if(idx>=n)
        {
        System.out.println(sum);
        return;
        }
        int curr=arr[idx];
        subsetsum(arr,n,idx+1,sum+curr);
        subsetsum(arr,n,idx+1,sum);
    }

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int sum=0;
        subsetsum(arr,n,0,sum);
    }
}
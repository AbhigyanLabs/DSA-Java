import java.util.*;
public class sort0and1
{
    static void swap(int arr[],int i,int j)
    {
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n=sc.nextInt();
        System.out.println("Enter the elements of the array");
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int left=0;
        int right=n-1;
        while(left<right)
        {
            if(arr[left]==1 && arr[right]==0)
            {
                swap(arr,left,right);
            }
            if(arr[left]==0)
            {
                left++;
            }
            if(arr[right]==1)
            {
                right--;
            }
            System.out.println("The sorted array is");
            for(int i=0;i<n;i++)
            {
                System.out.println(arr[i]);
            }
        }
    }
}
//This program only accepts 0 and 1 as input.
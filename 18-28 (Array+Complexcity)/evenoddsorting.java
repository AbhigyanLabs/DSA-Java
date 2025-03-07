import java.util.*;
public class evenoddsorting
{
    static void swap(int [] arr,int left,int right)
    {
        int temp=arr[left];
        arr[left]=arr[right];
        arr[right]=temp;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter the size of the array ");
        int n=sc.nextInt();
        System.out.println("Enter the elements of the array ");
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        int left=0;
        int right=n-1;
        for(int i=0;i<arr.length;i++)
        {
            if(left<right)
            {
                if(arr[right]%2==0 && arr[left]%2!=0)
                {
                    swap(arr,left,right);
                    left++;
                    right--;
                }
                if(arr[right]%2!=0)
                {
                    right--;
                }
                if(arr[left]%2==0)
                {
                    left++;
                }
            }
        }
        System.out.println("The sorted array is ");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
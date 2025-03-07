import java.util.*;
class test
{
    static void swap(int arr[] ,int a,int b)
    {
        int temp=arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    static void sort012(int arr[])
    {
        int lo=0;
        int mid=0;
        int hi=arr.length-1;
        while(mid <= hi)
        {
            if(arr[mid]==0)
            {
                swap(arr,lo,mid);
                lo++;
                mid++;
            }
            else if(arr[mid]==1)
            {
                mid++;
            }
            else
            {
                swap(arr,mid,hi);
                hi--;
            }
        }
    }

    public static void main(String[] args)
        {
            Scanner sc=new Scanner(System.in);
            System.out.print("Enter the array");
            int n=sc.nextInt();
            int []arr=new int[n];
            for (int i=0; i<n; i++)
            {
                arr[i]=sc.nextInt();
            }
            sort012(arr);
            System.out.println("The sorted array is ");
            System.out.print(Arrays.toString(arr)+" ");
        }
}
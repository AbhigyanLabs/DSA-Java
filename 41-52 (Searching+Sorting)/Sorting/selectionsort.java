import java.util.*;
class selectionsort
{
    static void sort(int arr[])
        {
            for(int i=0;i<arr.length-1;i++)
            {
                int minidx=i;
                for(int j=i+1; j<arr.length; j++)
                {
                    if(arr[j]<arr[minidx])
                    {
                        minidx=j;
                    }
                }
                int temp=arr[i];
                arr[i]=arr[minidx];
                arr[minidx]=temp;
            }
        }

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the array ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0; i<n; i++)
        {
            arr[i]=sc.nextInt();
        }
        sort(arr);
        for (int i=0; i<n; i++)
        {
            System.out.print(arr[i]+" ");
        }
        //System.out.print(Arrays.toString(arr));            (A better way to print answer)
    }
}
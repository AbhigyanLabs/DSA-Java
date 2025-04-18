import java.util.*;
class swapsort
{
    static void sort(int arr[])
    {
        int n=arr.length;
        int x=-1;
        int y=-1;
        for(int i=1;i<n;i++)
        {
            if(arr[i] < arr[i-1])
            {
                if(x == -1)
                {
                    x=i-1;
                    y=i;
                }
                else
                {
                    y=i;
                }
            }
        }
        int temp=arr[x];
        arr[x]=arr[y];
        arr[y]=temp;
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
        sort(arr);
        System.out.println("The sorted array is ");
        System.out.print(Arrays.toString(arr)+" ");
    }
}
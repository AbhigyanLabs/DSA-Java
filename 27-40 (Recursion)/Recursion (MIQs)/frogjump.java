import java.util.*;
class frogjump
{
    static int best(int[] arr,int n,int idx)
    {
        if(idx==n-1) return 0;
        int opt1=best(arr,n,idx+1)+Math.abs(arr[idx+1]-arr[idx]);
        if(idx==n-2) return opt1;
        int opt2=best(arr,n,idx+2)+Math.abs(arr[idx+2]-arr[idx]);

        return Math.min(opt1,opt2);
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.print("The best route is "+best(arr,n,0));
    }
}
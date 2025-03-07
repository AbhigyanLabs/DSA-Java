import java.util.*;
class posnegsort
{
    static void partition(int arr[])
    {
        int st=0;
        int end=arr.length-1;
        while(st<end)
        {
            while(arr[st]<0 && st<end) st++;               //imp
            while(arr[end]>=0 && end>st) end--;            //imp
                if(st<end)
                {
                    int temp=arr[st];
                    arr[st]=arr[end];
                    arr[end]=temp;
                }
                st++;
                end--;
        }
        System.out.print(Arrays.toString(arr));
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
        partition(arr);
        // System.out.print(Arrays.toString(arr));
    }
}
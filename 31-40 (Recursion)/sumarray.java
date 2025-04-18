import java.util.*;
class sumarray
{
    static int sum(int arr[],int idx)
    {
        //base case
        if(idx==arr.length) return 0;    //better aporach
        //if(idx==arr.length-1) return arr[idx];
       // if(idx==0) return 0;
       
        //subproblem
        int smallans=sum(arr,idx+1);           //y we need to store the ans os fun here
        //self work
        return arr[idx]+smallans;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the elements ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.print("Sum is "+sum(arr,0));
    }
}
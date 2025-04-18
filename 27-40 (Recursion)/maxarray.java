import java.util.*;
class maxarray
{
    static int max(int arr[],int idx)
    {
        //base case
        if(idx==arr.length-1) return arr[idx];
        //subproblem
        int smallans=max(arr,idx+1);
        //Self work
        return Math.max(arr[idx],smallans);
    }
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number ");
        int idx=sc.nextInt();
        int[] arr=new int[idx];
        for(int i=0;i<idx;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.print(max(arr,0));
    }
}
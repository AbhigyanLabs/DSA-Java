import java.util.*;
class printind
{

    static void findindexes(int arr[], int n, int target, int idx)
    {
        if(idx == arr.length) return ;
        if(target == arr[idx])
        System.out.print(idx+" ");
        findindexes(arr,n,target,idx+1);
    }

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0; i < n; i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.print("Enter the target");
        int target=sc.nextInt();
        findindexes(arr,n,target,0);
    }
}
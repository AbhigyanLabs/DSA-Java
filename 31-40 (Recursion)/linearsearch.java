import java.util.*;
class linearsearch
{

    static int ls(int arr[], int n, int target, int idx)
    {
        if(idx == arr.length) return -1;
        if(target == arr[idx]) return idx;
        return ls(arr,n,target,idx+1);
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
        int ind=ls(arr,n,target,0)+1;
        if(ls(arr,n,target,0) >= 0)
        {
            System.out.println("Element found "+ ind);
        }
        else
        System.out.print("Element not present");
    }


                                //above code will return ind also.
                                //whereas below code only returns true and false.


    // static boolean ls(int arr[], int n, int target, int idx)
    // {
    //     if(idx == arr.length) return false;
    //     if(target == arr[idx]) return true;
    //     return ls(arr,n,target,idx+1);
    // }
    // public static void main(String[] args)
    // {
    //     Scanner sc=new Scanner(System.in);
    //     System.out.print("Enter the array");
    //     int n=sc.nextInt();
    //     int arr[]=new int[n];
    //     for(int i=0; i < n; i++)
    //     {
    //         arr[i]=sc.nextInt();
    //     }
    //     System.out.print("Enter the target");
    //     int target=sc.nextInt();
    //     if(ls(arr,n,target,0))
    //     {
    //         System.out.println("Element found");
    //     }
    //     else
    //     System.out.print("Element not present");
    // }
}
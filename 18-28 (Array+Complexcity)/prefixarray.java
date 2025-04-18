import java.util.*;
public class prefixarray
{
//     static int[] prefix(int arr[])
//     {
//         int n=arr.length;
//         int ans[]=new int[n];
//         ans[0]=arr[0];
//         for(int i=1;i<n;i++)
//         {
//             ans[i]=ans[i-1]+arr[i];
//         }
//         return ans;
//     }
//     public static void main(String[] args)
//     {
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter the size of the array");
//         int n=sc.nextInt();
//         System.out.println("Enter the elements of the array");
//         int [] arr=new int[n];
//         for(int i=0;i<arr.length;i++)
//         {
//             arr[i]=sc.nextInt();
//         }
//         int ans[]=new int[n];
//         ans=prefix(arr);
//         System.out.println("The original array is ");
//         for(int i=0;i<arr.length;i++)
//         {
//             System.out.print(arr[i]+" ");
//         }
//         System.out.println();
//         System.out.println("The prefix array is ");
//         for(int i=0;i<arr.length;i++)
//         {
//             System.out.print(ans[i]+" ");
//         }
//     }
// }



public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n=sc.nextInt();
        System.out.println("Enter the elements of the array");
        int [] arr=new int[n];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=1;i<arr.length;i++)
        {
            arr[i]=arr[i-1]+arr[i];
        }
        System.out.println("The prefix array is ");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
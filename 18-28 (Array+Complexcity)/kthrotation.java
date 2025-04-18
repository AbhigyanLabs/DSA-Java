import java.util.*;
public class kthrotation
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the size of the array");
        int n=sc.nextInt();
        System.out.println("Enter the elements of the array");
        int [] arr=new int[n];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the number of times the array need to be rotated");
        int k=sc.nextInt();
        int [] ans=new int[n];
        
        //Main logic of the problem
        k=k%n;
        int j=0;

        for(int i=n-k;i<n;i++)
        {
            ans[j++]=arr[i];
        }
        for(int i=0;i<(n-k);i++)
        {
            ans[j++]=arr[i];
        
        }
        //Printing the original and the rotated array
        System.out.println("The original array is");
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("The rotated array is");
        for(int i=0;i<n;i++)
        {
        System.out.print(ans[i]+" ");
        }
    }
}
import java.util.*;
class minrotatedarray
{

    static int minelement(int arr[])
    {
        int n=arr.length;
        int st=0, end=n-1;
        int ans=-1;

        while(st<=end)
        {
            int mid=st+(end-st)/2;

            if(arr[mid]<=arr[end])
            {
                ans=mid;
                end=mid-1;
            }
            else
            {
                st=mid+1;
            }
        }
        return ans;
    }
    
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter the array ");
        int n=sc.nextInt();

        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println( minelement(arr));
        // int a[] = {3,4,5,1,2};
        // System.out.println(minelement(a));
    }
}


//This program returns the index of the minimum elemnt in a given rotated array.
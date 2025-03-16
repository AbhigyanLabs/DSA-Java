import java.util.*;
class Binary
{
    static boolean binarysearch(int a[],int target)
    {
        int st=0;
        int end=a.length-1;
        
          while(st <= end){
          int mid = (st + end)/2;
                if(target < a[mid])
                {
                    end=mid-1;
                }
                else if(target > a[mid])
                {
                    st=mid+1;
                }
                else
                {
                    return true;
                }
          }
          return false;
    }

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the array and the no. to be searched ");
        int n=sc.nextInt();
        int []arr=new int[n];
        for (int i=0; i<n; i++)
        {
            arr[i]=sc.nextInt();
        }
        int target=sc.nextInt();
        Arrays.sort(arr);

        if (binarysearch(arr,target))
        {
            System.out.print("Element present");
        }
        else 
        System.out.print("Element not present");
    }
}
import java.util.*;

class targetDuplicateRSA
{
    static int search(int[] arr, int target)
    {
        int n = arr.length;  // Get the length of the array
        int st = 0;          // Start index
        int end = n - 1;     // End index

        while (st <= end) // Continue searching while the range is valid
        {
            int mid = st + (end - st) / 2;  // Calculate the middle index

            if (arr[mid] == target)  // If mid element is the target, return its index
            {
                return mid;
            }

            else if(arr[mid] == arr[st] && arr[mid] == arr[end]) //Ignore the similar elements for comparison
            {
                st++;
                end--;
            }


            // Check which half is sorted
            else if (arr[mid] <= arr[end])  // Right half (mid to end) is sorted
            {
                // If target lies in the sorted right half
                if (target > arr[mid] && target <= arr[end])
                {
                    st = mid + 1;  // Search in the right half
                }
                else
                {
                    end = mid - 1;  // Search in the left half
                }
            }
            else  // Left half (st to mid) is sorted
            {
                // If target lies in the sorted left half
                if (target >= arr[st] && target < arr[mid])
                {
                    end = mid - 1;  // Search in the left half
                }
                else
                {
                    st = mid + 1;  // Search in the right half
                }
            }
        }
        return -1; // If target is not found, return -1
    }







    // static int search(int[] arr, int target)
    // {
    //     int n=arr.length;
    //     int st=0;
    //     int end=n-1;

    //     while(st<=end)
    //     {
    //         int mid=st+(end-st)/2;
    //         if (arr[mid] == target) 
    //         {
    //         return mid;
    //         }

    //         else if (arr[mid]<arr[end])  //end to mid is sorted
    //         {
    //             if(target > arr[mid] && target <= arr[end])
    //             {
    //                 st=mid+1;
    //             }
    //             else
    //             {
    //                 end=mid-1;
    //             }
    //         }

    //         else 
    //             {
    //                 if(target >= arr[st] && target < arr[mid])
    //                 {
    //                     end=mid-1;
    //                 }
    //                 else
    //                 {
    //                     st=mid+1;
    //                 }
    //             }
    //     }
    //     return -1;
    // }



    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the target ");
        int target=sc.nextInt();
        System.out.println("Enter the array ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Target present statement is "+ search(arr,target));
    }
}
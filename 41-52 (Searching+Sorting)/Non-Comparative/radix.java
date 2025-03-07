import java.util.*;
class radix
{
    static int max(int arr[])
    {
        int max=arr[0];
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }
        }
        return max;
    }

    static void countsort(int arr[],int place)
    {
        int n=arr.length;
        int [] output=new int[n];
        int [] count=new int[10];
        for(int i=0;i<n;i++)
        {
            count[(arr[i]/place)%10]++;
        }

        for(int i=1;i<10;i++)
        {
            count[i]=count[i]+count[i-1];
        }

        for(int i=n-1;i>=0;i--)
        {
            int idx=count[(arr[i]/place)%10]-1;
            output[idx]=arr[i];
            count[(arr[i]/place)%10]--;
        }

        for(int i=0;i<n;i++)
        {
            arr[i]=output[i];
        }
    }

    static void radix(int arr[])
    {
        int max=max(arr);
        for(int place=1;max/place>0;place*=10)
        {
            countsort(arr,place);
        }
    }

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        radix(arr);
        System.out.print(Arrays.toString(arr));
    }
}










// import java.util.*;

// class radix {
    
//     // Method to get the maximum value in the array
//     static int max(int arr[]) {
//         int max = arr[0];
//         for (int i = 1; i < arr.length; i++) {
//             if (arr[i] > max) {
//                 max = arr[i];
//             }
//         }
//         return max;
//     }

//     // Counting Sort based on the digit represented by `place`
//     static void countsort(int arr[], int place) {
//         int n = arr.length;
//         int[] output = new int[n];  // output array to store sorted values
//         int[] count = new int[10];  // count array for digit frequency (0-9)

//         // Store the count of occurrences of each digit
//         for (int i = 0; i < n; i++) {
//             count[(arr[i] / place) % 10]++;
//         }

//         // Accumulate the count array
//         for (int i = 1; i < 10; i++) {  // Loop through 0-9
//             count[i] += count[i - 1];
//         }

//         // Build the output array using the count array
//         for (int i = n - 1; i >= 0; i--) {
//             int idx = count[(arr[i] / place) % 10] - 1;
//             output[idx] = arr[i];
//             count[(arr[i] / place) % 10]--;
//         }

//         // Copy the output array back into the original array
//         for (int i = 0; i < n; i++) {
//             arr[i] = output[i];
//         }
//     }

//     // Main Radix Sort method
//     static void radix(int arr[]) {
//         int max = max(arr);  // Get the maximum value to determine the number of places
//         // Perform counting sort for every digit (place: units, tens, hundreds, etc.)
//         for (int place = 1; max / place > 0; place *= 10) {
//             countsort(arr, place);
//         }
//     }

//     // Main method to handle user input and call the radix sort
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         // Input array
//         System.out.println("Enter the number of elements in the array:");
//         int n = sc.nextInt();
//         int[] arr = new int[n];

//         System.out.println("Enter the elements:");
//         for (int i = 0; i < n; i++) {
//             arr[i] = sc.nextInt();
//         }

//         // Perform radix sort
//         radix(arr);

//         // Output the sorted array
//         System.out.println("Sorted array:");
//         System.out.print(Arrays.toString(arr));
//     }
// }

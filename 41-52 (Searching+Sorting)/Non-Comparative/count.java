import java.util.*;
class count
{
    static int max(int arr[])
    {
        int max=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i] > max)
            {
            max=arr[i];
            }
        }
        return max;
    }
    static void cs(int []arr)
    {
        //Find the size of the count array and create it.
        int n=arr.length;
        int [] output=new int[n];
        int max=max(arr);
        int []count=new int[max+1];
        for(int i=0;i<arr.length;i++)
        {
            count[arr[i]]++; 
        }

        //Convert the count array into the prefix count.
        for(int i=1;i<count.length;i++)
        {
            count[i]=count[i]+count[i-1];
        }

        //Find the index of each element and put it in the output array.
        for(int i=n-1;i>=0;i--)
        {
            int idx=count[arr[i]]-1;
            output[idx]=arr[i];
            count[arr[i]]--;
        }

        //Copy all ele to arr.
        for(int i=0;i<n;i++)
        {
            arr[i]=output[i];
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
        cs(arr);
        System.out.print(Arrays.toString(arr));
    }
}
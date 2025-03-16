import java.util.*;
class quicksort
{
    static void swap(int [] arr,int i,int j)
    {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

    static int partition(int[] arr,int st,int end)
    {
        //Take pivot idx and place it at correct position.
        int pivot=arr[st];
        int count=0;
        for(int i=st+1;i<=end;i++) 
        {
            if(arr[i]<pivot)
            {
                count++;
            }
        }
        int pividx=st+count;
        swap(arr ,pividx ,st);

        //Sort the left and right of the array.
        int i=st;
        int j=end;
        while(i<pividx && j>pividx)
        {
            while(arr[i]<=pivot && i<pividx) i++;
            while(arr[j]>pivot && i<pividx) j--;
            if(i<pividx && j>pividx)
            {
                swap(arr,i,j);
            }
        }
        return pividx;
    }

    static void quicksort(int[] arr,int st,int end)
    {
        if(st>=end) return;
        int pi=partition(arr,st,end);      // variable pi give us the array with pivot element at correct
        quicksort(arr,st,pi-1);            //  postion and smaller eles at left and bigger eles at right*/
        quicksort(arr,pi+1,end);

    }

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the array to be sorted");
        int n=sc.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("The array before sorting is "+Arrays.toString(arr));
        quicksort(arr, 0, n-1);
        System.out.println("The sorted array is "+Arrays.toString(arr));      
    }
}


//3 main steps are 1-partition 2-dividing and sorting 3-swap
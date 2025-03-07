import java.util.*;
class mergesort
{

    static void merge(int [] arr, int l, int mid, int r)
    {
        int n1=mid-l+1;
        int n2=r-mid;

        int [] left=new int[n1];
        int [] right=new int[n2];

        for(int i=0;i<n1;i++) left[i]=arr[l+i];
        for(int j=0;j<n2;j++) right[j]=arr[mid+1+j];

        
        int i=0,j=0,k=l;

        while(i<n1 && j<n2)
        {
            if(left[i]<=right[j])
            {
                arr[k]=left[i];
                i++;
            }
            else
            {
                arr[k]=right[j];
                j++;
            }
            k++;
        }

        //copying the remaining elements
        while(i<n1)
        {
            arr[k]=left[i];
            k++;
            i++;
        }

        while(j<n2)
        {
            arr[k]=right[j];
            k++;
            j++;
        }
    }

        static void mergesort(int arr[],int l, int r)
        {
            if(l>=r) return;
            int mid=(l+r)/2;
            mergesort(arr,l,mid);
            mergesort(arr,mid+1,r);
            merge(arr,l,mid,r);
        }

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the array to be sorted ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("the array before sorting is "+Arrays.toString(arr));
        mergesort(arr,0,arr.length-1);
        System.out.println("The sorted array is ");
        System.out.print(Arrays.toString(arr)+" ");
    }
}